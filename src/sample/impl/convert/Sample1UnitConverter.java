package sample.impl.convert;

import sample.impl.raw.Sample1RawUnit;
import sample.transfer.Sample1Key;
import sample.transfer.Sample1Unit;
import sample.transfer.value.Key1;
import sample.transfer.value.Value1;
import base.impl.convert.OutputUnitConverter;

public class Sample1UnitConverter implements
		OutputUnitConverter<Sample1RawUnit, Sample1Unit> {

	@Override
	public Sample1Unit convert(Sample1RawUnit source) {
		Sample1Key key = new Sample1Key(new Key1(source.getKey1()));
		return new Sample1Unit(key, new Value1(source.getValue1()));
	}
}
