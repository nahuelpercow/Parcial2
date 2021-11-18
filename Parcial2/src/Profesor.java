import java.util.ArrayList;

public class Profesor extends Usuario {
    //ATRIBUTOS
    private ArrayList<String> comisiones= new ArrayList<>();

    //CONSTRUCTORES
    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

    //METODOS

    public void imprimirComisiones(Profesor profesor){
        for (int i = 0; i < comisiones.size(); i++) {
            System.out.println("Comisiones" + this.comisiones.get(i));

        }

    }

}
