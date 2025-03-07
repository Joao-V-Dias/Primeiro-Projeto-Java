package aulaclasseobjeto;

/**
 * Atalhos:
 * Ctrl + Shift = Duplicar linha
 * Alt + Shift = Movimentar linha
 */

/**
 *
 * @author IFTM
 */

public class Professor {
    private String nome;
    private String departamento;
   
    void mostrarInformacoes(){
        System.out.println("Nome do professor: " + nome + "\nDepartamento: " + departamento + "\n");
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getDepartamento(){
        return this.departamento;
    }
}
