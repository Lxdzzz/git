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

    @Override
    public User findById(Integer id) {
        return userDao.UserFindById(id);
    }

    @Override
    public boolean UserUpdate(User user) {
        return userDao.UserUpdate(user);
    }

    @Override
    public boolean UserAdd(User user) {
        return userDao.UserAdd(user);
    }

    @Override
    public int UserDelete(Integer id) {
        return userDao.UserDelete(id);
    }
}
