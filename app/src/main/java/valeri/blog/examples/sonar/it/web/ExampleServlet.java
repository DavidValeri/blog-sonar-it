package valeri.blog.examples.sonar.it.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import valeri.blog.examples.sonar.it.lib.TestableClass;

public class ExampleServlet extends HttpServlet {

    private static final long serialVersionUID = -4860810781468134913L;
    
    private TestableClass testableClass;
    
    public void init() throws javax.servlet.ServletException {
        testableClass = new TestableClass();
    };
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        testableClass.doSomething(false);
        
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.setContentType("text/plain");
        resp.getWriter().write("Welcome to the demo!");
    }
}
