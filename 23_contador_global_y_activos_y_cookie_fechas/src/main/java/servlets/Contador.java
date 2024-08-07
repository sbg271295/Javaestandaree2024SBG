package servlets;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Contador")
public class Contador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recuperamos el atributo de sesión que contiene el valor del contador.
		//Se incrementa y se vuelve a guardar. Después, trasferimos petición
		//a la página resultado.jsp
		crearCokkie(response);
		int contador=1;
		int global=1;
		HttpSession sesion=request.getSession();
		ServletContext context=request.getServletContext(); 
		Integer activos = (Integer) context.getAttribute("activos");
		//contador personal
		if(sesion.getAttribute("contador")!=null) {
			contador=(Integer)sesion.getAttribute("contador");
			contador++;
		}
		//contador global
		if(context.getAttribute("global")!=null) {
			global=(Integer)context.getAttribute("global");
			global++;
		}
		
		sesion.setAttribute("contador", contador);
		context.setAttribute("global", global);
        request.setAttribute("activos", activos);
		
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}

	private void crearCokkie(HttpServletResponse response) {

		String fechaHora=LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
		Cookie ck=new Cookie("fechaVisita",fechaHora);
		ck.setMaxAge(100_000);
		response.addCookie(ck);
	}
}
