import dao.BD;
import modelo.Odontologo;
import servicio.OdontologoServicio;

public class Main {
    public static void main(String[] args) {
        BD.createTable();

        Odontologo odontologo1 = new Odontologo("1",
                "Steve",
                "Jobs"
                );

        Odontologo odontologo2 = new Odontologo("2",
                "Bill",
                "Gates"
                );

        Odontologo odontologo3 = new Odontologo("3",
                "Mark",
                "Zuckerberg"
                );

        OdontologoServicio servicio = new OdontologoServicio();

        servicio.guardar(odontologo1);
        servicio.guardar(odontologo2);
        servicio.guardar(odontologo3);

        servicio.listarTodos();
    }
}
