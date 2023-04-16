package com.CEN4010.GeekText;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

    @Service
    public class UserService{
        @Autowired
        private UserRepository userRepository;

        public String getUser(String userName) {
            return findUserByUserNameIs(userName);
        }
        public void addUser(Integer userId, String userName, String userPassword, String userEmail, String userAddress) {
            UserRepository.addNewUser(userId, userName, userPassword,userEmail,userAddress);
        }

        public String findUserByUserNameIs(String userName) {
            return userRepository.findUserByUserNameIs(userName);
        }

        public void addUserCreditCard(Integer userCreditCard) {
            UserRepository.addUserCreditCard(userCreditCard);
        }

        public void updateUser(String userName){
            userRepository.findAll()
        }

    }

