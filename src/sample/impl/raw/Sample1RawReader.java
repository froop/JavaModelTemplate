package sample.impl.raw;

import base.impl.raw.RawSingleReader;

public class Sample1RawReader implements RawSingleReader<Sample1RawKey, Sample1RawUnit> {

	@Override
	public Sample1RawUnit read(Sample1RawKey key) {
		Sample1RawUnit res = new Sample1RawUnit();
		// TODO data read
		res.setKey1("k1");
		res.setValue1("v1");
		return res;
	}
}
