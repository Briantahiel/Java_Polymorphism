public class ManagerTest {
    public static void main(String[] args) {
        Manager john = new Manager();
        // john.setName("John");
        // john.setSalary(1800);

        // User john = new User();
        john.setSalary(1800);
        john.setKeyword("keyword");
        // john.setType(0);
        System.out.println(john.login("keyword"));
        // System.out.println(john.getBono());
        System.out.println(john.getSalary());
        System.out.println(john.getBono());
    }
}
