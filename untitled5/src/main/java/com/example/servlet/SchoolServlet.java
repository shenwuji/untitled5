package com.example.servlet;

import com.example.entity.Index;
import com.example.entity.Menu;
import com.example.entity.School;
import com.example.service.IIndexService;
import com.example.service.IMenuService;
import com.example.service.ISchoolService;
import com.example.service.Impl.IndexServiceImpl;
import com.example.service.Impl.MenuServiceImpl;
import com.example.service.Impl.SchoolServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SchoolServlet", value = "/index")
public class SchoolServlet extends HttpServlet {
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

        IIndexService indexService=new IndexServiceImpl();
        List<Index> indexList=indexService.getIndex();
        servletContext.setAttribute("index",indexList);

        request.getRequestDispatcher("/html/index.jsp").forward(request,response);




    }
}
