package proyecto;
import Excepciones.ExceptionProfesorSinRegistrar;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
//import java.io.FileWriter;
import java.util.Scanner;
import static proyecto.Proyecto.scanner;


public class archivo_profesor {
    
    public void archivo_profesor() {        
      try {
         //File myObj = new File("profesor.txt");   
         File myObj = new File("C:\\Users\\WINDOWS 10\\Documents\\NetBeansProjects\\Proyecto\\src\\Archivos\\profesor.txt");   
                         
          boolean existe = false;
          System.out.print("Id del Profesor: ");
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
                
                System.out.print("Agregando Profesor\n");
                System.out.print("********************\n");               
                scanner.nextLine();
                System.out.print("Nombre del Profesor: ");
                String nombre = scanner.nextLine();                
                System.out.print("Apellido del Profesor: ");
                String apellido = scanner.nextLine();                
                System.out.print("Email del Profesor: ");
                String email = scanner.nextLine();                
                System.out.print("Telefono del Profesor: ");
                String telefono = scanner.nextLine();                
                System.out.print("Especialidad del Profesor: ");
                String especialidad = scanner.nextLine();                
                System.out.print("Tipo de Contrato (Tiempo Completo/Por Horas): ");
                String contrato = scanner.nextLine();                
               // 2. Escribir en el archivo
               //profesor registra = new profesor();
                // 2. Escribir en el archivo
               Profesor registraprofesor = new Profesor(id,nombre,apellido,email,telefono,especialidad,contrato);
               
               //Profesor registraprofesor = new profesor(id,nombre,apellido,email,telefono,especialidad,contrato);                      
            } else {                 
                 throw new ExceptionProfesorSinRegistrar("El Profesor con Id: "+ id + " ya existe!"); 
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

