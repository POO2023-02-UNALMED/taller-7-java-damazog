package comunicacion;

import java.util.ArrayList;

import java.util.List;

public class Alfabeto extends Pictograma {
	private static List<String> letras = new ArrayList<>(); 
	private String interpretacion;
	
	public Alfabeto(String origen, List<String> letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		int resultado = Alfabeto.letras.size();
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
		
		if (!letras.isEmpty()) {
			resultado.delete(resultado.length() - 2, resultado.length());
		}
		
		return resultado.toString();
	}
}
