package utils;



public class Algorithms {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else                   return mid;
        }
        return -1;
    }

    public static int dumpRank(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) return 1;
        }
        return -1;
    }


    public static int rankFactorial(int key, int[] a, int lo, int hi, int depth) {
        System.out.println("lo = " + lo);
        System.out.println("hi = " + hi);
        System.out.println("depth = " + depth);
        System.out.println("---------------");

        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo)/2;
        if (key < a[mid]) return rankFactorial(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid]) return rankFactorial(key, a, mid + 1, hi, depth + 1);
        else return mid;


    }

    public static double lnFactorial(double n) {
        if (n == 1) {
            return 0;
        }

        return lnFactorial(n-1) + Math.log(n);
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }

    public static void transposition(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void maximumValue() {
        int[] a = {0,1,2,3,4,5,6};
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("The maximum value of the array is: " + max);
    }

    public static void averageValue() {
        int[] a = {0,1,2,3,4,5,6};
        int average = 0;

        for (int i = 0; i < a.length; i++) {
            average += a[i];
        }
        average/=a.length;

        System.out.println("The average value of the array is: " + average);
    }

    public static void copyValues() {
        int[] a = {0,1,2,3,4,5,6};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }
}
