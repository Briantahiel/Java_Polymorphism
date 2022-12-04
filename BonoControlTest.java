public class BonoControlTest {
    public static void main(String[] args) {
        User user = new Counter();
        user.setSalary(3000);

        Manager manager = new Manager();
        manager.setSalary(5000);

        Counter person = new Counter();
        person.setSalary(7000);
        
        BonoControl controlBono = new BonoControl();
        controlBono.registerSalary(manager);
        controlBono.registerSalary(person);
    }
}
