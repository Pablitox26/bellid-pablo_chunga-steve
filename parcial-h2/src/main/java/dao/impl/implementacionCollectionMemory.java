package dao.impl;

import dao.BD;
import dao.IDAO;
import modelo.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class implementacionCollectionMemory implements IDAO<Odontologo> {
    private static final Logger LOGGER = Logger.getLogger(implementacionCollectionMemory.class);
    private List<Odontologo> odontologos = new ArrayList<>();
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        odontologos.add(odontologo);
        LOGGER.info("Guardamos el odontologo con nombre: " + odontologo.getNombre());
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        return new ArrayList<>(odontologos);
    }
}