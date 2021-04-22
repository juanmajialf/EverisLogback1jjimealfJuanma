package com.everis.Everislogback1jjimealfJuanma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ejercicio Logback1
 * 
 * @author jjimealf
 *
 */
public class App {
	/** LOGGER */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("Inicio del método");

		// genero un numero aleatorio entero entre 1 y 10
		int random = (int) (Math.random() * 10 + 1);
		// si es par imprime los numeros del 1 al 3000
		if (random % 2 == 0) {
			LOGGER.warn("Atención el numero ha sido par");
			for (int i = 1; i <= 3000; i++)
				LOGGER.debug("Imprimiendo numeros: {}", i);
			// si es impar imprime los numeros del 3001 al 6000
		} else {
			LOGGER.warn("Atención el numero ha sido impar");
			for (int i = 3001; i <= 6000; i++)
				LOGGER.debug("Imprimiendo numeros: {}", i);
		}

		LOGGER.info("Fin del método");
	}
}
