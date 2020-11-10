package com.qf.Conntroller;

import com.qf.Service.Impl.UserServiceImpl;
import com.qf.pojo.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/user")
public class UserFindAllConntroller extends BaseConntroller {
    UserServiceImpl userService = new UserServiceImpl();

    public String FindAll(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<User> list = userService.FindAll();
        req.setAttribute("ulist", list);
        return "show";
    }
    public String FindById(HttpServletRequest req,HttpServletResponse resp)throws  Exception{
       String ids= req.getParameter("id");
       int id=Integer.valueOf(ids);
        User byId = userService.findById(id);
        req.setAttribute("user",byId);
        return "update";
    }
    public String update(HttpServletRequest req,HttpServletResponse resp)throws  Exception{
        String ids=req.getParameter("id");
        String names=req.getParameter("usrname");
        names=new String(names.getBytes("iso-8859-1"),"utf-8");
        String pass=req.getParameter("usrpass");
        String genders=req.getParameter("usrgender");
        genders=new String(genders.getBytes("iso-8859-1"),"utf-8");
        String emails=req.getParameter("usremail");
        if(ids.length()>0){
            int id= Integer.valueOf(ids);
            User user=new User();
            user.setUid(id);
            user.setUname(names);
            user.setUpass(pass);
            user.setUgender(genders);
            user.setUemail(emails);
            boolean b = userService.UserUpdate(user);
            if(b){
                return "re:user";
            }
        }else{
            User user=new User();
            user.setUname(names);
            user.setUpass(pass);
            user.setUgender(genders);
            user.setUemail(emails);
            boolean b = userService.UserAdd(user);
            if(b){
                return "re:user";
            }
        }
        return "err";
    }
    public String UserDelete(HttpServletRequest req,HttpServletResponse resp)throws  Exception{
        String ids= req.getParameter("id");
        int id=Integer.valueOf(ids);
        int i = userService.UserDelete(id);
        if(i==1){
            return "re:user"; 
        }
     return "err";
    }
}
