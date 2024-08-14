package ca.bytetube.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//http://localhost:8080/login?username=bytetube&password=111111
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        outHTML(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("this is do get");
    }

    private void outHTML(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置request数据的编码集
        request.setCharacterEncoding("UTF-8");
        //1.获取客户端发送来的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //设置response的编码集
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //2.检查用户名，密码是否正确
        if ("bytetube".equals(username) && "111111".equals(password)) {
            out.write("<h1 style=\"color: red; border: 1px solid blue;\">login success</h1>");
            out.write("<ul>");
            out.write(" <li>product1</li>");
            out.write(" <li>product2</li>");
            out.write(" <li>product3</li>");
            out.write("</ul>");
        } else {
            out.write("<h1 style=\"color: red; border: 1px solid blue;\">login failed</h1>");
        }
    }

    private void outPlain(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置request数据的编码集
        request.setCharacterEncoding("UTF-8");
        //1.获取客户端发送来的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //设置response的编码集
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        //2.检查用户名，密码是否正确
        if ("bytetube".equals(username) && "111111".equals(password)) {
            writer.write("登录成功");
        } else {
            writer.write("login failed");
        }
    }

}
