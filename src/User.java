package com.CEN4010.GeekText;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;
import lombok.Getter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userAddress;
    private String userCreditCard;

    /*

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPassword;
    }

    public void setUserPass(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userName = userAddress;
    }

    public String getUserCreditCard() {
        return userCreditCard;
    }

    public void setUserCreditCard(String userCreditCard) {
        this.userCreditCard = userCreditCard;
    }

     */

}

