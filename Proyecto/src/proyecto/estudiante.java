package proyecto;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class estudiante extends persona{
        
    int carnet;   
    String carrera;
    String nivel;
 
    

  estudiante(int carnet, String nombre, String apellido, String email, String telefono, String carrera, String nivel) {
        //this.nombre = nombre;        
        this.carnet=carnet;
        this.carrera = carrera;
        this.nivel = nivel;
        super(nombre,apellido,email,telefono);
        
         //System.out.print("entro aca!\n");
         File myObj = new File("C:\\Users\\WINDOWS 10\\Documents\\NetBeansProjects\\Proyecto\\src\\Archivos\\estudiante.txt");                                         
                     
        try {
            FileWriter escritor = new FileWriter(myObj, true); // true para agregar (append)  
            escritor.write("Id: " + carnet + " | ");
            escritor.write(nombre + " | "); 
            escritor.write(apellido + " | ");
            escritor.write(email + " | ");
            escritor.write(telefono + " | ");
            escritor.write(carrera + " | ");
            escritor.write(nivel + " |\n");
            System.out.print("Estudiante Agregado al Sistema!\n");
            escritor.close();       
        } catch (IOException ex) {
            Logger.getLogger(estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }      
    } 
}
