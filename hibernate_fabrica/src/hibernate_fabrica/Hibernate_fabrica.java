/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_fabrica;

/**
 *
 * @author Angel
 */
import org.hibernate.Session;
import org.hibernate.Query;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Angel
 */
public class Hibernate_fabrica {
        
        static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        static Session session = sessionFactory.openSession();
        static Scanner teclado = new Scanner(System.in);
        static Scanner teclado1 = new Scanner(System.in);
        static Scanner teclado2 = new Scanner(System.in);    
        static Scanner teclado3 = new Scanner(System.in); 
        static Scanner teclado4 = new Scanner(System.in);
        static Scanner teclado5 = new Scanner(System.in);
        static Scanner teclado6 = new Scanner(System.in);
        static Scanner teclado7 = new Scanner(System.in);
        static Scanner teclado8 = new Scanner(System.in);
        static Scanner teclado9 = new Scanner(System.in);
        static Scanner teclado10 = new Scanner(System.in);
        static Scanner teclado11 = new Scanner(System.in);
        static Scanner teclado12 = new Scanner(System.in);
        static Scanner teclado13 = new Scanner(System.in);
    
    
    public static void crearTrabajador(){
        Trabajador tra = new Trabajador();
        
        System.out.println("Introduzca la id: ");
        tra.setIdTrabajador(teclado.nextInt());
        
        System.out.println("Introduzca el modelo");
        tra.setSeccion(teclado1.nextLine());
        
	session.beginTransaction();

	session.save(tra);

	session.getTransaction().commit();
        
        
    }
    
     public static void crearSeccion(){
        Seccion s = new Seccion();
        
        System.out.println("Introduzca la id: ");
        s.setIdSeccion(teclado.nextInt());
        
        System.out.println("Introduzca el nombre");
        s.setNombre(teclado1.nextLine());
        
        System.out.println("Introduzca el numero de trabajadores");
        s.setNTrabajadores(teclado2.nextInt());
        
        System.out.println("Introduzca el trabajador");
        s.setTrabajador(teclado3.nextLine());
              
	session.beginTransaction();

	session.save(s);

	session.getTransaction().commit();
    }
     
    public static void crearCoches(){
        Coches co = new Coches();
        
        System.out.println("Introduzca el id: ");
        co.setIdCoche(teclado.nextInt());
        
        System.out.println("Introduzca el modelo");
        co.setModelo(teclado1.nextLine());
                
        mostrarFabrica();
        System.out.println("Introduzca la Ciudad: ");
        co.setFabrica(teclado2.nextLine());
        
	session.beginTransaction();

	session.save(co);

	session.getTransaction().commit();
    }
    
    public static void crearFabrica(){
        Fabrica f = new Fabrica();
        
        System.out.println("Introduzca el id: ");
        f.setIdFabrica(teclado.nextInt());
        
        System.out.println("Introduzca el nombre");
        f.setNombre(teclado1.nextLine());
        
        System.out.println("Introduzca el coche");
        f.setCoche(teclado2.nextLine());
        
        System.out.println("Introduzca el trabajador");
        f.setTrabajador(teclado2.nextLine());
        
	session.beginTransaction();

	session.save(f);

	session.getTransaction().commit();
    }
    
    public static void mostrarTrabajador(){
        Query sql = session.createQuery("from Trabajador");
        
        
        Iterator it = sql.iterate();
        
        while(it.hasNext()){
            Trabajador t = (Trabajador) it.next();
            
            if(t.getTrabajador()!= null){
            System.out.println(" -\bNombre:" +  t.getNombre() + " -\bId:" + t.getId());      
            }
            else
                System.out.println(" -\bId:" + t.getId() + " -\bNombre:" + t.getNombre() +  " -\bNombre:");
            
        }
    }
    
     public static void mostrarSeccion(){
        Query sql = session.createQuery("from Seccion");
        
        Iterator it = sql.iterate();
        
        while(it.hasNext()){
            Seccion s = (Seccion) it.next();
            
            if(s.getSeccion()!= null){
            System.out.println(" -\bId:" + s.getIdSeccion() +  " -\bNombre:" + s.getNombre());      
            }
            else
                System.out.println(" -\bId:" + s.getIdSeccion() + " -\bNombre:" + s.getNombre());
        }
    }
     
      public static void mostrarCoche(){
        Query sql = session.createQuery("from Coches");
        
        Iterator it = sql.iterate();
        
        while(it.hasNext()){
            Coches co = (Coches) it.next();
            
            if(co.getIdCoche()!= null){
            System.out.println(" -\bId:" + co.getIdCoches()+  " -\bNombre:" + co.getNombre()+ " -\bApellido:" + co.getModelo() + " -\bCiudad: " + co.getFabrica());      
            }
            else
                System.out.println(" -\bId:" + co.getIdCoches() + " -\bNombre:" + co.getNombre() +  " -\bDireccion:" + co.getModelo());
        }
    }
    
       public static void mostrarFabrica(){
        Query sql = session.createQuery("from Fabrica");
        
        Iterator it = sql.iterate();
        
        while(it.hasNext()){
            Fabrica f = (Fabrica) it.next();      
            
            System.out.println(" -\bId:" + f.getIdFabrica() + " -\bNombre:" + f.getNombre());
        }
    }
    
    
     public static void modificarTrabajador(){   
        mostrarTrabajador();
        Trabajador tra = new Trabajador();
        System.out.println("Indique el ID del trabajador que quiere modificar");
        tra = (Trabajador) session.load(Trabajador.class, (int) Integer.parseInt(teclado8.nextLine()));
        
        System.out.println("Introduzca el nombre");
        tra.setNombre(teclado1.nextLine());
        
        System.out.println("Introduzca la seccion");
        tra.setSeccion(teclado2.nextLine());
        
	session.beginTransaction();

	session.update(tra);

	session.getTransaction().commit();
        
    }
     
