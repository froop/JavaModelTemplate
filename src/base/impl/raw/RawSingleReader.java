package base.impl.raw;

import base.impl.raw.transfer.RawKey;
import base.impl.raw.transfer.RawUnit;

/**
 * @param <K> Key
 * @param <V> Value
 */
public interface RawSingleReader<K extends RawKey, V extends RawUnit>
		extends RawDataReader<K, V> {
}
