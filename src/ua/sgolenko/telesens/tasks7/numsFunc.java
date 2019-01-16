package ua.sgolenko.telesens.tasks7;

public class numsFunc {

    private Object[] arr = {};

    public static <T extends Number> int findNull(T[] arr) {
        int nullPoint = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].intValue() == 0) {

                    nullPoint = i;
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("no null values found");
        }
        return nullPoint;
    }

    public static <T extends Number> int countNegative(T[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].doubleValue() < 0)
                count++;
        }
        return count;
    }

    public static <E extends Number> int lastNegative(E[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].doubleValue() < 0)
                count = i;
        }
        return count;
    }

    public static void main(String[] args) {
        /*-----------------------------------------------------*/
        Integer[] nums = {2, -1, 4, 0, 12, 4, -4};

        System.out.println(findNull(nums));
        System.out.println(countNegative(nums));
        System.out.println(lastNegative(nums));

        Double[] dbl = {-2.0, 1.0, 0.0, 4.0, -12.0, 4.0, 4.0};
        System.out.println(findNull(dbl));
        System.out.println(countNegative(dbl));
        System.out.println(lastNegative(dbl));
    }

}
