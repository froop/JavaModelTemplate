package sample.transfer;

import sample.transfer.value.Value1;
import base.transfer.Unit;

public class Sample1Unit implements Unit<Sample1Key> {
	private final Sample1Key key;
	private final Value1 value1;

	public Sample1Unit(Sample1Key key, Value1 value1) {
		this.key = key;
		this.value1 = value1;
	}

	@Override
	public Sample1Key getKey() {
		return key;
	}

	public Value1 getValue1() {
		return value1;
	}
}
