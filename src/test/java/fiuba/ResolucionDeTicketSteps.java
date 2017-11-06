package fiuba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class ResolucionDeTicketSteps {
	
	private FachadaDeSistemaDeSoporte fachadaDeSistemaDeSoporte;
	
    @Dado("^que el paquete de resolucion de incidentes tiene limite de \"(.*?)\" para la categoria basica, \"(.*?)\" para la categoria avanzada y \"(.*?)\" para la categoria urgente$")
    public void que_el_paquete_de_resolucion_de_incidentes_es(int basico, int avanzado, int urgente) throws Throwable {
    		fachadaDeSistemaDeSoporte.crearPaqueteDeResolucionDeIncidentes("basico", basico, "avanzado", avanzado, "urgente", urgente);
    }

    @Cuando("^creo un ticket en la categoria \"(.*?)\"$")
    public void creo_un_ticket_de_categoria(String categoria) throws Throwable {
    		fachadaDeSistemaDeSoporte.crearTicket(categoria);
    }
    
    @Cuando("pasan \"(.*?)\" dias$")
    public void pasan_dias(int dias) throws Throwable {
    		
    }

    @Entonces("^el estado del ticket es \"(.*?)\"$")
    public void el_estado_del_ticket_es(String estadoDelTicket) throws Throwable {
    		
    }
}
