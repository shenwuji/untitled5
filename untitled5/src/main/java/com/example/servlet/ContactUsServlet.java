package com.example.servlet;

import com.example.entity.ContactUs;
import com.example.entity.Img;
import com.example.entity.Menu;
import com.example.entity.School;
import com.example.service.IContactUsService;
import com.example.service.IImgService;
import com.example.service.IMenuService;
import com.example.service.ISchoolService;
import com.example.service.Impl.ContactUsServiceImpl;
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

@WebServlet(name = "ContactUs", value = "/ContactUs")
public class ContactUsServlet extends HttpServlet {
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

        IContactUsService contactUsService=new ContactUsServiceImpl();
        List<ContactUs> contactUs = contactUsService.getContactUs();
        servletContext.setAttribute("contact",contactUs);

        IImgService iImgService=new ImgServiceImpl();
        List<Img> imgList = iImgService.getImg();
        servletContext.setAttribute("img",imgList);

        request.getRequestDispatcher("/html/contact-us.jsp").forward(request,response);
    }
}
