package base.impl.raw;

/**
 * @param <K> Key
 * @param <V> Value
 */
public interface RawDataReader<K, V> {
	V read(K key);
}
