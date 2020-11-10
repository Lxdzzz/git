package com.qf.Conntroller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseConntroller extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收参数
        String action = req.getParameter("action");
        if (action == null) {
            action = "FindAll";
        }
        //处理业务
        try {
            Method method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);//反射获得当前的类对象
            Object obj = method.invoke(this, req, resp);
            if (obj != null && obj instanceof String) {
                String url = (String) obj;
                //响应服务跳转到指定的页面
                if(url.startsWith("re")){
                    resp.sendRedirect(url.substring(3));
                    return ;
                } 
                req.getRequestDispatcher(url+".jsp").forward(req,resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
