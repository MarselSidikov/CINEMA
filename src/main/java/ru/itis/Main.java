package ru.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import ru.itis.config.AppConfig;
import ru.itis.dao.ActorsDao;
import ru.itis.dao.FilmDao;
import ru.itis.models.Actor;
import ru.itis.models.Film;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ActorsDao actorsDao = context.getBean(ActorsDao.class);

        List<Actor> actors = actorsDao.findAll();

        for (Actor actor : actors) {
            System.out.println(actor);
        }

        FilmDao filmDao = context.getBean(FilmDao.class);

        List<Film> films = filmDao.findAll();

        for (Film film : films) {
            System.out.println(film);
        }
    }
}
