class BankingSystem {

    int balance = 5000;

    void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance = balance - amount;
                System.out.println("Balance deducted: " + amount);
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem obj = new BankingSystem();

        // Multiple threads
        Thread t1 = new Thread(() -> obj.withdraw(2000));
        Thread t2 = new Thread(() -> obj.withdraw(2000));
        Thread t3 = new Thread(() -> obj.withdraw(2000));

        t1.start();
        t2.start();
        t3.start();
    }
}
