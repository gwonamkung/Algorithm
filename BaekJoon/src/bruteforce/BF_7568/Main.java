package bruteforce.BF_7568;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static class Person {
        int weight;
        int height;

        private Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }

    private static int[] result;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());
        Person[] arr = new Person[N];
        result = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            arr[i] = new Person(weight, height);
        }

        bf(arr, N);
    }

    private static void bf(Person[] arr, int N) {
        for (int i = 0; i < N; i++) {
            Person person1 = arr[i];
            for (int j = 0; j < N; j++) {
                Person person2 = arr[j];
                if (person1.weight < person2.weight && person1.height < person2.height) result[i]++;
            }
        }
        for(int items: result) System.out.print(items+1 + " ");
        System.out.println();
    }
}
