package com.example.servlet;

import com.example.entity.Menu;
import com.example.entity.NewsCenter;
import com.example.entity.School;
import com.example.service.IMenuService;
import com.example.service.INewsCenterService;
import com.example.service.ISchoolService;
import com.example.service.Impl.MenuServiceImpl;
import com.example.service.Impl.NewsCenterServiceImpl;
import com.example.service.Impl.SchoolServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "NewsCenterServlet", value = "/NewsCenter")
public class NewsCenterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        ISchoolService schoolService=new SchoolServiceImpl();
        School school = schoolService.getSchool();
        servletContext.setAttribute("school",school);

        IMenuService menuService=new MenuServiceImpl();
        List<Menu> menu=menuService.getMenu();
        servletContext.setAttribute("menu",menu);

        INewsCenterService newsCenterService=new NewsCenterServiceImpl();
        List<NewsCenter> newsCenter=newsCenterService.getNews();
        servletContext.setAttribute("news",newsCenter);
        request.getRequestDispatcher("/html/news-center.jsp").forward(request,response);
    }
}
