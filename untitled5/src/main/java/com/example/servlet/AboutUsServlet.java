package com.example.servlet;

import com.example.entity.AboutUs;
import com.example.entity.Img;
import com.example.entity.Menu;
import com.example.entity.School;
import com.example.service.IAboutUsService;
import com.example.service.IImgService;
import com.example.service.IMenuService;
import com.example.service.ISchoolService;
import com.example.service.Impl.AboutUsServiceImpl;
import com.example.service.Impl.ImgServiceImpl;
import com.example.service.Impl.MenuServiceImpl;
import com.example.service.Impl.SchoolServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AboutUsServlet", value = "/AboutUs")
public class AboutUsServlet extends HttpServlet {
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

        IAboutUsService aboutUsService=new AboutUsServiceImpl();
        AboutUs aboutUs= aboutUsService.getMsg();
        servletContext.setAttribute("about",aboutUs);

        IImgService iImgService=new ImgServiceImpl();
        List<Img> imgList = iImgService.getImg();
        servletContext.setAttribute("img",imgList);

        request.getRequestDispatcher("/html/about-us.jsp").forward(request,response);
    }
}
