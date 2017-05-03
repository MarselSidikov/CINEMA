import models.Film;
import models.Place;
import models.Seance;
import models.User;

import java.util.List;

/**
 * 03.05.2017
 * CinemaService
 *
 * @author Guzel
 * @version v1.0
 */
public interface CinemaService {

    //sign up
    void signUp(User user);

    //получить_список_фильмов
    List<Film> getListOfFilms(User user);

    //выбирать_фильм
    Film getFilm(User user, Film film);

    //получить_список_сеансов
    List<Seance> getListOfSeance(User user, Film film);

    //получить_места
    int[] getPlace(User user, Seance seance);

    //забронировать_место
    void reservePlace(User user, Place place);

}
