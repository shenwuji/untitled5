package com.example.servlet;

import com.example.entity.Menu;
import com.example.entity.OnlineBooking;
import com.example.entity.School;
import com.example.service.IMenuService;
import com.example.service.IOnlineBookingService;
import com.example.service.ISchoolService;
import com.example.service.Impl.MenuServiceImpl;
import com.example.service.Impl.OnlineBookingServiceImpl1;
import com.example.service.Impl.SchoolServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "OnlineBookingServlet", value = "/OnlineBooking")
public class OnlineBookingServlet extends HttpServlet {
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

        IOnlineBookingService onlineBookingService=new OnlineBookingServiceImpl1();
        OnlineBooking onlineBooking = onlineBookingService.getOnline();
        servletContext.setAttribute("online",onlineBooking);

        request.getRequestDispatcher("/html/online-booking.jsp").forward(request,response);
    }
}
