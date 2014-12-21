package base.impl;

import base.SingleReader;
import base.impl.convert.InputKeyConverter;
import base.impl.convert.OutputUnitConverter;
import base.impl.raw.RawSingleReader;
import base.impl.raw.transfer.RawKey;
import base.impl.raw.transfer.RawUnit;
import base.transfer.Key;
import base.transfer.Unit;

/**
 * @param <K> Key
 * @param <V> Value
 * @param <RK> Raw Key
 * @param <RV> Raw Value
 */
public abstract class SingleReaderBase<
		K extends Key, V extends Unit<K>,
		RK extends RawKey, RV extends RawUnit>
		extends DataReaderBase<K, V, RK, RV>
		implements SingleReader<K, V> {

	public SingleReaderBase(RawSingleReader<RK, RV> rawReader,
			InputKeyConverter<K, RK> inputConverter,
			OutputUnitConverter<RV, V> outputConverter) {
		super(rawReader, inputConverter, outputConverter);
	}
}
