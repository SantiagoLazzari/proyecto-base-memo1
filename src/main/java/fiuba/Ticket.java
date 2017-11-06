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
	private OperadorDeSoporte asignadoA;
	private boolean completado = false;
	private boolean cancelado = false;
	
	public Ticket(Date creacion, int limite) {
		this.creacion = creacion;
		this.limite = limite;
	}
	
	public void asignar(OperadorDeSoporte asignadoA) {
		this.asignadoA = asignadoA;
	}
	
	public void marcarComoCompletado(int diasDesdeCreacion) {
		if (diasDesdeCreacion <= limite) {
			completado = true;
		}
	}
	
	public void marcarComoCancelado(int diasDesdeCreacion) {
		if (diasDesdeCreacion <= limite) {
			cancelado = true;
		}
	}
	
	public estado getEstado(int diasDesdeCreacion) {
		if (completado) {
			return estado.completado;
		}
		
		if (cancelado) {
			return estado.cancelado;
		}
		
		if (diasDesdeCreacion > limite) {
			return estado.limiteExcedido;
		}
		if (diasDesdeCreacion <= limite) {
			if (asignadoA == null) {
				return estado.pendiente;
			} else {			
				return estado.enProgreso;
			}
		}
		return estado.pendiente;
	}
	
}
