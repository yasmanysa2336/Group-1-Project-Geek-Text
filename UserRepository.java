package com.CEN4010.GeekText;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {

    List<User> findUserByUserNameIs(String userName);

    @Transactional
    @Query(value = "INSERT INTO users (userId, userName, userPassword,userEmail,userAddress, userCreditCard)"
            + "VALUES (:userId, :userName, :userPassword,:userEmail,:userAddress, :userCreditCard)", nativeQuery = true)
    @Modifying
    static void insertUser(@Param("userId") Integer userId, @Param("userName") String userName,
                           @Param("userPassword") String userPassword,@Param("userEmail") String userEmail,
                           @Param("userAddress")String userAddress,@Param("userCreditCard") String userCard) {

    }
}

