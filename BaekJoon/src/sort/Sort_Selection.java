package sort;

public class Sort_Selection {
    public static int[] sample = new int[10];

    public static void main(String[] args) {
        for (int i = 0; i < sample.length; i++) sample[i] = (int) Math.round(Math.random() * 100);
        for (int items : sample) System.out.print(items + " ");
        System.out.println();
        sample = selection_sort(sample, sample.length);
        for (int items : sample) System.out.print(items + " ");
    }

    public static int[] selection_sort(int[] sample, int size) {
        for (int i = size - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (sample[j] >= sample[i]) {
                    int temp = sample[i];
                    sample[i] = sample[j];
                    sample[j] = temp;
                }
            }
        }
        return sample;
    }
}