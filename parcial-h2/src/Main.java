import dao.BD;
import modelo.Odontologo;
import servicio.OdontologoServicio;
import servicio.OdontologoServicioCollection;

public class Main {
    public static void main(String[] args) {
        BD.createTable();

        Odontologo odontologo1 = new Odontologo(
                "Steve",
                "Jobs",
                "1"
                );

        Odontologo odontologo2 = new Odontologo(
                "Bill",
                "Gates",
                "2"
                );

        Odontologo odontologo3 = new Odontologo(
                "Mark",
                "Zuckerberg",
                "3"
                );

        OdontologoServicio servicio1 = new OdontologoServicio();

        servicio1.guardar(odontologo1);
        servicio1.guardar(odontologo2);
        servicio1.guardar(odontologo3);

        servicio1.listarTodos();

        OdontologoServicio servicio2 = new OdontologoServicioCollection();

        servicio2.guardar(odontologo1);
        servicio2.guardar(odontologo2);
        servicio2.guardar(odontologo3);

        servicio2.listarTodos();
    }
}
