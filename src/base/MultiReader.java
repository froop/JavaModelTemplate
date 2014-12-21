package base;

import java.util.List;

import base.transfer.Condition;
import base.transfer.Unit;

/**
 * @param <K> Key
 * @param <V> Value
 */
public interface MultiReader<K extends Condition, V extends Unit<?>>
		extends DataReader<K, List<V>> {
}
