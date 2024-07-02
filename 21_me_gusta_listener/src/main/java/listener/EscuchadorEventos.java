package listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class EscuchadorEventos implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce)  { 
         ServletContext context= sce.getServletContext();
         context.setAttribute("megusta", 0);
         context.setAttribute("nomegusta", 0);
    }

    public void contextDestroyed(ServletContextEvent sce)  { 

    }
	
}
