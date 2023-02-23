package com.u_tad.dawe.model;

public class JugadorBM {
	
	private String nombre;
	private int dorsal;
	private int anotacion;
	private int bloqueo;
	private int tiempoJugado;
	
	public JugadorBM(String nombre, int dorsal) {
		
		this.nombre = nombre;
		this.dorsal = dorsal;
	}

	public void setAnotacion(int anotacion) {
		this.anotacion = anotacion;
	}

	public void setBloqueo(int bloqueo) {
		this.bloqueo = bloqueo;
	}

	public void setTiempoJugado(int tiempoJugado) {
		this.tiempoJugado = tiempoJugado;
	}
	
	public int CalculaAleatorio (int numero, int rango) {
		
		anotacion = (int) (Math.random()*rango) + numero; //Se hace del 1 - 20 ya que es raro que en balonmano alla más de 20 anotaciones
		return anotacion;
		
	}
	
	public int Estadisticas (int numero, int rango) {
		
		anotacion = (int) (Math.random()*rango) + numero;
		return anotacion;
		
	}
	@Override
	public String toString() {
		return "JugadorBM [nombre=" + nombre + ", dorsal=" + dorsal + ", anotacion=" + CalculaAleatorio (anotacion, 19) + ", bloqueo="
				+ CalculaAleatorio(bloqueo,15) + ", tiempoJugado=" + CalculaAleatorio(tiempoJugado,15)+ "]";
	}

	
	
	
}
