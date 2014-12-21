package base.impl;

import base.DataReader;
import base.impl.convert.Converter;
import base.impl.raw.RawDataReader;
import base.transfer.ValidateException;

/**
 * @param <K> Key
 * @param <V> Value
 * @param <RK> Raw Key
 * @param <RV> Raw Value
 */
public abstract class DataReaderBase<K, V, RK, RV>
		implements DataReader<K, V> {
	private final RawDataReader<RK, RV> rawReader;
	private final Converter<K, RK> inputConverter;
	private final Converter<RV, V> outputConverter;

	public DataReaderBase(RawDataReader<RK, RV> rawReader,
			Converter<K, RK> inputConverter,
			Converter<RV, V> outputConverter) {
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
