
package avece2;


public  class Articulo<T> {
    
private String nombre;
private String autor;
private int agno;
private int disponibilidad;

    public Articulo(String nombre, String autor, int agno, int disponibilidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.agno = agno;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
 
}
