class Bank {
    String name;
    String accno;
    double p; 


    Bank(String name, String accno, double p) {
        this.name = name;
        this.accno = accno;
        this.p = p;
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Principal Amount: " + p);
    }
}