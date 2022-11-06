package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestChoques {

	@Test
	public void queSePuedaCrearUnAuto() {
		
		Vehiculos auto = new Auto("ABC123", 60.98765,89.00089, 5, 240.0);
		
		assertNotNull(auto);
	}
	@Test
	public void queSePuedaCrearUnMoto() {
		Vehiculos moto = new Moto("CAB123",60.98765,89.00089, 2, 200.0);
		
		assertNotNull(moto);
	}
	
	@Test
	public void queSePuedaCrearUnTren() {
		Vehiculos tren =new Tren("sarmiento32",60.98765,89.00089, 500, 300.0, "moreno", "once");
		
		assertNotNull(tren);
	}
	
	@Test
	public void  queSePuedanIncorporarDistintosVehiculos() {
		
		Mapa caba = new Mapa();
		
		caba.agregarVehiculos(new Tren("sarmiento32",60.98765,89.00089, 500, 300.0, "moreno", "once"));
		caba.agregarVehiculos(new Tren("sarmiento39",60.98765,89.00089, 500, 300.0, "once", "moreno"));
		
		Integer cantVehiculosEsperados = 2;
		
		assertEquals(cantVehiculosEsperados, caba.cantVehiculosEncaba());

	}
	
	@Test (expected = CollitionException.class)
	public void queChoquenDosVehiculos() throws CollitionException {

		Mapa caba = new Mapa();
		
		caba.agregarVehiculos(new Auto("ABC123", 60.98765,89.00089, 5, 240.0));
		caba.agregarVehiculos(new Moto("CAB123",60.98765,89.00089, 2, 200.0));
		
		
		assertTrue(caba.verificarChoque());
		
	}


}
