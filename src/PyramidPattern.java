public class PyramidPattern {

    /*

         1
       1 2 1
     1 2 3 2 1
   1 2 3 4 3 2 1

     */
    /*
     right triangle logic
     i=0, j=
     i=1, j=5
     i=2, j=5,6
     i=3, j=5,6,7

     */
    public static void main(String[] args) {
       int n=10;
        for (int i = 0; i < n; i++) {
            int numCount1=1;
            int numCount2=i;
            for (int j = 1; j <=(n*2)-1 ; j++) {
                if(j<=n ) {
                    if (j >= n - i) {
                        System.out.print(STR."\{numCount1} ");
                        numCount1++;
                    } else {
                        System.out.print("  ");
                    }
                }else{
                    if( j<=n+(i)){
                        System.out.print(STR."\{numCount2} ");
                        numCount2--;
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }


    }
}
