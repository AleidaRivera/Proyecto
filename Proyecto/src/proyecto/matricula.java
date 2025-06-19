
package proyecto;

class Matricula {
    estudiante estudiante;
    Curso curso;

    public Matricula(estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public String toString() {
        return "Estudiante: " + estudiante.nombre + ", Curso: " + curso.nombre;
    }
}