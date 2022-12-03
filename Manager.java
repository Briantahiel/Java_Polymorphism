public class Manager extends User{
    private String keyword;
    public void setKeyword(String keyword){
        this.keyword = keyword;
    }
    public boolean login(String keyString){
        return keyString == "keyword";
    }
    public double getBono(){
        return super.getSalary() + super.getBono();
    }
}
