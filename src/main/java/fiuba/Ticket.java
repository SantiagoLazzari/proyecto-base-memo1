package fiuba;

import java.util.Date;

public class Ticket {
	
	public enum estado {
		pendiente, 
		enProgreso,
		completado,
		cancelado,
		limiteExcedido
	}
	
	private String descripcion;
	private Date creacion;
	private int limite;
	
	
	public Ticket(Date creacion, int limite) {
		this.creacion = creacion;
		this.limite = limite;
	}
	
	
}
