package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private	String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int parametro) {
		return parametro*this.getPaginas();
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		resultado.append(this.getOrigen()).append("\n").append(this.getTitulo()).append("\n").append(this.getAutor()).append("\n").append(this.getPaginas()).append("\n").append(this.ensenanza);
		return resultado.toString();
	}
}
