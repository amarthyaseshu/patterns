public class SquareAplhabetPattern {
    /*

    A B C D
    A B C D
    A B C D
    A B C D

     */
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < n; i++) {
            char ch='A';
            for (int j = 1; j <= n; j++) {
                System.out.print(STR."\{ch} ");
                ch++;
            }
            System.out.println();
        }

    }
}
