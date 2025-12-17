class Bank {
    double amount;

    // Parameterized constructor
    Bank(double amount) {
        this.amount = amount;
    }

    // Withdraw method
    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount)
                ? "Withdrawal successful"
                : "Insufficient balance";

        System.out.println(message);

        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    // Deposit method
    void deposit(double depositAmount) {
        amount += depositAmount;
    }

    public static void main(String[] args) {
        // Sample input
        Bank b = new Bank(10000);

        b.withdraw(5000);
        b.deposit(5000);

        System.out.println("Available balance: " + b.amount);
    }
}
