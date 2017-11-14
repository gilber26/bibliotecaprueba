package modelos;
// Generated 12/11/2017 01:00:41 PM by Hibernate Tools 4.0.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Libro generated by hbm2java
 */
public class Libro  implements java.io.Serializable {


     private Long idLibro;
     private String nombre;
     private String editorial;
     private Date fechaPublicacion;
     private String autor;
     private Set<DetPrestamoLibro> detPrestamoLibros = new HashSet<DetPrestamoLibro>(0);

    public Libro() {
    }

	
    public Libro(Long idLibro, String nombre, String editorial, Date fechaPublicacion, String autor) {
        this.idLibro = idLibro;
        this.nombre = nombre;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
    }
    public Libro(Long idLibro, String nombre, String editorial, Date fechaPublicacion, String autor, Set<DetPrestamoLibro> detPrestamoLibros) {
       this.idLibro = idLibro;
       this.nombre = nombre;
       this.editorial = editorial;
       this.fechaPublicacion = fechaPublicacion;
       this.autor = autor;
       this.detPrestamoLibros = detPrestamoLibros;
    }
   
    public Long getIdLibro() {
        return this.idLibro;
    }
    
    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEditorial() {
        return this.editorial;
    }
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }
    
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Set<DetPrestamoLibro> getDetPrestamoLibros() {
        return this.detPrestamoLibros;
    }
    
    public void setDetPrestamoLibros(Set<DetPrestamoLibro> detPrestamoLibros) {
        this.detPrestamoLibros = detPrestamoLibros;
    }




}


