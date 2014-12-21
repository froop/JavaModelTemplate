package base.impl.raw;

import base.impl.raw.dto.RawKey;
import base.impl.raw.dto.RawUnit;

/**
 * @param <K> Key
 * @param <V> Value
 */
public interface RawSingleReader<K extends RawKey, V extends RawUnit> {
	V read(K key);
}
