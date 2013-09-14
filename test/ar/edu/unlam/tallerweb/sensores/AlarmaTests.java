package ar.edu.unlam.tallerweb.sensores;

import org.junit.Assert;
import org.junit.Test;




public class AlarmaTests {

	@Test
	public void testQueUnaAlrmaRecienInstaladaArrancaDesactivada() {
		
		//1. Preparaci�n
		Alarma a = new Alarma();
		Sensor s = new Sensor();
		a.setSensor(s);
		s.setAlarma(a);
		//2. Ejecuci�n
		Boolean activada = a.estaActivada();
		Boolean desactivada = a.estaDesactivada();
		
		//3. Contrastaci�n
		Assert.assertFalse(activada);
		Assert.assertTrue(desactivada);
	}
	
	@Test
	public void testQueUnaAlrmaActivadaQuedaActivada() {
		
		//1. Preparaci�n
		Alarma a = new Alarma();
		Sensor s = new Sensor();
		a.setSensor(s);
		s.setAlarma(a);
		
		//2. Ejecuci�n
		s.detectar();	
		
		//3. Contrastaci�n
		Assert.assertTrue(a.estaActivada());
	}
	
}
