package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0, second = 1, sum = 0;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(sum);
            if (i == 1)
                sum = i;
            else
                sum = first + second;
            first = second;
            second = sum;
        }
    }
}
