package grammar.base;

public class arrayCopy {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        int[] arr2 = copy(arr);
        printArray(arr2);
    }

    public static int[] copy(int[] in) {
        int[] arr = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            arr[i] = in[i];
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
