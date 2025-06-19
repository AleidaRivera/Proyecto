
package proyecto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Profesor extends persona{
    
    int id;     
    String especialidad;
    String contrato;

    public Profesor(int id, String nombre,String apellido, String email, String telefono, String especialidad, String contrato) {
        this.id = id;       
        this.especialidad = especialidad;
        this.contrato = contrato;
        super(nombre,apellido,email,telefono);
        
        //System.out.print("entro aca!\n");
         File myObj = new File("C:\\Users\\WINDOWS 10\\Documents\\NetBeansProjects\\Proyecto\\src\\Archivos\\profesor.txt");                                         
                     //meter de cada uno "profesor.txt" o cambiar ruta
                    
        try {
            FileWriter escritor = new FileWriter(myObj, true); // true para agregar (append)  
            escritor.write("Id: " + id + " | ");
            escritor.write(nombre + " | "); 
            escritor.write(apellido + " | ");
            escritor.write(email + " | ");
            escritor.write(telefono + " | ");
            escritor.write(especialidad + " | ");
            escritor.write(contrato + " |\n");
            System.out.print("Profesor Agregado al Sistema!\n");
            escritor.close();       
        } catch (IOException ex) {
            Logger.getLogger(estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    }

    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre;
    }
}
