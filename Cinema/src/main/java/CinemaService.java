import models.*;

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
    User signUp(User user);

    //получить_список_фильмов
    List<Film> getListOfFilms(User user);

    //получить_список_сеансов
    List<Seance> getListOfSeance(User user, Film film);

    //получить_места
    List<Place> getPlace(User user, Seance seance);

    //забронировать_место
    Ticket reservePlace(User user, Place place);
}
