package ca.bytetube.web;

import ca.bytetube.bean.Customer;
import ca.bytetube.util.Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取数据
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String height = request.getParameter("height");

        //转成java bean对象
        Customer customer = new Customer();
        customer.setName(name);
        customer.setAge(Integer.valueOf(age));
        customer.setHeight(Double.valueOf(height));
        System.out.println(customer);
        Data.add(customer);




        //2.通过重定向的方式将数据在list页面中显示
        response.sendRedirect("/_02_crm/list");

       // request.getRequestDispatcher("/list").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
