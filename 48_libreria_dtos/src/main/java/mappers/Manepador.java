package mappers;

import dhoc.Librodto;
import dhoc.TemaDto;
import model.Libro;
import model.Tema;
import service.LibrosService;

public class Manepador {
	
	public static TemaDto temaEntityToDto(Tema tema) {
		return new TemaDto(tema.getIdTema(),tema.getTema());
		
	}
	public static Librodto libroEntityToDto(Libro libro) {
		var librosService=new LibrosService();
		return new Librodto(libro.getIsbn(),
				            libro.getTitulo(),
				            libro.getAutor(),
				            libro.getPrecio(),
				            libro.getPaginas(),
				            librosService.getTema(libro.getIdTema())
				            );
	}
}
