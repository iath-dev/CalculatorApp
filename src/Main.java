import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("**** Calculator App ****");

        Scanner console = new Scanner(System.in);

        while (true) {
            try {
                showMenu();
                int option = getOption();

                System.out.println("Input first value:\t");
                var opOne = Integer.parseInt(console.nextLine());

                System.out.println("Input second value:\t");
                var opTwo = Integer.parseInt(console.nextLine());

                var result = 0;

                switch (option) {
                    case 1 -> result = opOne + opTwo;
                    case 2 -> result = opOne - opTwo;
                    case 3 -> result = opOne * opTwo;
                    case 4 -> result = opOne / opTwo;
                }

                System.out.println(result + "\t");
            } catch (Exception e) {
                System.out.println("Error:\t" + e.getMessage());
                System.exit(0);
            }

        }

    }

    private static void showMenu() {
        System.out.println("Select an operation:");
        System.out.println("""
                    1 -> Sum.
                    2 -> Min.
                    3 -> Multi.
                    4 -> Divide.
                    5 -> Exit🙋‍♂️
                    """);
    }

    private static int getOption() {
        int operator = Integer.parseInt(scan.nextLine());

        if (operator < 1 || operator >= 5) {
            System.out.println("Bye Bye");
            System.exit(0);
        }

        return operator;
    }
}