class BankAccount {
    private final String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Депозит $" + amount + " успішний. Ваш поточний баланс: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Виведення $" + amount + " успішне. Ваш поточний баланс: $" + balance);
        } else {
            System.out.println("Недостатньо коштів. Не вдалося зняти кошти.");
        }
    }

    public void displayBalance() {
        System.out.println("Поточний баланс у користувача " + accountHolder + ": $" + balance);
    }
}

