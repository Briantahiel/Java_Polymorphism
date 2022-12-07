public class Client implements UserAuthenticate{
    private String name;
    private String id;
    private String telephone;

    private String keyword;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getTelephone(){
        return telephone;
    }
    public void setTelehone(String telephone){
        this.telephone = telephone;
    }
    public double getBono(){
        return 200;
    }

    public boolean login(String keyString) {
        if(this.keyword == keyString){
            return true;
        }
        return false;
    }
    
    public void setKeyword(String keywordString){
        this.keyword = keywordString;
    }
    
    
}
