public class AccountTest {
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount(1, 1);
        SavingsAccount sa = new SavingsAccount(2, 2);
        ca.deposit(3000);
        ca.transfer(500, sa);
        System.out.println(ca.getBalance());
        System.out.println(sa.getBalance());
    }
}
