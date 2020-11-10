package com.qf.Dao.Impl;

import com.qf.Dao.UserDao;
import com.qf.Util.DBtools;
import com.qf.pojo.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
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

    @Override
    public User UserFindById(Integer id)  {
        String resources="mybatis-config.xml";
        //获取mybatis的配置信息
        InputStream inputStream= null;
        try {
            inputStream = Resources.getResourceAsStream(resources);
            //使用配置信息创建出sqlSession工厂
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession=sqlSessionFactory.openSession();
            UserDao mapper=sqlSession.getMapper(UserDao.class);
            User byId=mapper.UserFindById(id);
            return byId;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean UserUpdate(User user) {
        String resources="mybatis-config.xml";
        //获取mybatis的配置信息
        InputStream inputStream= null;
        try {
            inputStream = Resources.getResourceAsStream(resources);
            //使用配置信息创建出sqlSession工厂
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession=sqlSessionFactory.openSession(true);//将修改提交到数据库中
            UserDao mapper=sqlSession.getMapper(UserDao.class);
            return  mapper.UserUpdate(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean UserAdd(User user) {
        String resources="mybatis-config.xml";
        try {
            //获取mybatis的配置信息
            InputStream inputStream=Resources.getResourceAsStream(resources);
            //使用配置信息创建出sqlSession工厂
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            //加入 true属性，代表默认开启mybatis的提交
            SqlSession sqlSession=sqlSessionFactory.openSession(true);
            UserDao mapper=sqlSession.getMapper(UserDao.class);
            return mapper.UserAdd(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public int UserDelete(Integer id) {
        String resources="mybatis-config.xml";
        try {
            //获取mybatis的配置信息
            InputStream inputStream=Resources.getResourceAsStream(resources);
            //根据配置信息建立sqlSession工厂
            SqlSessionFactory sqlSessionFactory=new  SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession=sqlSessionFactory.openSession(true);
            UserDao mapper=sqlSession.getMapper(UserDao.class);
            return  mapper.UserDelete(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
