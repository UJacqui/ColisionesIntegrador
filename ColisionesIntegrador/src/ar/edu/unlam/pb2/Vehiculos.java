package ar.edu.unlam.pb2;

public abstract class Vehiculos {
	
	protected String patente;
	protected Double latitud;
	protected Double longitud;
	

	

	Vehiculos(String patente, Double latitud, Double longitud) {
		super();
		this.patente = patente;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public abstract void actualizarCoordenadas(Double nuevaLatitud, Double nuevaLongitud);
	
	
	

}
