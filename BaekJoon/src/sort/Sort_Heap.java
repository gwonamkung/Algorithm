package sort;

public class Sort_Heap {
    private static int[] arr = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
    private static int i;

    public static void main(String[] args) {
        heap_sort(arr);
        for (int items : arr) System.out.print(items + " ");
    }

    //MAX HEAPIFY 메소드
    public static void heapify(int[] A, int length) {
        int node = length / 2 - 1;
        while (node >= 0) {
            int left = node * 2 + 1;
            int right;
            if (node * 2 + 2 < length) right = node * 2 + 2;
            else right = left;
            if (A[left] >= A[node] || A[right] >= A[node]) {
                if (A[left] >= A[right]) {
                    int temp = A[left];
                    A[left] = A[node];
                    A[node] = temp;
                    if (left <= length / 2 - 1) node = left;
                    else node--;
                } else if (A[right] > A[left]) {
                    int temp = A[right];
                    A[right] = A[node];
                    A[node] = temp;
                    if (right <= length / 2 - 1) node = right;
                    else node--;
                }
            } else node--;
        }
    }

    public static void heap_sort(int[] A) {
        heapify(A, A.length);
        int min = A[A.length - 1];
        i = 0;
        while (A[0] > min) {
            i++;
            int temp = A[0];
            A[0] = A[A.length - i];
            A[A.length - i] = temp;
            heapify(A, A.length - i);
        }
    }
}
