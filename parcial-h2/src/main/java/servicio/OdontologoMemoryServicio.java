package servicio;

import dao.IDAO;
import dao.impl.ImplementacionDaoH2;
import dao.impl.implementacionCollectionMemory;
import modelo.Odontologo;

import java.util.List;

public class OdontologoMemoryServicio {
    private IDAO<Odontologo> interfazDAO;

    public OdontologoMemoryServicio() {
        this.interfazDAO = new implementacionCollectionMemory();
    }

    public Odontologo guardar(Odontologo odontologo) {
        return interfazDAO.guardar(odontologo);
    }

    public List<Odontologo> listarTodos() {
        return interfazDAO.listarTodos();
    }
}
