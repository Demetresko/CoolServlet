package com.epam.lab;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class CoolServlet extends HttpServlet {


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       boolean ajax = "XMLHttpRequest".equals(req.getHeader("X-Requested-With"));
        resp.setContentType("text/html");

        if(ajax){
           resp.getWriter().println("Get");
       } else
       {
           RequestDispatcher rd = req.getRequestDispatcher("WEB-INF\\jsp\\greet.jsp");
           rd.forward(req, resp);
       }


        Cookie[] requestCookies = req.getCookies();
        Cookie counterCookie = null;
        for(Cookie cookie: requestCookies){
            if (cookie.getName().equals("counter")){
                counterCookie = cookie;
                break;
            }
        }


        if (counterCookie != null) {
            Integer number = Integer.parseInt( counterCookie.getValue()) + 1;
            counterCookie.setValue(number.toString());
        } else {
            counterCookie = new Cookie("counter", "1");
        }

        resp.addCookie( counterCookie);

        resp.getWriter().write(counterCookie.getValue());



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("doPost");

        Cookie[] requestCookies = req.getCookies();
        Cookie counterCookie = null;
        for(Cookie cookie: requestCookies){
            if (cookie.getName().equals("counter")){
                counterCookie = cookie;
                break;
            }
        }


        if (counterCookie != null) {
            Integer number = Integer.parseInt( counterCookie.getValue()) + 1;
            counterCookie.setValue(number.toString());
        } else {
            counterCookie = new Cookie("counter", "1");
        }

        resp.addCookie( counterCookie);
        resp.getWriter().write(counterCookie.getValue());
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("doDelete");

        Cookie[] requestCookies = req.getCookies();
        Cookie counterCookie = null;
        for(Cookie cookie: requestCookies){
            if (cookie.getName().equals("counter")){
                counterCookie = cookie;
                break;
            }
        }


        if (counterCookie != null) {
            Integer number = Integer.parseInt( counterCookie.getValue()) + 1;
            counterCookie.setValue(number.toString());
        } else {
            counterCookie = new Cookie("counter", "1");
        }

        resp.addCookie( counterCookie);
        resp.getWriter().write(counterCookie.getValue());



    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("doPut" );

        Cookie[] requestCookies = req.getCookies();
        Cookie counterCookie = null;
        for(Cookie cookie: requestCookies){
            if (cookie.getName().equals("counter")){
                counterCookie = cookie;
                break;
            }
        }


        if (counterCookie != null) {
            Integer number = Integer.parseInt( counterCookie.getValue()) + 1;
            counterCookie.setValue(number.toString());
        } else {
            counterCookie = new Cookie("counter", "1");
        }

        resp.addCookie( counterCookie);
        resp.getWriter().write(counterCookie.getValue());

    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destroy method");
    }
}