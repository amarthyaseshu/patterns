public class TriangleNumberPattern2 {
    /*

     1
     1 2
     1 2 3
     1 2 3 4

     */
    public static void main(String[] args) {
        int n=4;

        for (int i = n; i >= 1; i--) {
            int count=1;
            for (int j = 0; j <= n-i; j++) {
                System.out.print(STR."\{count} ");
               count++;
            }
            System.out.println();
        }
    }
}
