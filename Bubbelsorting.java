public class Bubbelsorting {
    public static void bbule(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 1, 3, 2, 10, 9, 8, 7, 6 };
        int arr[] = { 1, 2, 3, 4, 5 };
        bbule(arr);
        Printarr(arr);
    }
}
