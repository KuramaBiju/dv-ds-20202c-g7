package ar.edu.davinci.dvds20202cg7.model;

/**
 * Tipo de Prendas
 * 
 * @author Grupo7
 *
 */
public enum TipoPrenda {

    SACO("Saco"), 
    PANTALON("Pantalón"), 
    CAMISA("Camisa"), 
    CAMPERA("Campera"), 
    TAPADO("Tapado"), 
    CHAQUETA("Chaqueta");

    private String descripcion;

    TipoPrenda(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
