package sort;

public class Sort_Merge {
    public static void main(String[] args) {
       int[] sample = new int[10];
        for (int i = 0; i < sample.length; i++) sample[i] = (int) Math.round(Math.random() * 100);
        for (int items: sample) System.out.print(items + " ");
        merge_sort(sample, 0, sample.length - 1);
        System.out.println( );
        for (int items: sample) System.out.print(items + " ");
    }

    public static void merge_sort(int[] A, int start, int end) {
        if(start<end) {
            int q = (start + end) / 2;
            merge_sort(A, start, q);
            merge_sort(A, q + 1, end);
            merge(A, start, q, end);
        }
    }


    //합병
    public static void merge(int[] A, int start, int middle, int end) {
        int[] result = new int[A.length];
        int i = start, j = middle + 1, k = start;
        while (i <= middle && j <= end) {
            if (A[i] < A[j]) {
                result[k++] = A[i++];
            } else {
                result[k++] = A[j++];
            }
        }
        while (i <= middle) {
            result[k++] = A[i++];
        }
        while (j <= end) {
            result[k++] = A[j++];
        }
    }
}
