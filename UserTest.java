public class UserTest {
    public static void main(String[] args) {
        User dean = new User();
        dean.setName("Dean");
        dean.setId("12345678");
        dean.setSalary(1200);
        System.out.println(dean.getBono());
    }
}
