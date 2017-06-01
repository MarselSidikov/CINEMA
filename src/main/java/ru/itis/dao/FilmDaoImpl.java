package ru.itis.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.models.Film;

import javax.persistence.Column;
import java.util.List;

@Component
public class FilmDaoImpl implements FilmDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int save(Film model) {
        return 0;
    }

    @Override
    public void update(Film model) {

    }

    @Override
    public Film find(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Film> findAll() {
        // открыли сессию
        Session session = sessionFactory.openSession();
        // начали операцию
        session.beginTransaction();
        // вытащили всех актеров
        List<Film> films = session.createQuery("from Film", Film.class).list();
        // завершаем операцию
        session.getTransaction().commit();
        return films;
    }
}
