package junittestes;

import objetos.Investimento;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alenxadre Andrade
 */
public class Teste_Investimento {
    
    Investimento investimento;
    
    public Teste_Investimento() {
        investimento = new Investimento("nome", 0, null, 0);
    }
    
    @Test
    public void cadastrarTipo(){
        assertTrue(investimento.cadastrarTipoInvest());
    }
    
    @Test
    public void cadastrarTaxa(){
        assertTrue(investimento.cadastrarTaxa());
    }
    
}