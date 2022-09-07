package service;

import java.util.List;
import java.util.Optional;

public interface EstudanteService <T>{

    public List<T> findAllEstudantes();
    public Optional<T> findEstudanteById(Long id);
    public T addEstudante(T t);
    public String deleteEstudante(Long id);
    public String updateEstudante(T t);
}
