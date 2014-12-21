package base.impl;

import java.util.ArrayList;
import java.util.List;

import base.MultiReader;
import base.impl.convert.InputConditionConverter;
import base.impl.convert.OutputUnitConverter;
import base.impl.raw.RawMultiReader;
import base.impl.raw.transfer.RawCondition;
import base.impl.raw.transfer.RawUnit;
import base.transfer.Condition;
import base.transfer.Unit;
import base.transfer.ValidateException;

/**
 * @param <K> Key
 * @param <V> Value
 * @param <RK> Raw Key
 * @param <RV> Raw Value
 */
public abstract class MultiReaderBase<
		K extends Condition, V extends Unit<?>,
		RK extends RawCondition, RV extends RawUnit>
		implements MultiReader<K, V> {
	private final RawMultiReader<RK, RV> rawReader;
	private final InputConditionConverter<K, RK> inputConverter;
	private final OutputUnitConverter<RV, V> outputConverter;

	public MultiReaderBase(RawMultiReader<RK, RV> rawReader,
			InputConditionConverter<K, RK> inputConverter,
			OutputUnitConverter<RV, V> outputConverter) {
		this.rawReader = rawReader;
		this.inputConverter = inputConverter;
		this.outputConverter = outputConverter;
	}

	@Override
	public List<V> read(K key) throws ValidateException {
		validate(key);
		RK rawIn = inputConverter.convert(key);
		List<RV> rawOut = rawReader.read(rawIn);
		return convertList(rawOut);
	}

	private List<V> convertList(List<RV> sources) {
		List<V> res = new ArrayList<>();
		for (RV src : sources) {
			res.add(outputConverter.convert(src));
		}
		return res;
	}

	protected abstract void validate(K key) throws ValidateException;
}
