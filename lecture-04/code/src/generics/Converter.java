package generics;

/**
 * واجهة عامة: تعد بتابع يحوّل من نوع A إلى نوع B، دون أن تحدد النوعين.
 */
public interface Converter<A, B> {
    B convert(A input);
}
