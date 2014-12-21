package sample.impl;

import sample.Sample1SingleReader;
import sample.impl.convert.Sample1KeyConverter;
import sample.impl.convert.Sample1UnitConverter;
import sample.impl.raw.Sample1RawKey;
import sample.impl.raw.Sample1RawReader;
import sample.impl.raw.Sample1RawUnit;
import sample.transfer.Sample1Key;
import sample.transfer.Sample1Unit;
import base.impl.SingleReaderBase;
import base.transfer.ValidateException;

public class Sample1SingleReaderImpl extends
		SingleReaderBase<Sample1Key, Sample1Unit, Sample1RawKey, Sample1RawUnit>
		implements Sample1SingleReader {

	public Sample1SingleReaderImpl(Sample1RawReader rawReader) {
		super(rawReader, new Sample1KeyConverter(), new Sample1UnitConverter());
	}

	@Override
	protected void validate(Sample1Key key) throws ValidateException {
		// TODO do something
	}
}
