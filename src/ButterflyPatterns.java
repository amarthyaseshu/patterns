public class ButterflyPatterns {
    /*

     *             *
     * *         * *
     * * *     * * *
     * * * * * * * *
     * * * * * * * *
     * * *     * * *
     * *         * *
     *             *

     */
    public static void main(String[] args) {
        int n=4;
        int count=n;
        int count2=n;
        for (int i = 1; i <=(n*2); i++) {

            for (int j = 1; j <= n; j++) {
                if (i <= (n+1)) {
                    if (j <= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j <=count) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if (i >= (n+1)) {
                count--;
            }
            for (int k = n; k >= 1; k--) {
                if (i <= (n+1)) {
                    if (k <= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }else{
                    if (k <= count2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if (i >= (n+1)) {
                count2--;
            }
            System.out.println();
        }
    }
}
