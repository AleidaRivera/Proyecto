# Sistema de Gestión Académica

## Descripción
Aplicación de consola en Java para gestionar estudiantes, profesores y cursos de una institución educativa. Los datos se guardan en archivos .txt

## Qué hace el programa
- Registrar estudiantes, profesores y cursos
- Matricular estudiantes en cursos
- Ver listas de cursos y estudiantes
- Guardar todo en archivos de texto

## Clases principales

**Persona** (clase base)
- nombres, apellidos, email, teléfono

**Estudiante** (hereda de Persona)
- carnet, carrera, nivel

**Profesor** (hereda de Persona)  
- idProfesor, especialidad, tipoContrato

**Curso**
- codigo, nombre, descripcion, profesor, capacidadMaxima, listaEstudiantes

**Matricula**
- estudiante, curso, fechaMatricula

## Archivos que usa
- `estudiantes.txt` - guarda los estudiantes
- `profesores.txt` - guarda los profesores  
- `cursos.txt` - guarda los cursos
- `matriculas.txt` - guarda las matrículas

## Cómo usar

### Para ejecutar:
1. Tener Java instalado
2. Compilar: `javac *.java`
3. Ejecutar: `java Main`

### Menú principal:

1. Gestionar Estudiantes
2. Gestionar Profesores
3. Gestionar Cursos
4. Matricular Estudiantes
5. Ver Consultas
6. Salir


## Funciones importantes

### Registrar estudiante:
- Pide carnet, nombre, apellidos, email, teléfono, carrera y nivel
- No permite carnets duplicados

### Registrar profesor:
- Pide ID, nombre, apellidos, email, teléfono, especialidad y tipo de contrato
- Tipo de contrato: "Tiempo completo" o "Por horas"

### Registrar curso:
- Pide código, nombre, descripción, profesor y capacidad máxima
- Debe existir el profesor antes de crear el curso

### Matricular estudiante:
- Selecciona estudiante y curso
- Verifica que no esté ya matriculado
- Verifica que el curso no esté lleno

### Consultas:
- Lista de todos los cursos
- Estudiantes de un curso específico
- Cursos de un estudiante específico

## Formato de archivos

**estudiantes.txt:**

carnet|nombres|apellidos|email|telefono|carrera|nivel
2024001|Juan|Perez|aleida@email.com|88887777|Ingenieria|3


**profesores.txt:**

idProfesor|nombres|apellidos|email|telefono|especialidad|tipoContrato
ISB-24|Maria|Lopez|ronnyejemplo@gmail.com|22334455|Matematicas|Tiempo completo
**cursos.txt:**
codigo|nombre|descripcion|idProfesor|capacidadMaxima
MAT101|Calculo I|Matematicas basicas|ISB-23|30

## Validaciones
- No duplicar carnets de estudiantes
- No duplicar IDs de profesores
- No exceder capacidad de cursos
- No matricular dos veces en el mismo curso
- Verificar que existan los profesores al crear cursos

## Errores comunes
- Si no encuentra un archivo, lo crea automáticamente
- Si hay formato incorrecto en archivo, muestra error
- Si se intenta matricular en curso lleno, da aviso

## Estructura de carpetas

proyecto/
├── src/
│   ├── Main.java
│   ├── Persona.java
│   ├── Estudiante.java
│   ├── Profesor.java
│   ├── Curso.java
│   └── Matricula.java
└── datos/
    ├── estudiantes.txt
    ├── profesores.txt
    ├── cursos.txt
    └── matriculas.txt


## Notas
- Los archivos se crean automáticamente si no existen
- Todos los datos se guardan al modificar o salir
- El programa carga los datos al iniciar
- Usa | como separador en los archivos
