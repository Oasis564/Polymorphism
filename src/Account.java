class Account extends Bank {
    double amt;

    
    Account(String name, String accno, double p, double amt) {
        super(name, accno, p);
        this.amt = amt;
    }

    
    void deposit() {
        p = p + amt;
        System.out.println("Amount Deposited: " + amt);
        System.out.println("Updated Principal: " + p);
    }

   
    void withdraw() {
        if (amt > p) {
            System.out.println("INSUFFICIENT BALANCE");
        } else {
            p = p - amt;
            System.out.println("Amount Withdrawn: " + amt);
            if (p < 500) {
                double penalty = (500 - p) / 10;
                p = p - penalty;
                System.out.println("Penalty Imposed: " + penalty);
            }
            System.out.println("Updated Principal: " + p);
        }
    }

    @Override
    void display() {
        super.display();
        System.out.println("Transaction Amount: " + amt);
    }
}