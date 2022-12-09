public class Administrator extends User implements UserAuthenticate{

    private Authentication util;

    public Administrator(){
        this.util = new Authentication();
    }
    public void setKeyword(String keyword){
        this.util.setKeyword(keyword);
    }
    public boolean login(String keyString){
        return this.util.login(keyString);
    }

    @Override
    public double getBono() {
       return this.getSalary();
    }
    
}
