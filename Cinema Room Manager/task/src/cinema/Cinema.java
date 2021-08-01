package cinema;



import java.util.Scanner;

public class Cinema {
    private static int totalTickets;
    private static int totalSpace;
    private static int income;
    private static int rows;
    private static int seats;

    public Cinema() {
        totalTickets = 0;
        totalSpace = 0;
        income = 0;
        rows = 0;
        seats = 0;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        textUI(scanner);

    }

    public static void textUI(Scanner scanner) {
        System.out.println("Enter the number of rows:");
        rows = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of seats in each row:");
        seats = Integer.parseInt(scanner.nextLine());

        totalSpace = rows * seats;

        int totalIncome = seats * (rows / 2 * 10 + (rows - rows / 2) * 8);

        String[][] cinema = new String[rows][seats];

        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = "S";
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        while(true) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int expression = Integer.parseInt(scanner.nextLine());

            if (expression == 1) {
                System.out.println("Cinema:");
                System.out.print("  ");
                for (int i = 1; i <= seats; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                for (int i = 0; i < rows; i++) {
                    System.out.print(i + 1 + " ");
                    for (int j = 0; j < seats; j++) {
                        System.out.print(cinema[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            } else if (expression == 2) {
                while (true) {
                    System.out.println("Enter a row number:");
                    int row = Integer.parseInt(scanner.nextLine());

                    System.out.println("Enter a seat number in that row:");
                    int seat = Integer.parseInt(scanner.nextLine());

                    if (row > rows || row < 0 || seat > seats || seat < 0) {
                        System.out.println("Wrong input!");
                        continue;

                    } else if (cinema[row - 1][seat - 1].equals("B")) {
                        System.out.println("That ticket has already been purchased!");
                        continue;
                    }
                    
                    cinema[row - 1][seat - 1] = "B";
                    totalTickets++;


                    System.out.println("Ticket price: ");
                    if (rows * seats <= 60) {
                        System.out.println("$" + 10);
                        income += 10;
                        totalIncome = totalSpace * 10;
                    } else if (row <= rows / 2) {
                        System.out.println("$" + 10);
                        income += 10;
                    } else {
                        System.out.println("$" + 8);
                        income += 8;
                    }
                    System.out.println();
                    break;
                }
            } else if (expression == 3) {
                System.out.printf("Number of purchased tickets: %d%n", totalTickets);
                System.out.printf("Percentage: %.2f%% %n", 1.0 * totalTickets / totalSpace * 100);
                System.out.printf("Current income: $%d%n", income);

                System.out.printf("Total income: $%d%n", totalIncome);
            } else if (expression == 0) {
                break;
            }
        }
    }



}