package com.qf.Service;

import com.qf.Dao.Impl.UserDaoImpl;
import com.qf.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> FindAll();
}
