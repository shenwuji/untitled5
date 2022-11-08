package com.example.servlet;

import com.alibaba.fastjson.JSONObject;
import com.example.entity.Index;
import com.example.entity.Menu;
import com.example.entity.School;
import com.example.service.IIndexService;
import com.example.service.IMenuService;
import com.example.service.ISchoolService;
import com.example.service.Impl.IndexServiceImpl;
import com.example.service.Impl.MenuServiceImpl;
import com.example.service.Impl.SchoolServiceImpl;
import com.example.utils.FileUtils;
import com.mysql.cj.xdevapi.JsonArray;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "IndexServlet", value = "/IndexServlet")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/html/index.jsp").forward(request,response);

    }
}
