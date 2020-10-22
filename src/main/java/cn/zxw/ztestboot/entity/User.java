package cn.zxw.ztestboot.entity;

import java.io.Serializable;

/**
 * @author : ZXW
 * @version : 1.0
 * @date : 2020-10-16 14:38
 * @Description :测试用户
 */
public class User implements Serializable {


    private static final long serialVersionUID = -6325458423835459567L;
    private Integer id;
    private String userName;
    private int userAge;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
