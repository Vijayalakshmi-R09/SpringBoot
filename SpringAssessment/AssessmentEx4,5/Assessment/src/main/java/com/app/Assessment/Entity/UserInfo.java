package com.app.Assessment.Entity;

import javax.persistence.Entity;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.lang.NonNull;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class UserInfo {
    @Id
    @NonNull
    private int userId;

    
    @Column(name = "uname", length = 50)
    @Size(min=5,message = "Usename must have Minimum characters-->5")
    private String userName;

    
    @Column(name = "mail_id",length=50)
    @Email(message = "Invalid Email ")
    @NotBlank(message = "Email field req***")
    private String email;

    @Temporal(value=TemporalType.DATE)
    @Column(name="CREATED_TIME")
    private Date udt=new Date(System.currentTimeMillis());

  
    @Column(name="gender",length=1)
    private String gen;

    public Date getUdt() {
        return udt;
    }

    public void setUdt(Date udt) {
        this.udt = udt;
    }
  

    public String getGen() {
        return gen;
    }
    
    public void setGen(String gen) {
        this.gen = gen;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
