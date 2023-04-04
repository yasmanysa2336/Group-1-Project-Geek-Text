package com.CEN4010.GeekText;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping(path = "/addUser")
    public @ResponseBody String addNewUser(@RequestParam Integer userId, @RequestParam String userName,
                                           @RequestParam String userPassword, @RequestParam String userEmail,
                                           @RequestParam String userAddress,@RequestParam String userCreditCard) {

        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserEmail(userEmail);
        user.setUserAddress(userAddress);
        user.setUserCreditCard(userCreditCard);

        userService.addUser(userId, userName, userPassword,userEmail,userAddress, userCreditCard);

        return "Created New User";
    }
}
