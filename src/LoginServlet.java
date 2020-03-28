import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import	java.io.PrintWriter;
import java.nio.charset.Charset;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");//设置请求编码方式
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        String html = null;

        if ("admin".equals(name) && "123".equals(password)) {
            //html="<div color:red>login success</div>";
            //服务端页面跳转
            req.getRequestDispatcher("success.html").forward(req, resp);
        }
        else{
            //html="<div color:red>login fail</div>";
            //客户端页面跳转
            resp.sendRedirect("fail.html");
        }

//        resp.setContentType("text/html,Charset=UTF-8");//设置响应编码方式
//        PrintWriter pw = resp.getWriter();
//        pw.println(html);

    }
}
