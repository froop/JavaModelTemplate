package base;

import base.transfer.ValidateException;

/**
 * @param <K> Key
 * @param <V> Value
 */
public interface DataReader<K, V> {
	V read(K key) throws ValidateException;
}
