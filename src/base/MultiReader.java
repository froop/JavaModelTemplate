package base;

import java.util.List;

import base.transfer.Condition;
import base.transfer.Unit;
import base.transfer.ValidateException;

/**
 * @param <K> Key
 * @param <V> Value
 */
public interface MultiReader<K extends Condition, V extends Unit<?>> {
	List<V> read(K key) throws ValidateException;
}
