public class InternSys{

    private String keyword = "keyword";
    
    public boolean authenticate(Administrator admi){
        boolean canLogin = admi.login("keyword");
        if(canLogin){
            System.out.println("You are in!");
            return true;
        }
        else{
            System.out.println("Something went wrong!");
            return false;
        }

    }
    public boolean authenticate(UserAuthenticate manager){
        boolean canLogin = manager.login(keyword);
        if(canLogin){
            System.out.println("You are in!");
            return true;
        }
        else{
            System.out.println("Something went wrong!");
            return false;
        }

    }
}
