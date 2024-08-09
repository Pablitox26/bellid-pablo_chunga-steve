package servicio;

import dao.IDAO;
import dao.impl.ImplementacionDaoH2;
import dao.impl.ImplementacionCollection;
import modelo.Odontologo;

import java.util.List;

public class OdontologoServicio {
    private IDAO<Odontologo> interfazDAO;

    public OdontologoServicio() {
        this.interfazDAO = new ImplementacionDaoH2();
    }

    public OdontologoServicioCollection() {
        this.interfazDAO = new ImplementacionCollection();
    }

    public Odontologo guardar(Odontologo odontologo) {
        return interfazDAO.guardar(odontologo);
    }

    public List<Odontologo> listarTodos() {
        return interfazDAO.listarTodos();
    }
}
