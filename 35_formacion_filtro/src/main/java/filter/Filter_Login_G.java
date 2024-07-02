package filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

//La clase Filter, tiene 3 metodos siempre;
//doFilter es el equivalente al service;

//Se modifica el /src/webapp/WEB-INF/web.xml para marcar el orden de ejecución,
//
@WebFilter({"/*"})
public class Filter_Login_G extends HttpFilter implements Filter {
 
	public void destroy() {
	
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//recuperamos el atributo de sesion:usuairo;
		String usuario=(String)((HttpServletRequest)request).getSession().getAttribute("usuario");
		String param=request.getParameter("operation");
		//si el atributo de sesion existe, el usuario se autentico
		//y le dejamos pasar.
		if(usuario!=null||(param!=null && param.equals("doLogin"))) {
			chain.doFilter(request, response);
		                  }else{
	    //si lo que quiere es hacer login, habría que dejarle pasar;
	        request.getRequestDispatcher("login.html").forward(request, response);
	                        }
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
