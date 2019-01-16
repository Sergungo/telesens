package ua.sgolenko.telesens.tasks7;

public class limitedTypes {

    public static void addDigitsFromArray(PreserveData<? super Integer> list, Integer[] nums) {

        for (int j = 0; j < nums.length; j++) {
            list.addItem(nums[j].intValue());
        }

    }

    public static void main(String[] args) {
        PreserveData<Integer> digits = new PreserveData<>(8, 9, 1);
        digits.printAll();
        addDigitsFromArray(digits, new Integer[]{5, 4, 2});
        digits.printAll();

        PreserveData<Number> digits2 = new PreserveData(8, 9, 1);
        digits2.printAll();
        addDigitsFromArray(digits, new Integer[]{5, 4, 2});
        digits.printAll();
    }

}
