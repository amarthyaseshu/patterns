public class TriangleNumberPattern {
    /*

     1
     2 2
     3 3 3
     4 4 4 4


     */
    public static void main(String[] args) {
        int n=4;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(STR."\{(n-i) + 1} ");

            }
            System.out.println();
        }
    }
}
