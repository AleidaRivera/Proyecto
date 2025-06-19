package proyecto;
import Excepciones.ExceptionEstudianteSinRegistrar;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;


import static proyecto.Proyecto.scanner;

public class archivo_estudiante {

    public void archivo_estudiante() {        
      try {
         //File myObj = new File("estudiante.txt");   
         File myObj = new File("C:\\Users\\WINDOWS 10\\Documents\\NetBeansProjects\\Proyecto\\src\\Archivos\\estudiante.txt");   
                         
          boolean existe = false;
          System.out.print("Carnet del estudiante: ");
          int carnet = scanner.nextInt();

            // 1. Leer archivo línea por línea para buscar el carnet
            if (myObj.exists()) {
                Scanner lector = new Scanner(myObj);
                while (lector.hasNextLine()) {
                    String linea = lector.nextLine();
                    if (linea.contains("Id: " + carnet)) {
                        existe = true;
                        break;
                    }
            }
                lector.close();
        }                  
            if (!existe) {//Sino existe el Id entonces agregarlo al archivo                 
                
                System.out.print("Agregando Estudiante\n");
                System.out.print("********************\n");               
                scanner.nextLine();
                System.out.print("Nombre del estudiante: ");
                String nombre = scanner.nextLine();                
                System.out.print("Apellido del estudiante: ");
                String apellido = scanner.nextLine();                
                System.out.print("Email del estudiante: ");
                String email = scanner.nextLine();                
                System.out.print("Telefono del estudiante: ");
                String telefono = scanner.nextLine();                
                System.out.print("Carrera del estudiante: ");
                String carrera = scanner.nextLine();                
               System.out.print("Nivel del estudiante: "); 
                String nivel = scanner.nextLine();                
               // 2. Escribir en el archivo
               estudiante registraestudiante = new estudiante(carnet,nombre,apellido,email,telefono,carrera,nivel);                      
            } else {   
                 throw new ExceptionEstudianteSinRegistrar("El Estudiante con carnet: "+ carnet + " ya existe!"); 
            }
     } catch (IOException e) {
        // throw new ExceptionEstudianteSinRegistrar("Estudiante sin Registrat");
               System.out.println("Error IOException.");
               e.printStackTrace();              
        }
        catch (ExceptionEstudianteSinRegistrar ex) {
               System.out.println(ex.getMessage());                        
         }   
    }  
   
}
