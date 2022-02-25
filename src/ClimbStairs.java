import java.util.HashMap;

/***
 * This class finds the numbers of ways in which someone can climb
 * stairs given their are only two possibilities either take 1 step
 * or 2 step at a time. This solution uses the approach of Dynamic
 * programming. Base cases are n=0 or n=1 the number ways will be 1.
 * Uses a hashmap for memoization.
 *
 */
public class ClimbStairs {
    public static int climbStairs(int n) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int ways = 0;

        if (n <= 1) {

            ways = 1;
        }

        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                hm.put(i, 1);

            } else {
                System.out.println("inside here");
                ways = hm.get(i - 1).intValue() + hm.get(i - 2).intValue();
                hm.put(i, ways);
            }

        }
        return ways;

    }

    public static void main(String args[]) {
        int n = climbStairs(2);
        System.out.println(n);
    }
}