package pattern;

public class Pattern1 {
    public static void main(String[] args) {
        // 6x6 stars
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=============================");

        // Numbers 0-5 repeated on each line
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=============================");

        // Row index repeated on each line
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=============================");

        // Uppercase letters A-E repeated on each line
        for (int i = 65; i <= 69; i++) {
            for (int j = 65; j <= 69; j++) {
                System.out.print((char) j + "   ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=============================");

        // Uppercase letters A-E repeated on each line using char loop
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= 'E'; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=============================");

        // Lowercase letters a-e repeated on each line
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((char) (j + 96) + "   ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=============================");

        // Increasing right triangle of stars
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=============================");

        // Decreasing right triangle of stars
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
