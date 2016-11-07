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

    /*
    @Test
    public void cadastrarTipo() {
        assertTrue(investimento.cadastrarInvestimento());
    }
     */
    @Test
    public void cadastrarInvestimento() {
        assertTrue(investimento.cadastrarInvestimento());
    }

    @Test
    public void alterarInvestimento() {
        assertTrue(investimento.alterarInvestimento());
    }

    @Test
    public void excluirInvestimento() {
        assertTrue(investimento.excluirInvestimento());
    }

    /*
    @Test
    public void cadastrarTaxa(){
        assertTrue(investimento.cadastrarTaxa());
    }
    
    @Test
    public void testarLucroLCI(){
        assertEquals(0, investimento.lucroInvestimento(investimento));
    }
     */
}
