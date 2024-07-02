package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ficha;
import service.UsuariosService;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuariosService service=new UsuariosService();
		RequestDispatcher dispatcher;
		if(service.autenticar(request.getParameter("usuario"), 
				request.getParameter("password"))) {
			Ficha ficha=service.fichaUsuario(request.getParameter("usuario"));
			request.setAttribute("ficha", ficha);
			crearCookie(response,request.getParameter("usuario"),request.getParameter("remember"));
			//transferimos petición a correcto.jsp
			dispatcher=request.getRequestDispatcher("bienvenida.jsp");
		}else {
			//transferimos petición a error.jsp
			dispatcher=request.getRequestDispatcher("error.jsp");
		}
		dispatcher.forward(request, response);
	}
	private void crearCookie(HttpServletResponse response,String usuario,String remember) {
		Cookie cookie=new Cookie("usuario",usuario );
		if(remember!=null) {
			cookie.setMaxAge(10_000_000);
		}else {
			cookie.setMaxAge(0);
		}
		response.addCookie(cookie);
		
	}

}
