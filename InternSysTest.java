public class InternSysTest {
    public static void main(String[] args) {
        InternSys sys = new InternSys();
        Manager manager1 = new Manager();
        Administrator admi = new Administrator();
        sys.authenticate(manager1);
        sys.authenticate(admi);
    }
}
