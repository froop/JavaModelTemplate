package sample.transfer;

import sample.transfer.value.Key1;
import base.transfer.Key;

public class Sample1Key implements Key {
	private final Key1 key1;

	public Sample1Key(Key1 key1) {
		this.key1 = key1;
	}

	public Key1 getKey1() {
		return key1;
	}
}
