public class TraingleAlphabetPattern {

    /*

     A
     B B
     C C C
     D D D D


     */
    public static void main(String[] args) {
        int n=4;
        char ch='A';
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(STR."\{ch} ");

            }
            ch++;
            System.out.println();
        }
    }
}
