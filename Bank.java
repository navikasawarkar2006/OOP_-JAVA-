class Bank {
    // Final variable (Fixed interest rate, cannot be changed)
    final double interestRate = 7.5;

    // Method to calculate interest for a given amount
    void calculateInterest(double amount) {
        double interest = (amount * interestRate) / 100;
        System.out.println("Amount: " + amount + " | Calculated Interest: " + interest);
    }

    public static void main(String[] args) {
        // Bank object create karna
        Bank myBank = new Bank();

        System.out.println("Fixed Bank Interest Rate: " + myBank.interestRate + "%\n");

        // Calculating interest for different customers
        myBank.calculateInterest(10000.0);
        myBank.calculateInterest(25000.50);
        myBank.calculateInterest(50000.0);
    }
}
