package com.CEN4010.GeekText;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

    @Service
    public class UserService {
        @Autowired
        private UserRepository userRepository;

        public List<User> getAllUsers() {
            return new ArrayList<>(userRepository.findAll());
        }

        public void addUser(Integer userId, String userName, String userPassword, String userEmail, String userAddress, String userCreditCard) {
            UserRepository.insertUser(userId, userName, userPassword,userEmail,userAddress, userCreditCard);
        }
    }

