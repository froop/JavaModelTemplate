package base;

import base.transfer.Unit;
import base.transfer.ValidateException;

/**
 * @param <V> Value
 */
public interface SingleWriter<V extends Unit<?>> {
	void write(V value) throws ValidateException;
}
