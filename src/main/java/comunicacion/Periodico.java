package comunicacion;

public class Periodico extends Escrito {
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor,paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int parametro) {
		return parametro*this.getPaginas()*10;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		resultado.append(this.getOrigen()).append("\n").append(this.getTitulo()).append("\n").append(this.getAutor()).append("\n").append(this.getPaginas()).append("\n").append(this.fecha).append("\n").append(this.primicia);
		return resultado.toString();
	}
}
