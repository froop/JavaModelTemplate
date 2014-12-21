package base;

import base.transfer.Key;
import base.transfer.Unit;
import base.transfer.ValidateException;

/**
 * @param <K> Key
 * @param <V> Value
 */
public interface SingleReader<K extends Key, V extends Unit<K>> {
	V read(K key) throws ValidateException;
}
