package com.qf.Dao;

import com.qf.pojo.User;

import java.io.IOException;
import java.util.List;

public interface UserDao {
    public List<User> UserFindAll();
    public User UserFindById(Integer id);
    public boolean UserUpdate(User user);
    public boolean UserAdd(User user);
    public int UserDelete(Integer id);
}
