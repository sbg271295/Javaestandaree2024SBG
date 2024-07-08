package service;

import java.util.List;

import dao.LibrosDao;
import dao.TemasDao;
import dhoc.Librodto;
import dhoc.TemaDto;
import jakarta.persistence.TypedQuery;
import mappers.Manepador;
import model.Libro;
import model.Tema;

public class LibrosService {
	LibrosDao librosDao=new LibrosDao();
	TemasDao temasDao=new TemasDao();
	Manepador mapeador=new Manepador();
	
	public List<TemaDto> getTemas(){
		return temasDao.findAll().stream().
				map(t->Manepador.temaEntityToDto(t))
				.toList();
	}
	public List<Librodto> librosTema(int idTema){
		
		if(idTema!=0) {
			return librosDao.findByIdTema(idTema).stream()
					.map(l->mapeador.libroEntityToDto(l))
					.toList();
		}else{
			return librosDao.findAll().stream()
					.map(l->mapeador.libroEntityToDto(l))
					.toList();
		    }
	}
	public Librodto getLibro(int isbn) {
		return mapeador.libroEntityToDto(librosDao.findByIsbn(isbn));
	}
	
	public TemaDto getTema(int idtema) {
		return mapeador.temaEntityToDto(temasDao.findById(idtema));
	}
}
