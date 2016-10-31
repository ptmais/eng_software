package junittestes;

import objetos.Administrador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alenxadre Andrade
 */
public class Teste_Administrador {
    
    Administrador adm;

    public Teste_Administrador() {
        adm = new Administrador("adm", "adm", "adm", "adm", "adm");
    }

    @Test
    public void cadastrarUsuario() {
        assertTrue(adm.cadastrarUsuario());
    }
    
    @Test
    public void cadastrarInvestimento() {
        assertTrue(adm.cadastrarInvt());
    }
}
