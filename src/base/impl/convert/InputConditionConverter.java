package base.impl.convert;

import base.impl.raw.transfer.RawCondition;
import base.transfer.Condition;

public interface InputConditionConverter<S extends Condition, T extends RawCondition>
		extends Converter<S, T> {
}
