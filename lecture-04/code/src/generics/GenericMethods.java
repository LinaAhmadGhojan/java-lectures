package generics;

/**
 * دوال عامة: كل واحدة لها معامل نوع خاص بها، مكتوب قبل نوع الإرجاع.
 */
public class GenericMethods {

    // تطبع عناصر أي مصفوفة
    static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // تبدّل عنصرين في أي مصفوفة
    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] names = {"Sara", "Omar"};

        printArray(nums);
        swap(nums, 0, 2);
        printArray(nums);

        printArray(names);
        swap(names, 0, 1);
        printArray(names);
    }
}
