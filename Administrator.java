public class Administrator extends User implements UserAuthenticate{

    private String keyword;
    public void setKeyword(String keyword){
        this.keyword = keyword;
    }
    public boolean login(String keyString){
        if(this.keyword == keyString){
            return true;
        }
        return this.keyword == keyString;
    }

    @Override
    public double getBono() {
       return this.getSalary();
    }
    
}
