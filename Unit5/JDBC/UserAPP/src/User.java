public class User {
    private Integer id;
    private String name;
    private String mobileNo;

    public User() {
    }

    public User(Integer id, String name, String mobileNo) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    
    
    
    
    
}
