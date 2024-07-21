package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import model.Ciudad;

public class ServiceCiudad {
	private ArrayList<Ciudad> ciudades;
	
	public ServiceCiudad() {
		ciudades=new ArrayList<>();
	}
	
	public void guardar(Ciudad ciudad) {
		ciudades.add(ciudad);
	}
	public void guardar(String nombre, double temperatura, int habitantes) {
		Ciudad ciudad=new Ciudad(nombre, temperatura, habitantes);
		guardar(ciudad);
	}
	//ciudad con temperatura más alta
	public Ciudad getMaxima() {
		/*double aux=ciudades.get(0).getTemperatura();
		Ciudad ciudad=null;
		for(Ciudad c:ciudades) {
			if(c.getTemperatura()>aux) {
				aux=c.getTemperatura();
				ciudad=c;
			}
		}
		return ciudad;*/
		return ciudades.stream()
		.max(Comparator.comparingDouble(c->c.getTemperatura()))//Optional<Ciudad>
		.orElse(null);
		
	}
	public Ciudad getMinima() {
		/*double aux=ciudades.get(0).getTemperatura();
		Ciudad ciudad=null;
		for(Ciudad c:ciudades) {
			if(c.getTemperatura()<aux) {
				aux=c.getTemperatura();
				ciudad=c;
			}
		}
		return ciudad;*/
		return ciudades.stream()
		.min(Comparator.comparingDouble(c->c.getTemperatura()))//Optional<Ciudad>
		.orElse(null);
	}
	public double getMedia() {
		/*double media=0;
		for(Ciudad c:ciudades) {
			media+=c.getTemperatura();
		}
		return media/ciudades.size();*/
		return ciudades.stream()
				.collect(Collectors.averagingDouble(x->x.getTemperatura()));
	}
}
