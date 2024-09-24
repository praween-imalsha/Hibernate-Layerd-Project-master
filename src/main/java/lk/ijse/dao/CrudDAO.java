package lk.ijse.dao;

public interface CrudDAO<T> {
    public boolean save(T object);
    public boolean update(T object);
    public boolean delete(String value);
    public T get(String value);
}
