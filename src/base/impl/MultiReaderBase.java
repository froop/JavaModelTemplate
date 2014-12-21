package base.impl;

import java.util.ArrayList;
import java.util.List;

import base.MultiReader;
import base.impl.convert.Converter;
import base.impl.convert.InputConditionConverter;
import base.impl.convert.OutputUnitConverter;
import base.impl.raw.RawMultiReader;
import base.impl.raw.transfer.RawCondition;
import base.impl.raw.transfer.RawUnit;
import base.transfer.Condition;
import base.transfer.Unit;

/**
 * @param <K> Key
 * @param <V> Value
 * @param <RK> Raw Key
 * @param <RV> Raw Value
 */
public abstract class MultiReaderBase<
		K extends Condition, V extends Unit<?>,
		RK extends RawCondition, RV extends RawUnit>
		extends DataReaderBase<K, List<V>, RK, List<RV>>
		implements MultiReader<K, V> {

	public MultiReaderBase(RawMultiReader<RK, RV> rawReader,
			InputConditionConverter<K, RK> inputConverter,
			OutputUnitConverter<RV, V> outputConverter) {
		super(rawReader, inputConverter, new ListConverter<RV, V>(outputConverter));
	}

	private static class ListConverter<S extends RawUnit, T extends Unit<?>>
			implements Converter<List<S>, List<T>> {
		private final OutputUnitConverter<S, T> outputConverter;

		public ListConverter(OutputUnitConverter<S, T> outputConverter) {
			this.outputConverter = outputConverter;
		}

		@Override
		public List<T> convert(List<S> sources) {
			List<T> res = new ArrayList<>();
			for (S src : sources) {
				res.add(outputConverter.convert(src));
			}
			return res;
		}
	}
}
