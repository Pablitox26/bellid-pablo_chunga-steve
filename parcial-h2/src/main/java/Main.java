import dao.BD;
import modelo.Odontologo;
import servicio.OdontologoMemoryServicio;
import servicio.OdontologoServicio;

public class Main {
    public static void main(String[] args) {
        BD.createTable();

        OdontologoServicio servicio = new OdontologoServicio();

        OdontologoMemoryServicio servicioMemory = new OdontologoMemoryServicio();

        Odontologo odontologo1 = new Odontologo(1,
                "Steve",
                "Jobs",
                "Matricula 01"
        );

        Odontologo odontologo2 = new Odontologo(2,
                "Bill",
                "Gates",
                "Matricula 02"
        );

        Odontologo odontologo3 = new Odontologo(3,
                "Mark",
                "Zuckerberg",
                "Matricula 03"
        );

        servicio.guardar(odontologo1);
        servicio.guardar(odontologo2);
        servicio.guardar(odontologo3);

        servicioMemory.guardar(odontologo1);
        servicioMemory.guardar(odontologo2);
        servicioMemory.guardar(odontologo3);

        servicio.listarTodos();
        servicioMemory.listarTodos();
    }
}
