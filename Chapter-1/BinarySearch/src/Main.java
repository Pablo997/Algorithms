import static utils.Algorithms.*;

public class Main {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6};
        int[][] b = {{0,1,2,3},
                     {4,5,6,7},
                     {8,9,10,11},
                     {12,13,14,15}};

        maximumValue();
        averageValue();
        copyValues();
        System.out.println(rank(3, a));
        transposition(b);
        System.out.println(exR1(6));
        System.out.println("ln(4) = " + lnFactorial(4));
        System.out.println(rankFactorial(1, a, 0, a.length-1, 0));
    }

}
