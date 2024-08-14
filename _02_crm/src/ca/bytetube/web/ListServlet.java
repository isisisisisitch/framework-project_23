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

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取数据
        List<Customer> customers = Data.getCustomers();

        //2.将数据存在request中
        request.setAttribute("customers", customers);

        //3.将数据转发到list.jsp中，进行数据显示
        request.getRequestDispatcher("/page/list.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
