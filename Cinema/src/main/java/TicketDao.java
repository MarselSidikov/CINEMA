import models.Hall;
import models.Place;
import models.Seance;
import models.User;

import java.util.List;

public interface TicketDao {

    void assignId();

     void writeSeance(Seance seance);

      List<Place>writePlace(Hall hall);

     void giveToTheUser(User user);

}
