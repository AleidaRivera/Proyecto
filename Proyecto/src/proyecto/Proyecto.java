package proyecto;
import java.util.*;

public class Proyecto {

   static Scanner scanner = new Scanner(System.in);

    /*static List<estudiante> estudiantes = new ArrayList<>();
    static List<Profesor> profesores = new ArrayList<>();
    static List<Curso> cursos = new ArrayList<>();
    static List<Matricula> matriculas = new ArrayList<>();*/

    public static void main(String[] args) {
        int opcion;                   
             
        do {
            System.out.println("\n--- REGISTRO UNIVERSIDAD UISIL ---");
            System.out.println("\n*********************************");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Ingresar profesor");
            System.out.println("3. Ingresar curso");
            System.out.println("4. Registrar matricula");
            System.out.println("5. Mostrar registros");
            System.out.println("0. Salir");
            System.out.println("***********************************");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // limpiar buffer

            switch (opcion) {
                case 1 -> ingresarEstudiante();  
                case 2 -> ingresarProfesor();
                case 3 -> ingresarCurso();
                case 4 -> registrarMatricula();
                case 5 -> mostrarRegistros();
                case 0 -> System.out.println("Saliendo del Sistema.");
                default -> System.out.println("Opcion invalida, escoja una opcion valida");
            }
        } while (opcion != 0);
    }

    static void ingresarEstudiante() {   
        
        archivo_estudiante archivo_estudiante = new archivo_estudiante();        
        archivo_estudiante.archivo_estudiante();
    }

    static void ingresarProfesor() {
        //System.out.println("3. Ingresa aca profesor");
        archivo_profesor archivo_profesor = new archivo_profesor();        
        archivo_profesor.archivo_profesor();
    }

    static void ingresarCurso() {
        
        archivo_cursos archivo_cursos = new archivo_cursos();        
        archivo_cursos.archivo_cursos();
        
       /* if (profesores.isEmpty()) {
            System.out.println("Debe ingresar al menos un profesor primero.");
            return;
        }
        System.out.print("ID del curso: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombre del curso: ");
        String nombre = scanner.nextLine();

        System.out.println("Seleccione el profesor:");
        for (int i = 0; i < profesores.size(); i++) {
            System.out.println((i + 1) + ". " + profesores.get(i));
        }
        int opcion = scanner.nextInt();
        Profesor profesor = profesores.get(opcion - 1);

        cursos.add(new Curso(id, nombre, profesor));
        System.out.println("Curso agregado.");*/
    }

    static void registrarMatricula() {
      /*  if (estudiantes.isEmpty() || cursos.isEmpty()) {
            System.out.println("Debe haber al menos un estudiante y un curso registrado.");
            return;
        }
        System.out.println("Seleccione el estudiante:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
        int opcionEst = scanner.nextInt();
        //Estudiante estudiante = estudiantes.get(opcionEst - 1);

        System.out.println("Seleccione el curso:");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println((i + 1) + ". " + cursos.get(i));
        }
        int opcionCurso = scanner.nextInt();
        Curso curso = cursos.get(opcionCurso - 1);

       // matriculas.add(new Matricula(estudiante, curso));
        //System.out.println("Matricula registrada.");*/
    }

    static void mostrarRegistros() {
       /* System.out.println("\n--- Estudiantes ---");
        estudiantes.forEach(System.out::println);
      
        System.out.println("\n--- Profesores ---");
        profesores.forEach(System.out::println);
        
        System.out.println("\n--- Cursos ---");
        cursos.forEach(System.out::println);
        
        System.out.println("\n--- Matrículas ---");
        matriculas.forEach(System.out::println);*/
        
    }
        
}
    
