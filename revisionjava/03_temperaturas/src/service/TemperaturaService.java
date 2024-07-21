package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TemperaturaService {
	
	private ArrayList<Double> temperaturas;
	
	public TemperaturaService() {
		temperaturas=new ArrayList<>();
	}
	
	public void guardar(double temperatura) {
		temperaturas.add(temperatura);
	                                         }
	
	public double getMaxima() {
		
		/*
		double aux=temperaturas.get(0);
		
		for(double t:temperaturas) {
			if(t>aux) {
				aux=t;
			}
		}
		return aux;
		*/
		return temperaturas.stream()
				           .min(Comparator.comparingDouble(n->n))
				           .orElse(0.0);
	}
	public double getMinima() {
	/*double aux=temperaturas.get(0);
		
		for(double t:temperaturas) {
			if(t<aux) {
				aux=t;
			}
		}
		return aux;*/
		return temperaturas.stream()
		                    .max(Comparator.comparingDouble(n->n))
		                    .orElse(0.0);
	}
	public double getMedia() {
	/*int contador=0;
	double acumular=0.0;
	for(double temperatura:temperaturas) {
			contador++;
			acumular += temperatura;
		
		}
	return acumular/contador;
		
	}*/
		
		return temperaturas.stream()
				           .collect(Collectors.averagingDouble(n->n));
	}
	

}
