package com.wangqi.sportplay.dao;

import com.wangqi.sportplay.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangqi
 * @version 1.0
 * @date 2021/10/10 15:10
 */
@Repository
public interface UserDao {
    public User getUserByMessage(@Param("username") String username, @Param("password") String password);
    public List<User> getAllUser(@Param("username") String username, @Param("pageStart") int pageStart, @Param("pageSize") int pageSize);
    public int getUserCounts(@Param("username") String username);
    public int updateState(Integer id, Boolean state);
    public int addUser(User user);
    public User getUpdateUser(int id);
    public int editUser(User user);
    public int deleteUser(int id);
}
