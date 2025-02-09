public class ReverseTrianglePattern {

    /*

        1
        2 1
        3 2 1
        4 3 2 1

     */
    public static void main(String[] args) {
        int n=4;
        int count=1;
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(STR."\{count - j} ");
            }
            count++;
            System.out.println();
        }
    }
    }

