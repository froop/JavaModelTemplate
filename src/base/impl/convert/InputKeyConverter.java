package base.impl.convert;

import base.impl.raw.dto.RawKey;
import base.transfer.Key;

public interface InputKeyConverter<S extends Key, T extends RawKey>
		extends Converter<S, T> {
}
