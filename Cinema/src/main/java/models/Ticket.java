package models;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.List;

/**
 * 03.05.2017
 * Ticket
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Ticket {
     private int id;
     private User user;
    private Seance seance;
    private List<Place> places;

    public Ticket(){}

    public Ticket(int id, User user, Seance seance, List<Place> places) {
        this.id = id;
        this.user = user;
        this.seance = seance;
        this.places = places;
    }

    public String toString() {
        return "Ticket{" +
                "id:" + id +
                ", user:" + user +
                ", seance:" + seance +
                ", place:" + places +
                '}';
    }
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || !(object instanceof User)) {
            return false;
        } else {
            Ticket that = (Ticket) object;
            return this.id == that.id &&
                    this.seance.equals(that.seance) &&
                    this.places.equals(that.places)&&
                    this.user.equals(that.user);



        }
    }

}
