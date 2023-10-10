package comunicacion;

import java.util.ArrayList;

import java.util.List;

public class Alfabeto extends Pictograma {
	private static String[] letras; 
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		int resultado = Alfabeto.letras.length;
		return resultado;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		for (String letra : letras) {
			resultado.append(letra).append(", ");
		}
		
		if (letras.length > 0) {
			resultado.delete(resultado.length() - 2, resultado.length());
		}
		
		return resultado.toString();
	}
}
