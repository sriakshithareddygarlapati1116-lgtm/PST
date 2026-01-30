public class MaximumElement {
   public static void main(String[] args) {
        int[] arr = {10, 25, 3, 60, 18};
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}
