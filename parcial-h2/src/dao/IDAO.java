package dao;

import java.util.List;

public interface IDAO<T> {
    //crear
    T guardar (T t);

    //consultar todos los T
    List<T> listarTodos();
}
