public class StarsTrianglePattern1 {
    /*

   *
   * *
   * * *
   * * * *

    */
    public static void main(String[] args) {
        int n=4;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
