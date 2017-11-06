package fiuba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class CrearCuentaSteps {
	
	private FachadaBanco fachadaBanco;
	private int saldoLuegoDeCrearCuenta;
	
    @Dado("^que me creo una cuenta con el cbu \"(.*?)\"$")
    public void que_mi_caja_de_ahorro_tiene_un_saldo_de_pesos(String cbu) throws Throwable {
        fachadaBanco = new FachadaBanco();
        fachadaBanco.crearCuenta(cbu);
    }

    @Cuando("^cuando consulto el saldo de \"(.*?)\"$")
    public void cuando_debito_pesos(String cbu) throws Throwable {
        saldoLuegoDeCrearCuenta = fachadaBanco.consultarSaldo(cbu);
    }

    @Entonces("^el saldo final de \"(.*?)\" es de \"(.*?)\" pesos$")
    public void el_saldo_final_es_de_pesos(String cbu, int saldoFinal) throws Throwable {
        assertEquals(saldoFinal, fachadaBanco.consultarSaldo(cbu));
    }
}
