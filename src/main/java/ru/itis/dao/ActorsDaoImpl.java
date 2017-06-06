package ru.itis.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.models.Actor;

import java.util.List;

@Component
public class ActorsDaoImpl implements ActorsDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int save(Actor model) {
        return 0;
    }

    @Override
    public void update(Actor model) {

    }

    @Override
    public Actor find(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Actor> findAll() {
        // открыли сессию
        Session session = sessionFactory.openSession();
        // начали операцию
        session.beginTransaction();
        // вытащили всех актеров
        List<Actor> actors = session.createQuery("from Actor", Actor.class).list();
        // завершаем операцию
        session.getTransaction().commit();
        return actors;
    }
}
