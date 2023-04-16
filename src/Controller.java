package com.CEN4010.GeekText;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(String userName) {
        return userService.findUserByUserNameIs(userName);
    }

    @PostMapping(path = "/addUser")
    public @ResponseBody String addNewUser(@RequestParam Integer userId, @RequestParam String userName,
                                           @RequestParam String userPassword, @RequestParam String userEmail,
                                           @RequestParam String userAddress) {
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserEmail(userEmail);
        user.setUserAddress(userAddress);

        userService.addUser(userId, userName, userPassword, userEmail, userAddress);

        return "New User Was Created";
    }

    @PostMapping(path = "/addUserCreditCard")
    public @ResponseBody String addUserCreditCard(@RequestParam String userName, @RequestParam String userCreditCard) {
        userService.findUserByUserNameIs(userName);
        userService.addUserCreditCard(Integer.valueOf(userCreditCard));

        return "New User Credit Card Added";
    }

    @PutMapping(path = "/updateUser")
    public @ResponseBody String updateUser(@RequestParam Integer userId, @RequestParam String userName,
                                           @RequestParam String userPassword, @RequestParam String userAddress) {
        userService.updateUser(userName);
        return "User Updated Successfully";
    }
}

