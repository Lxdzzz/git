package com.qf.Conntroller;

import com.qf.Service.Impl.UserServiceImpl;
import com.qf.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class UserFindAllConntroller extends BaseConntroller {
    UserServiceImpl userService = new UserServiceImpl();

    public String FindAll(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<User> list = userService.FindAll();
        req.setAttribute("ulist", list);
        return "show";
    }
}
