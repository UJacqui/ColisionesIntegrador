package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Iterator;

public class Mapa {
	
	private HashSet<Vehiculos> listaVehiculos = new HashSet <>();

	public void agregarVehiculos(Vehiculos vehiculosAgregar) {
	 this.listaVehiculos.add(vehiculosAgregar);	
	}
	
	public Integer cantVehiculosEncaba () {
		return listaVehiculos.size();
	}

	public Boolean verificarChoque() throws CollitionException {
		
		for (Vehiculos vehiculo1 : listaVehiculos) {
			
			for(Vehiculos vehiculo2 : listaVehiculos) {
	// ante la ocurrencia de una colisi�n debe generar una excepci�n �CollitionException�.	 

				if(vehiculo1.latitud == vehiculo2.latitud && vehiculo1.longitud == vehiculo2.longitud) {
				 
					throw new CollitionException("Se pruedujo un choque");
				}			
			}	
		}
				
		return false;
	}
	
	

}
