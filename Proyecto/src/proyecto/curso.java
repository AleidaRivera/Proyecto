package proyecto;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Curso {
    int id;
    String nombre;
    String descripcion;
    int id_profesor;
    int capacidad;
    
    public Curso(int id, String nombre, String descripcion, int id_profesor, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.id_profesor = id_profesor;
        this.capacidad= capacidad;
        
        //System.out.print("entro aca!\n");
         File myObj = new File("C:\\Users\\WINDOWS 10\\Documents\\NetBeansProjects\\Proyecto\\src\\Archivos\\cursos.txt");                                         
                     
        try {
            FileWriter escritor = new FileWriter(myObj, true); // true para agregar (append)  
            escritor.write("Id: " + id + " | ");
            escritor.write(nombre + " | "); 
            escritor.write(descripcion + " | "); 
            escritor.write(id_profesor + " | ");
            escritor.write(capacidad + " | ");            
            System.out.print("Curso Agregado al Sistema!\n");
            escritor.close();       
        } catch (IOException ex) {
            Logger.getLogger(estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
    }

   /* public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Profesor: " + profesor.nombre;
    }*/
}