package hibernate_fabrica;
// Generated 28-ene-2019 13:30:03 by Hibernate Tools 4.3.1



/**
 * Trabajador generated by hbm2java
 */
public class Trabajador  implements java.io.Serializable {


     private TrabajadorId id;
     private String seccion;
     private String nombre;
     private String cargo;

    public Trabajador() {
    }

    public Trabajador(TrabajadorId id, String seccion, String nombre, String cargo) {
       this.id = id;
       this.seccion = seccion;
       this.nombre = nombre;
       this.cargo = cargo;
    }
   
    public TrabajadorId getId() {
        return this.id;
    }
    
    public void setId(TrabajadorId id) {
        this.id = id;
    }
    public String getSeccion() {
        return this.seccion;
    }
    
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    Object getTrabajador() {
         return null;
        
    }

    void setIdTrabajador(int nextInt) {
       
    }
}