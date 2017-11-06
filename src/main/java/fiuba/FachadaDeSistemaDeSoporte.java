package fiuba;

import java.util.Date;
import java.util.Hashtable;

import fiuba.Ticket.estado;

public class FachadaDeSistemaDeSoporte {
	
	private PaqueteDeResolucionDeIncidentes paquete;
	private Date hoy;
	private int diasPasados;
	private OperadorDeSoporte operador;
	
	@SuppressWarnings("deprecation")
	public FachadaDeSistemaDeSoporte() {
		 this.hoy = new Date(1994, 11, 15);
	}
	
	public void crearPaqueteDeResolucionDeIncidentes(String primerCategoria, int diasDePrimerCategoria, String segundaCategoria, int diasDeSegundaCategoria, String terceraCategoria, int diasDeTercerCategoria) {
        Hashtable<String, Integer> diasDeResolucionPorCategoria = new Hashtable<String, Integer>();
        
        diasDeResolucionPorCategoria.put(primerCategoria, diasDePrimerCategoria);
        diasDeResolucionPorCategoria.put(segundaCategoria, diasDeSegundaCategoria);
        diasDeResolucionPorCategoria.put(terceraCategoria, diasDeTercerCategoria);

        this.paquete = new PaqueteDeResolucionDeIncidentes(diasDeResolucionPorCategoria);
	}

	public Ticket crearTicket(String categoria) {
		return new Ticket(hoy, paquete.limiteDeDiasEnCategori(categoria));
	}
	
	public void pasanDias(int dias) {
		diasPasados = dias;
	}
	
	public void asignarA(Ticket ticket, String asignadoA) {
		operador = new OperadorDeSoporte(asignadoA);
		operador.asignarTicket(ticket);
	}
	
	public void operadorMarcaComoCompletado() {
		operador.marcarTicketComoCompletado(diasPasados);
	}
	
	public void operadorMarcaComoCancelado() {
		operador.marcarTicketComoCancelado(diasPasados);
	}
	
	public String estadoDeTicket(Ticket ticket) {
		switch (ticket.getEstado(diasPasados)) { 
		case pendiente:
			return "pendiente";
		case cancelado:
			return "cancelado";
		case completado:
			return "completado";
		case enProgreso:
			return "en progreso";
		case limiteExcedido:
			return "limite excedido";
		default:
			return "no valido";
		}
		
	}
}
