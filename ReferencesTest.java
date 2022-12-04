public class ReferencesTest {
    public static void main(String[] args) {
        User newUser = new Manager();
        newUser.setName("Joe");
        Manager newManager = new Manager();
        newManager.setName("Brian");
        newUser.setSalary(2000);
        newManager.setSalary(5000);
        System.out.println(newUser.getBono());

        newManager.login("keyword");
       
    }
}
