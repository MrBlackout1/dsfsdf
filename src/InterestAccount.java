class InterestAccount extends BankAccount {
    private final double interestRate;

    public InterestAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        double interest = amount * interestRate / 100;
        balance += interest;
        System.out.println("Відсоток від поповнення у розмірі $" + interest + " додано. Ваш поточний баланс: $" + balance);
    }
}
