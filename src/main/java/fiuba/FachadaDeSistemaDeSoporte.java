package fiuba;

import java.util.Date;
import java.util.Hashtable;

public class FachadaDeSistemaDeSoporte {
	
	private PaqueteDeResolucionDeIncidentes paquete;
	private Date hoy;
	
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
}
