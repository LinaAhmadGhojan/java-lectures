package restaurant;

/**
 * واجهة: "يمكن إعطاؤه بقشيشاً". كل صف ينفّذها يتعهد أن يعرف كيف يستلم البقشيش.
 */
public interface Tippable {
    void tip(int amount);
}
