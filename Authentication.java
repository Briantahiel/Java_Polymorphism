public class Authentication {
    private String keyword;

    public boolean login(String keyword){
        return this.keyword == keyword;
    }
    public void setKeyword(String keyword){
        this.keyword = keyword;
    }
}
