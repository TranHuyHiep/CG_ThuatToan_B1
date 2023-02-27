import java.lang.reflect.Array;
import java.util.*;

public class BupBeNga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k, sum = 0;
        n = scanner.nextInt();
        k = scanner.nextInt();

        Integer []a = new Integer[n];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            q.add(a[i]);

            if(q.peek() - a[i] >= k) {
                q.poll();
            } else {
                sum += a[i];
            }
        }

        System.out.println(q.size() + " " + sum);
    }
}
