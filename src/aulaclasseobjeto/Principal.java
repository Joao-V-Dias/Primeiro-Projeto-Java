package aulaclasseobjeto;

/**
 *
 * @author IFTM
 */

public class Principal {
    public static void main(String[] args) {
        Professor jean = new Professor();
        jean.setNome("Jean");
        jean.setDepartamento("Informatica");
        
        Professor josele = new Professor();
        josele.setNome("Josele");
        josele.setDepartamento("Administracao");
        
        jean.mostrarInformacoes();
        josele.mostrarInformacoes();
    }
}
