public class InvertedTrianglePattern {

    /*

    1 1 1 1
      2 2 2
        3 3
          4

     */
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j<i){
                    System.out.print("  ");
                }else {
                    System.out.print(STR."\{i} ");
                }
            }
            System.out.println();
        }

    }
}
