public class Manager extends User implements UserAuthenticate{
    // private String keyword;
    // public void setKeyword(String keyword){
    //     this.keyword = keyword;
    // }
    // public boolean login(String keyString){
    //     return keyString == "keyword";
    // }
    public double getBono(){
        return 2000;
    //     return super.getSalary() + this.getSalary() * 0.05;

}

    @Override
    public void setKeyword(String keyword) {
   
        
    }

    @Override
    public boolean login(String keyString) {
  
        return false;
    }

    // public boolean login(String string) {
    //     return true;
    // }
}