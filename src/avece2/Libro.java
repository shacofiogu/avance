
package avece2;


public   class Libro  extends Articulo {
    
  private String ISBN;

    public Libro(String nombre, String autor, int agno, int disponibilidad) {
        super(nombre, autor, agno, disponibilidad);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    
    
}
