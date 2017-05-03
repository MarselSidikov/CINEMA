package models;

import com.sun.xml.internal.bind.v2.model.core.ID;

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
    private int place;

    public Ticket(){}

    public Ticket(int id, User user, Seance seance, int place) {
        this.id = id;
        this.user = user;
        this.seance = seance;
        this.place = place;
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

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String toString() {
        return "Ticket{" +
                "id:" + id +
                ", user:" + user +
                ", seance:" + seance +
                ", place:" + place +
                '}';
    }
   
}
