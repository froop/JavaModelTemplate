package base.transfer.value;

import java.util.Objects;

public class StringValue {
	private final String value;

	public StringValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return Objects.toString(value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(value, obj);
	}
}
