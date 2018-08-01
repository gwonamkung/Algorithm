package sort;

public class Sort_Merge {
    public static int[] result;

    public static void main(String[] args) {
        int[] A = new int[6];
        result = new int[A.length];
        for (int i = 0; i < A.length; i++) A[i] = (int) Math.round(Math.random() * 100);
        for (int items : A) System.out.print(items + " ");
        merge_sort(A, 0, A.length - 1);
        System.out.println();
        for (int items : A) System.out.print(items + " ");
    }

    public static void merge_sort(int[] A, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            System.out.println("\nq: " + mid);
            merge_sort(A, start, mid);
            merge_sort(A, mid + 1, end);
            merge(A, start, end);
        }
    }


    //합병
    public static void merge(int[] A, int start, int end) {
        int mid = (start + end) / 2;
        int left = start, right = end, m = mid + 1, k = start;
        while (left <= mid && m <= right) {
            if (A[left] <= A[m]) {
                result[k++] = A[left++];
            } else {
                result[k++] = A[m++];
            }
        }
        while (left <= mid) {
            result[k++] = A[left++];
        }
        while (m <= right) {
            result[k++] = A[m++];
        }
    }
}
