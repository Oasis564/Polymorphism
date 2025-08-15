public class Main {
    public static void main(String[] args) {
        Account a1 = new Account("John Doe", "ACC123", 1000.0, 200.0);
        a1.display();
        a1.deposit();
        
        System.out.println();
        
        Account a2 = new Account("Jane Smith", "ACC456", 600.0, 200.0);
        a2.withdraw();
        a2.display();
    }
}