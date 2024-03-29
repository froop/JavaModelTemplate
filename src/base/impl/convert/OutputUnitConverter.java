package base.impl.convert;

import base.impl.raw.transfer.RawUnit;
import base.transfer.Unit;

public interface OutputUnitConverter<S extends RawUnit, T extends Unit<?>>
		extends Converter<S, T> {
}
