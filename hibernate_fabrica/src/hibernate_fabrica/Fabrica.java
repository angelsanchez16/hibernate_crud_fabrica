package hibernate_fabrica;
// Generated 28-ene-2019 13:30:03 by Hibernate Tools 4.3.1



/**
 * Fabrica generated by hbm2java
 */
public class Fabrica  implements java.io.Serializable {


     private int idFabrica;
     private String nombre;
     private String coche;
     private String trabajador;

    public Fabrica() {
    }

    public Fabrica(int idFabrica, String nombre, String coche, String trabajador) {
       this.idFabrica = idFabrica;
       this.nombre = nombre;
       this.coche = coche;
       this.trabajador = trabajador;
    }
   
    public int getIdFabrica() {
        return this.idFabrica;
    }
    
    public void setIdFabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCoche() {
        return this.coche;
    }
    
    public void setCoche(String coche) {
        this.coche = coche;
    }
    public String getTrabajador() {
        return this.trabajador;
    }
    
    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    String getFabrica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setFabrica(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}

