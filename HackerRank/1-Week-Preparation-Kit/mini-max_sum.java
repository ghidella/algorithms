import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        long max = arr.get(0);
        long min = arr.get(0);
        long sum = arr.get(0);
        for (int i = 1; i < 5; i++) {
            int current = arr.get(i);
            if (current < min) min = current;
            if (current > max) max = current;
            sum += current;
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        Result.miniMaxSum(arr);
        bufferedReader.close();
    }
}
