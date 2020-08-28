package cn.edu.guet.mapper;

import cn.edu.guet.model.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {
   /* User viewUser(@Param("username") String username, @Param("password") String password,@Param("userId") String userId
    ,@Param("phone") String phone,@Param("email") String email);*/
   User login(@Param("username") String username, @Param("password") String password);
   User viewUserById(String userId);
   void updateUser(User user) throws Exception;


}