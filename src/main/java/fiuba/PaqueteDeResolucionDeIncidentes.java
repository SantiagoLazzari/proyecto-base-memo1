package fiuba;

import java.util.Hashtable;

public class PaqueteDeResolucionDeIncidentes {
	
	private Hashtable<String, Integer> diasDeResolucionPorCategoria;
	
	public PaqueteDeResolucionDeIncidentes(Hashtable<String, Integer> diasDeResolucionPorCategoria) {
		this.diasDeResolucionPorCategoria = diasDeResolucionPorCategoria;
	}

	public int limiteDeDiasEnCategori(String categoria) {
		return diasDeResolucionPorCategoria.get(categoria);
	}
}