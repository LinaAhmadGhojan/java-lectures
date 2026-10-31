package generics;

/**
 * يحدد النوعين: يستقبل String ويرجع Integer (طول النص).
 */
public class LengthConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String s) {
        return s.length();
    }
}
