package modelos;
// Generated 12/11/2017 01:00:41 PM by Hibernate Tools 4.0.0



/**
 * DetPrestamoLibro generated by hbm2java
 */
public class DetPrestamoLibro  implements java.io.Serializable {


     private DetPrestamoLibroId id;
     private Prestamo prestamo;
     private Libro libro;

    public DetPrestamoLibro() {
    }

    public DetPrestamoLibro(DetPrestamoLibroId id, Prestamo prestamo, Libro libro) {
       this.id = id;
       this.prestamo = prestamo;
       this.libro = libro;
    }
   
    public DetPrestamoLibroId getId() {
        return this.id;
    }
    
    public void setId(DetPrestamoLibroId id) {
        this.id = id;
    }
    public Prestamo getPrestamo() {
        return this.prestamo;
    }
    
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    public Libro getLibro() {
        return this.libro;
    }
    
    public void setLibro(Libro libro) {
        this.libro = libro;
    }




}


