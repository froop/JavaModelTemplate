package base.impl;

import base.SingleReader;
import base.impl.convert.InputKeyConverter;
import base.impl.convert.OutputUnitConverter;
import base.impl.raw.RawSingleReader;
import base.impl.raw.transfer.RawKey;
import base.impl.raw.transfer.RawUnit;
import base.transfer.Key;
import base.transfer.Unit;
import base.transfer.ValidateException;

/**
 * @param <K> Key
 * @param <V> Value
 * @param <RK> Raw Key
 * @param <RV> Raw Value
 */
public abstract class SingleReaderBase<
		K extends Key, V extends Unit<K>,
		RK extends RawKey, RV extends RawUnit>
		implements SingleReader<K, V> {
	private final RawSingleReader<RK, RV> rawReader;
	private final InputKeyConverter<K, RK> inputConverter;
	private final OutputUnitConverter<RV, V> outputConverter;

	public SingleReaderBase(RawSingleReader<RK, RV> rawReader,
			InputKeyConverter<K, RK> inputConverter,
			OutputUnitConverter<RV, V> outputConverter) {
		this.rawReader = rawReader;
		this.inputConverter = inputConverter;
		this.outputConverter = outputConverter;
	}

	@Override
	public V read(K key) throws ValidateException {
		validate(key);
		RK rawIn = inputConverter.convert(key);
		RV rawOut = rawReader.read(rawIn);
		return outputConverter.convert(rawOut);
	}

	protected abstract void validate(K key) throws ValidateException;
}
