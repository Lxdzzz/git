package com.qf.Dao.Impl;

import com.qf.Dao.UserDao;
import com.qf.Util.DBtools;
import com.qf.pojo.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    QueryRunner qr =new QueryRunner(DBtools.getDataSource());
    @Override
    public List<User> UserFindAll() {
        String sql="SELECT * FROM USER where uadmin=0";
        try {
            return  qr.query(sql,new BeanListHandler<User>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
