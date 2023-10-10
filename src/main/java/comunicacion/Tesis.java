package main.java.comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Tesis extends Escrito {
	private String idea;
	private List<String> argumentos = new ArrayList<>();
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, List<String> argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor,paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int parametro) {
		return parametro*this.getPaginas()*5;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		resultado.append(this.getOrigen()).append("\n").append(this.getTitulo()).append("\n").append(this.getAutor()).append("\n").append(String.valueOf(this.getPaginas())).append("\n").append(this.idea).append("\n").append(String.valueOf(this.argumentos.size())).append("\n").append(this.conclusion).append("\n").append(this.referencias).append("\n").append(this.interpretacion);
		return resultado.toString();
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public List<String> getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(List<String> argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	
}
