/*
Not working
 */
public class HollowDiamondPattern {
    /*

         *
       *   *
     *       *
   *           *
     *       *
       *   *
         *

     */

    /*
    1st part right logic
    n=4

    j=4
    j=3,5
    j=2,6
    j=1,7

     2nd part left

    i=4, j=2,6
    i=5, j=3,5
    i=6, j=4

     */
    public static void main(String[] args) {
        int n=10;

        int count1=(n*2)-2;
        for (int i = 0; i < (n*2)-1; i++) {

            for (int j = 1; j <=(n*2)-1 ; j++) {
                if(i<=n-1) {
                    if (j == n - i || j == (n + i)) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print("  ");
                    }
                }else{
                    if(j==i-2 ){
                        System.out.print("*" + " ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
