package VO;

public class UserVO {
    private int id;
    private String userId;
    private String password;
    private String name;
    private String phone;
    private int point;
    private int isManager;

    public UserVO(int id, String userId, String password, String name, String phone, int point, int isManager){
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.point = point;
        this.isManager = isManager;
    }

    public int getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getPoint() {
        return point;
    }

    public int getIsManager() {
        return isManager;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", point=" + point +
                '}';
    }
}