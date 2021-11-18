import java.util.ArrayList;

public class Estudiante extends Usuario {
    //ATRIBUTOS
    private String carrera;
    private ArrayList<String> materiasAprobadas = new ArrayList();
    private ArrayList<String> materiasInscriptas = new ArrayList();

    //CONSTRUCTORES

    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }

    //GETTERS Y SETTERS

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    //METODOS

    public void imprimirMateriasAprobadas(Estudiante estudiante) {
        for (int i = 0; i < materiasAprobadas.size(); i++) {
            System.out.println("Materias aprobadas" + this.materiasAprobadas.get(i));

        }
    }

    public void imprimirMateriasInscriptas(Estudiante estudiante) {
        for (int i = 0; i < materiasInscriptas.size(); i++) {
            System.out.println("Materias Inscriptas" + this.materiasInscriptas.get(i));

        }

    }
}
