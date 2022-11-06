package ar.edu.unlam.pb2;

public class Tren extends Vehiculos {
	
	private Integer cantPasajeros;
	private Double velocidadMaxima;
	private String destino;
	private String origen;
	

	Tren(String patente, Double latitud, Double longitud, Integer cantPasajeros, Double velocidadMaxima, String destino,
			String origen) {
		super(patente, latitud, longitud);
		this.cantPasajeros = cantPasajeros;
		this.velocidadMaxima = velocidadMaxima;
		this.destino = destino;
		this.origen = origen;
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
