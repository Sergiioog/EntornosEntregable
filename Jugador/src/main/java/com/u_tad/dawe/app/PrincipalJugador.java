package com.u_tad.dawe.app;

import com.u_tad.dawe.model.JugadorBM;

public class PrincipalJugador {

	public static void main(String[] args) {
		
		JugadorBM Sergio = new JugadorBM ("Sergio",7);
		JugadorBM Alvaro = new JugadorBM ("Alvaro", 10);
		
		//HACER CAMBIOS EN EL POM DE JUGADOR BALONMANO?
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Jornda " + i);
			System.out.println(Sergio);
			System.out.println(Alvaro);
		}
		
	}
}
