package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Modle.Curso;

public class Curso_Service {
	
	 static ArrayList<Curso> cursos;
	
public Curso_Service() {
	
	 cursos=new ArrayList<>();
}

public static void Agregar_Curso(Curso agregas) {
	cursos.add(agregas);
                                             }

public static List<Curso> Filtrar_Precio(Double precio) {
	
	return cursos.stream()
			    .filter(n->n.getPrecio()<=precio)
			    .toList();
	
                                         }

public void Eliminar_Curso_Nombre(String nombre) {

	cursos.removeIf(n->n.getNombre().equals(nombre));
			    
                                                    }

public static void Modificar_Duracion(String nombre, int nuevaDuracion){
	
	cursos.stream()
	      .filter(c->c.getNombre().equals(nombre))
	      .forEach(c->c.setDuracion(nuevaDuracion));

	 
}

}
