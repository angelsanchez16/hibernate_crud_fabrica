package hibernate_fabrica;
// Generated 28-ene-2019 13:30:03 by Hibernate Tools 4.3.1



/**
 * Coches generated by hbm2java
 */
public class Coches  implements java.io.Serializable {


     private Integer idCoche;
     private String modelo;
     private String fabrica;

    public Coches() {
    }

    public Coches(String modelo, String fabrica) {
       this.modelo = modelo;
       this.fabrica = fabrica;
    }
   
    public Integer getIdCoche() {
        return this.idCoche;
    }
    
    public void setIdCoche(Integer idCoche) {
        this.idCoche = idCoche;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getFabrica() {
        return this.fabrica;
    }
    
    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    void setcoche(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setIdCoches(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCoche(String nextLine) {
        
    }

    void setIdcoches(int nextInt) {
        
    }

    String getNombre() {
         return null;
        
    }
    String getIdCoches() {
         return null;
        
    }




}


