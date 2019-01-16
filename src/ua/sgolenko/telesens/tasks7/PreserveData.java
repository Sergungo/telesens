package ua.sgolenko.telesens.tasks7;

public class PreserveData<T> {

    private Object[] arr = {};

    public PreserveData(T... arr) {
        this.arr = arr;
    }

    public PreserveData(int size) {
        arr = new Object[size];
    }

    public int size() {
        return arr.length;
    }

    public T get(int i) {
        return (T) arr[i];
    }

    public void set(int i, T t) {
        arr[i] = t;
    }

    public void addItem(T t) {
        Object[] temp = new Object[arr.length + 1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
        arr[arr.length - 1] = t;
    }

    /* Removes element from array */
    public void removeItem(T t) {

        for (int i = 0; i < arr.length; i++) {
            if (t.equals(arr[i])) {
                removeItem(i);
                i--;
            }
        }

    }

    public void removeItem(int index) {
        if (index < 0 || index >= arr.length) {
            return;
        }
        Object[] temp = new Object[arr.length - 1];
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, arr.length - index - 1);
        arr = temp;
    }

    /* Adds new array */
    public Object[] addArray(T[] js) {

        Object[] temp = new Object[arr.length + js.length];

        System.arraycopy(arr, 0, temp, 0, arr.length);

        int temp_count = 0;

        for (int i = arr.length; i < temp.length; i++) {
            temp[i] = js[temp_count];
            temp_count++;
        }
        arr = temp;
        return arr;
    }

    public void printAll() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        PreserveData<String> c = new PreserveData<>("1", "2", "2", "5", "9");

        String[] str = new String[3];
        c.addArray(new String[]{"5", "4", "2"});
        c.printAll();
        c.removeItem("2");
        c.printAll();
    }

}