      public static void modificarSeccion(){   
        mostrarSeccion();
        Seccion se = new Seccion();
        System.out.println("Indique el ID de la seccion que quiere modificar");
        se = (Seccion) session.load(Seccion.class, (int) Integer.parseInt(teclado9.nextLine()));
        
        System.out.println("Introduzca el nombre");
        se.setNombre(teclado1.nextLine());
        
        System.out.println("Introduzca el trabajador");
        se.setTrabajador(teclado2.nextLine());
        
	session.beginTransaction();

	session.update(se);

	session.getTransaction().commit();
        
    }
      
    public static void modificarCoche(){   
        mostrarCoche();
        Coches co = new Coches();
        System.out.println("Indique el ID del coche que quiere modificar");
        co = (Coches) session.load(Coches.class, (int) Integer.parseInt(teclado10.nextLine()));

        System.out.println("Introduzca el modelo");
        co.setModelo(teclado1.nextLine());
        
        System.out.println("Introduzca la fabrica");
        co.setFabrica(teclado2.nextLine());
        
	session.beginTransaction();

	session.update(co);

	session.getTransaction().commit();
        
    }
    
    public static void modificarFabrica(){   
        mostrarFabrica();
        Fabrica fa = new Fabrica();
        System.out.println("Indique el ID de la fabrica que quiere modificar");
        fa = (Fabrica) session.load(Fabrica.class, (int) Integer.parseInt(teclado11.nextLine()));
                
        System.out.println("Introduzca el nombre");
        fa.setNombre(teclado1.nextLine());
        
        System.out.println("Introduzca el coche");
        fa.setCoche(teclado2.nextLine());
        
	session.beginTransaction();

	session.update(fa);

	session.getTransaction().commit();
        
    }
     
     
      static void eliminarTrabajador(){
        mostrarTrabajador();
        Trabajador tra = new Trabajador();
        System.out.println("Indique el ID del trabajador que quiere eliminar");
        tra = (Trabajador) session.load(Trabajador.class, (int) Integer.parseInt(teclado4.nextLine()));
        
        session.beginTransaction();

	session.delete(tra);

	session.getTransaction().commit();
    }
      
      static void eliminarSeccion(){
        mostrarSeccion();
        Seccion sec = new Seccion();
        System.out.println("Indique el ID de la secccion que quiere eliminar");
        sec = (Seccion) session.load(Seccion.class, (int) Integer.parseInt(teclado5.nextLine()));
        
        session.beginTransaction();

	session.delete(sec);

	session.getTransaction().commit();
    }
      
    static void eliminarCoche(){
        mostrarCoche();
        Coches co = new Coches();
        System.out.println("Indique el ID del coche que quiere eliminar");
        co = (Coches) session.load(Coches.class, (int) Integer.parseInt(teclado6.nextLine()));
        
        session.beginTransaction();

	session.delete(co);

	session.getTransaction().commit();
    }  
    
    static void eliminarFabrica(){
        mostrarFabrica();
        Fabrica fa = new Fabrica();
        System.out.println("Indique el ID de la fabrica que quiere eliminar");
        fa = (Fabrica) session.load(Fabrica.class, (int) Integer.parseInt(teclado7.nextLine()));
        
        session.beginTransaction();

	session.delete(fa);
        
	session.getTransaction().commit();
    }  
      
    public static void main(String[] args) {       
        int opcion = 0;
        boolean repite = true;
        
        do{
            System.out.println("1.Mostrar Trabajador");
            System.out.println("2.Mostrar Seccion");
            System.out.println("3.Mostrar Coche");
            System.out.println("4.Mostrar Fabrica");
            System.out.println("5.Crear Trabajador");
            System.out.println("6.Crear Seccion");
            System.out.println("7.Crear Coche");
            System.out.println("8.Crear Fabrica");
            System.out.println("9.Eliminar Trabajador");
            System.out.println("10.Eliminar Seccion");
            System.out.println("11.Eliminar Coche");
            System.out.println("12.Eliminar Fabrica");
            System.out.println("13.Modificar Trabajador");
            System.out.println("14.Modificar Seccion");
            System.out.println("15.Modificar Coche");
            System.out.println("16.Modificar Fabrica");
            System.out.println("17.Salir");         
            
            
            opcion = teclado.nextInt();            
            
            switch(opcion){
                
		case 1:
		{
                    mostrarTrabajador();
		}
		break;			
		case 2:
		{
                    mostrarSeccion();
		}
		break;
                case 3:
                {
                    mostrarCoche();
                }
                break;
                case 4:
		{
                    mostrarFabrica();
		}
		break;			
		case 5:
		{
                    crearTrabajador();
		}
		break;
                case 6:
                {
                    crearSeccion();
                }
                break;
                case 7:
		{
                    crearCoches();
		}
		break;			
		case 8:
		{
                   crearFabrica();
		}
		break;
                case 9:
                {
                    eliminarTrabajador();
                }
                break;
                case 10:
		{
                   eliminarSeccion();
		}
		break;			
		case 11:
		{
                    eliminarCoche();
		}
		break;
                case 12:
                {
                   eliminarFabrica();
                }
                break;
                case 13:
                {
                    modificarTrabajador();
                }
                break;
                case 14:
                {
                    modificarSeccion();
                }
                break;
                case 15:
		{
                   modificarCoche();
		}
		break;			
		case 16:
		{
                    modificarFabrica();
		}
		break;
		case 17:
                {
                    repite = false;
                }
                break;
			
            }           
	}while(repite);       
       
        session.close();
        sessionFactory.close();
    }
    
}