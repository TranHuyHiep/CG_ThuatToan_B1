import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i : arr) {
            pq.add(i);
        }
        int[] arrSum = new int[arr.length];
        for (int i = 0; i < arrSum.length; i++) {

            if (i > 0) {
                arrSum[i] = arrSum[i - 1] + pq.poll();
            } else {
                arrSum[i] = pq.poll() + pq.poll();
            }
        }
        int sum = 0;
        for (int i = 0; i < arrSum.length; i++) {
            sum += arrSum[i];
        }
        System.out.println(sum);


    }
}