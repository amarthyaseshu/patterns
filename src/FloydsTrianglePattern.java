public class FloydsTrianglePattern {
    /*

     1
     2 3
     4 5 6
     7 8 9 10

     */
    public static void main(String[] args) {
        int n=4;
        int count=1;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(STR."\{count} ");
                count++;
            }
            System.out.println();
        }
    }
}
