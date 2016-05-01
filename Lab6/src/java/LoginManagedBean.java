/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author rishi
 */
@ManagedBean
@RequestScoped
public class LoginManagedBean {

    /**
     * Creates a new instance of LoginManagedBean
     */
    public LoginManagedBean() {
    }
    
    private String userId;
    private String password;
    private String userName;
    private String message;
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    public String validate(){
        if(this.userId.equals("kl01") && this.password.equals("yoyo")){
            this.userName="Frank Brown";
            return "welcome";
        }else{
            this.message="Wrong UserId and Password";
            return "error";
        }
    }
    
}
