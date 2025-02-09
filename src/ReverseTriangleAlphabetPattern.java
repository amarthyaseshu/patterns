public class ReverseTriangleAlphabetPattern {

    /*

        A
        B A
        C B A
        D C B A

     */
    public static void main(String[] args) {
        int n=4;
        int count=65;

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i; j++) {

                System.out.print(STR."\{(char) (count - j)} ");
            }
            count++;
            System.out.println();
        }
    }
    }

