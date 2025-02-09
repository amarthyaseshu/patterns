public class SqNumberContPattern {
    /*

   1 2 3
   4 5 6
   7 8 9

    */
    public static void main(String[] args) {
        int n=3;
        int count=1;
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print(STR."\{count} ");
                count++;
            }
            System.out.println();
        }

    }
}
