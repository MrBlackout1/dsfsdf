import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ваше ім'я: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Введіть початковий баланс: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountHolder, initialBalance);

        System.out.print("Введіть відсоткову ставку для відсоткового рахунку: ");
        double interestRate = scanner.nextDouble();
        InterestAccount interestAccount = new InterestAccount(accountHolder, initialBalance, interestRate);


        // Основний цикл програми
        int choice;
        do {
            System.out.println("\nОберіть потрібну операцію:");
            System.out.println("1. Покласти кошти на звичайний рахунок");
            System.out.println("2. Вивести кошти зі звичайного рахунку");
            System.out.println("3. Показати баланс вашого звичайного рахунку");
            System.out.println("4. Покласти кошти на відсотковий рахунок");
            System.out.println("5. Вивести кошти з відсоткового рахунку");
            System.out.println("6. Показати баланс вашого відсоткового рахунку");
            System.out.println("7. Вихід");
            System.out.print("Введіть № потрібної операції: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Введіть суму для депозиту: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                }
                case 2 -> {
                    System.out.print("Введіть суму для зняття: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                }
                case 3 -> account.displayBalance();

                case 4 -> {
                    System.out.print("Введіть суму для депозиту: ");
                    double interestDepositAmount = scanner.nextDouble();
                    interestAccount.deposit(interestDepositAmount);
                }
                case 5 -> {
                    System.out.print("Введіть суму для зняття: ");
                    double interestWithdrawalAmount = scanner.nextDouble();
                    interestAccount.withdraw(interestWithdrawalAmount);
                }
                case 6 -> interestAccount.displayBalance();

                case 7 -> System.out.println("Вихід з програми. До побачення!");
                default -> System.out.println("Невірний номер операції. Введіть правильний варіант.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
