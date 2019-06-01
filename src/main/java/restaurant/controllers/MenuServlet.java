package restaurant.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import restaurant.Application;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Path;
import java.io.IOException;


@WebServlet(name = "menu", urlPatterns = "/")
public class MenuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("In servlet class");
        resp.getWriter().write("Hello dude!");

    }
    private static Logger logger = LoggerFactory.getLogger(Application.class);
}
