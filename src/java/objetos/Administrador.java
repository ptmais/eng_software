package objetos;

/**
 *
 * @author Alenxadre Andrade
 */
public class Administrador extends Usuario {
    
    public Administrador(String nome, String sobrenome, String cpf, String login, String senha) {
        super(nome, sobrenome, cpf, login, senha);
    }
    
    public boolean cadastrarUsuario(){
        return false;
    }
    
    public boolean cadastrarInvt(){
        return false;
    }
    
}
