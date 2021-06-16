package homework6;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    /*2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
    Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
    Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
    Написать набор тестов для этого метода (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

     */

    public List<Integer> fromIntArrayToIntegerArray(int[] arr) {
        Integer[] arr1 = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return Arrays.asList(arr1);
    }

    public boolean checkArrayByOneAndFour(int[] arr) {
        List<Integer> list = fromIntArrayToIntegerArray(arr);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 4 && list.get(i) != 1) return false;
        }
        if (!list.contains(1) & !list.contains(4)) return false;
        return true;
    }

    /*
3. Написать метод, который проверяет состав массива из чисел 1 и 4.
Если в нем нет хоть одной четверки или единицы, то метод вернет false;
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
 */

    public int[] splitByLastFour(int[] arr) {
        List<Integer> list = fromIntArrayToIntegerArray(arr);
        if (!list.contains(4)) throw new RuntimeException("В массиве нет четверки");
        List<Integer> list2 = list.subList((list.lastIndexOf(4) + 1), list.size());
        return list2.stream().mapToInt(i -> i).toArray();
    }
}
