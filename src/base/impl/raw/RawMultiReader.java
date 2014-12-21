package base.impl.raw;

import java.util.List;

import base.impl.raw.transfer.RawCondition;
import base.impl.raw.transfer.RawUnit;

/**
 * @param <K> Key
 * @param <V> Value
 */
public interface RawMultiReader<K extends RawCondition, V extends RawUnit> {
	List<V> read(K key);
}
