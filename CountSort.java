public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1,2,2,5,5, 4, 3, 7, 8};
        sort(arr);
        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void sort(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int[] freq = new int[max + 1];
        for (int n : arr) {
            freq[n]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (freq[i] > 0) {
                arr[index++] = i;
                freq[i]--;
            }
        }
    }
}
