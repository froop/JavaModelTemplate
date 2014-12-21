package base.impl.convert;

/**
 * @param <S> Source
 * @param <T> Target
 */
public interface Converter<S, T> {
	T convert(S source);
}
