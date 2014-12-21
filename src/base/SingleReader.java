package base;

import base.transfer.Key;
import base.transfer.Unit;

/**
 * @param <K> Key
 * @param <V> Value
 */
public interface SingleReader<K extends Key, V extends Unit<K>>
		extends DataReader<K, V> {
}
