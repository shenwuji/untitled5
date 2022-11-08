package com.example.servlet;

import com.example.entity.CurriculumCenter;
import com.example.entity.Menu;
import com.example.entity.School;
import com.example.entity.Tutoring;
import com.example.service.ICurriculumCenterService;
import com.example.service.IMenuService;
import com.example.service.ISchoolService;
import com.example.service.ITutoringService;
import com.example.service.Impl.CurriculumCenterServiceImpl;
import com.example.service.Impl.MenuServiceImpl;
import com.example.service.Impl.SchoolServiceImpl;
import com.example.service.Impl.TutoringServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CurriculumCenterServlet", value = "/CurriculumCenter")
public class CurriculumCenterServlet extends HttpServlet {
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

        ITutoringService tutoringService=new TutoringServiceImpl();
        List<Tutoring> tutoring = tutoringService.getTutoring();
        servletContext.setAttribute("tutor",tutoring);

        ICurriculumCenterService curriculumCenterService=new CurriculumCenterServiceImpl();
        List<CurriculumCenter> curriculumCenters = curriculumCenterService.getCurriculum();
        servletContext.setAttribute("curriculum",curriculumCenters);

        request.getRequestDispatcher("/html/curriculum-center.jsp").forward(request,response);
    }
}
