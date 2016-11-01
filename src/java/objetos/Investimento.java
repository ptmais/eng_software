package objetos;

/**
 *
 * @author Alenxadre Andrade
 */
public class Investimento {
    
    private String nome;
    private double valor;
    private double[] taxa;
    private int tempo;

    public Investimento(String nome, double valor, double[] taxa, int tempo) {
        this.nome = nome;
        this.valor = valor;
        this.taxa = taxa;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double[] getTaxa() {
        return taxa;
    }

    public void setTaxa(double[] taxa) {
        this.taxa = taxa;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }  
    
    public boolean cadastrarTipoInvest(){
        return false;
    }
    
    public boolean cadastrarTaxa(){
        return false;
    }
    
    // By: Carlos
    // Novas funções para testar lucro do investimento
    public double lucroInvestimento(Investimento inv){       
        return 0;
    }
}
