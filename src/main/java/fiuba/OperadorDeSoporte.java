package fiuba;

public class OperadorDeSoporte {

	private String name;
	private Ticket ticket;
	
	public OperadorDeSoporte(String name) {
		this.name = name;
	}
	
	public void asignarTicket(Ticket ticket) {
		this.ticket = ticket;
		ticket.asignar(this);
	}
	
	public void marcarTicketComoCompletado(int diasPasados) {
		this.ticket.marcarComoCompletado(diasPasados);
	}
	
	public void marcarTicketComoCancelado(int diasPasados) {
		this.ticket.marcarComoCancelado(diasPasados);
	}
}
