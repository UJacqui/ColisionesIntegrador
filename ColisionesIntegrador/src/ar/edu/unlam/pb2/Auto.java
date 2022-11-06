package ar.edu.unlam.pb2;

public class Auto extends Vehiculos {
		
	private Integer cantPasajeros;
	private Double velocidadMaxima;

	
	

	Auto(String patente, Double latitud, Double longitud, Integer cantPasajeros, Double velocidadMaxima) {
		super(patente, latitud, longitud);
		this.cantPasajeros = cantPasajeros;
		this.velocidadMaxima = velocidadMaxima;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Integer getCantPasajeros() {
		return cantPasajeros;
	}

	public void setCantPasajeros(Integer cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}

	public Double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public void actualizarCoordenadas(Double nuevaLatitud, Double nuevaLongitud) {
		this.latitud = nuevaLatitud;
		this.longitud = nuevaLongitud;
	}
	
	
}
