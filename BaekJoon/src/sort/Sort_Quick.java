package sort;

public class Sort_Quick {
    public static int[] A;
    public static int q;

    public static void quickSort(int[] A, int start, int end) {
        if (start < end) {
            q = partition(A, start, end);
        }
    }

    public static int partition(int[] A, int start, int end) {
        int i = 0, j = 0;
        int pivot = A[A.length - 1];
        while (j <= end) {
            if (A[j] >= pivot) j++;
            else {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j++;
            }
        }
        int temp = A[i];
        A[i] = pivot;
        A[end] = temp;
        return i;
    }

    public static void main(String[] args) {
        A = new int[6];
        for (int i = 0; i < A.length; i++) A[i] = (int) Math.round(Math.random() * 100);
        for (int items : A) System.out.print(items + " ");
        quickSort(A, 0, 5);
        System.out.println();
        for (int items : A) System.out.print(items + " ");
        System.out.println("\n"+q);
    }
}
