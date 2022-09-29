package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = Math.max(first, second);
        int min = Math.min(first, second);
        while (max % min != 0) {
            max += max;
        }
        int GCD = first * second / max;
        System.out.println(GCD);
    }
}
