package base;

import base.transfer.Key;
import base.transfer.ValidateException;

/**
 * @param <K> Key
 */
public interface SingleRemover<K extends Key> {
	void remove(K key) throws ValidateException;
}
