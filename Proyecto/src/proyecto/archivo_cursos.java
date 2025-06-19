package proyecto;
import Excepciones.ExceptionProfesorSinRegistrar;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static proyecto.Proyecto.scanner;


public class archivo_cursos {
  public void archivo_cursos() {  
     try {
         //File myObj = new File("profesor.txt");   
         File myObj = new File("C:\\Users\\WINDOWS 10\\Documents\\NetBeansProjects\\Proyecto\\src\\Archivos\\cursos.txt");   
                         
          boolean existe = false;
          System.out.print("Id del Curso: ");
          int id = scanner.nextInt();

            // 1. Leer archivo línea por línea para buscar el carnet
            if (myObj.exists()) {
                Scanner lector = new Scanner(myObj);
                while (lector.hasNextLine()) {
                    String linea = lector.nextLine();
                    if (linea.contains("Id: " + id)) {
                        existe = true;
                        break;
                    }
            }
                lector.close();
        }                  
            if (!existe) {//Sino existe el Id entonces agregarlo al archivo                 
                
                System.out.print("Agregando Curso\n");
                System.out.print("********************\n");               
                scanner.nextLine();
                System.out.print("Id del Profesor: ");
                int id_profesor = scanner.nextInt();    
                
                
                
                
                
                
                
                
                System.out.print("Nombre del Curso: ");
                String nombre = scanner.nextLine();                
                System.out.print("Descripcion del Curso: ");
                String descripcion = scanner.nextLine();                
                System.out.print("Capacidad Maxima: ");
                int capacidad = scanner.nextInt();               
                
               // 2. Escribir en el archivo
               //profesor registra = new profesor();
                // 2. Escribir en el archivo
               Curso registracurso = new Curso(id,nombre,descripcion,id_profesor,capacidad);
               
               //Profesor registraprofesor = new profesor(id,nombre,apellido,email,telefono,especialidad,contrato);                      
            } else {                 
                 throw new ExceptionProfesorSinRegistrar("El Curso con Id: "+ id + " ya existe!"); 
            }
     } catch (IOException e) {
               System.out.println("Error IOException.");
                e.printStackTrace();
         }   
       catch (ExceptionProfesorSinRegistrar ex) {
               System.out.println(ex.getMessage());                        
         }   
    }
}

// validar si existe el curso LISTO
//validar si existe el profesor asociado *** en proceso     
//Agregar excepcion y clase de excepcion para validar si el curso ya existe

