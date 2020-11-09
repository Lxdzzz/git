package com.qf.Service.Impl;

import com.qf.Dao.Impl.UserDaoImpl;
import com.qf.Dao.UserDao;
import com.qf.Service.UserService;
import com.qf.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService {
   UserDao userDao= new UserDaoImpl();
    @Override
    public List<User> FindAll() {
        return userDao.UserFindAll();
    }
}
