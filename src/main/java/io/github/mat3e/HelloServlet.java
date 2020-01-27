package io.github.mat3e;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Request got");
        //resp.setContentType("text/html");
        //resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write("Hello world!");
    }
}