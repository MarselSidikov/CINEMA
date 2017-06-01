package models;

import java.util.List;

/**
 * 03.05.2017
 * Ticket
 *
 * @author Maxim Marshalov (ITIS)
 * @version v1.0
 */
public class Ticket {
    private int id;
    private User user;
    private Seance seance;
    private List<Place> places;

    public Ticket() {
    }

    public Ticket(int id, User user, Seance seance, List<Place> places) {
        this.id = id;
        this.user = user;
        this.seance = seance;
        this.places = places;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    // TODO: equals done

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
