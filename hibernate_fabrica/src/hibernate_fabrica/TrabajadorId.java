package hibernate_fabrica;
// Generated 28-ene-2019 13:30:03 by Hibernate Tools 4.3.1



/**
 * TrabajadorId generated by hbm2java
 */
public class TrabajadorId  implements java.io.Serializable {


     private int idTrabajador;
     private String dni;

    public TrabajadorId() {
    }

    public TrabajadorId(int idTrabajador, String dni) {
       this.idTrabajador = idTrabajador;
       this.dni = dni;
    }
   
    public int getIdTrabajador() {
        return this.idTrabajador;
    }
    
    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TrabajadorId) ) return false;
		 TrabajadorId castOther = ( TrabajadorId ) other; 
         
		 return (this.getIdTrabajador()==castOther.getIdTrabajador())
 && ( (this.getDni()==castOther.getDni()) || ( this.getDni()!=null && castOther.getDni()!=null && this.getDni().equals(castOther.getDni()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdTrabajador();
         result = 37 * result + ( getDni() == null ? 0 : this.getDni().hashCode() );
         return result;
   }   


}


