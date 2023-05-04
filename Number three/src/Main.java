public class Main {
    public static void main(String[] args) {
        double arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0)
                System.out.print(arr[i] + "  ");
        }
    }
}