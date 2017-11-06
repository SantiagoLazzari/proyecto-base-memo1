package fiuba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ResolucionDeTicketSteps {
	
	private FachadaDeSistemaDeSoporte fachadaDeSistemaDeSoporte;
	private Ticket ticket;
	
    @Dado("^que el paquete de resolucion de incidentes tiene limite de \"(.*?)\" para la categoria basica, \"(.*?)\" para la categoria avanzada y \"(.*?)\" para la categoria urgente$")
    public void que_el_paquete_de_resolucion_de_incidentes_es(int basico, int avanzado, int urgente) throws Throwable {
		fachadaDeSistemaDeSoporte = new FachadaDeSistemaDeSoporte();
    		fachadaDeSistemaDeSoporte.crearPaqueteDeResolucionDeIncidentes("basica", basico, "avanzada", avanzado, "urgente", urgente);
    }

    @Cuando("^creo un ticket en la categoria \"(.*?)\"$")
    public void creo_un_ticket_de_categoria(String categoria) throws Throwable {
    		ticket = fachadaDeSistemaDeSoporte.crearTicket(categoria);
    }
    
    @Cuando("pasan \"(.*?)\" dias$")
    public void pasan_dias(int dias) throws Throwable {
    		fachadaDeSistemaDeSoporte.pasanDias(dias);
    }
    
    @Cuando("le asigno el ticket a \"(.*?)\"")
    public void le_asigno_el_ticket_a(String asignadoA) {
    		fachadaDeSistemaDeSoporte.asignarA(ticket, asignadoA);
    }

    @Cuando("el operador marca el ticket como completado")
    public void el_operador_marca_el_ticket_como_completado() {
    		fachadaDeSistemaDeSoporte.operadorMarcaComoCompletado();
    }
    
    @Cuando("el operador marca el ticket como cancelado")
    public void el_operador_marca_el_ticket_como_cancelado() throws Throwable {
    		fachadaDeSistemaDeSoporte.operadorMarcaComoCancelado();
    }

    @Entonces("^el estado del ticket es \"(.*?)\"$")
    public void el_estado_del_ticket_es(String estadoDelTicket) throws Throwable {
        assertEquals(estadoDelTicket, fachadaDeSistemaDeSoporte.estadoDeTicket(ticket));
    }
}
