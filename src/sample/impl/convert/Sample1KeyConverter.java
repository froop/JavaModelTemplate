package sample.impl.convert;

import sample.impl.raw.Sample1RawKey;
import sample.transfer.Sample1Key;
import base.impl.convert.InputKeyConverter;

public class Sample1KeyConverter implements
		InputKeyConverter<Sample1Key, Sample1RawKey> {

	@Override
	public Sample1RawKey convert(Sample1Key source) {
		Sample1RawKey res = new Sample1RawKey();
		res.setKey1(source.getKey1().toString());
		return res;
	}
}
