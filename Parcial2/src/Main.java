public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor(100, "John", "Doe");
        Estudiante estudiante1 = new Estudiante(44729110, "Nahuel", "Percow", "Analista de sistemas");

        System.out.println(estudiante1);
        System.out.println(profesor1);

        estudiante1.getMateriasInscriptas().add(0,"POO");
        estudiante1.getMateriasInscriptas().add(1,"Programacion web 2");
        System.out.println(estudiante1.getMateriasInscriptas());

        estudiante1.getMateriasAprobadas().add(0,"Programacion 1");
        estudiante1.getMateriasAprobadas().add(1,"Programacion web 2");
        estudiante1.getMateriasAprobadas().add(2,"Sistemas empresariales");
        System.out.println(estudiante1.getMateriasAprobadas());

    }

    }
