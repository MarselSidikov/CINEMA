package models;

import java.util.List;

/**
 * 03.05.2017
 * Film
 *
 * @author Karim Ahmetshin (ITIS)
 * @version v1.0
 */
public class Hall {
    private int id;
    private Cinema cinema;
    private List<Place> places;

    public Hall() {
        this.id = 0;
        this.cinema = null;
        this.places = null;
    }

    public Hall(int id, Cinema cinema, List<Place> places) {
        this.id = id;
        this.cinema = cinema;
        this.places = places;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return this.id + " " + this.cinema + " " + this.places;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || !(object instanceof User)) {
            return false;
        } else {
            Hall that = (Hall) object;
            return this.id == that.id
                    && this.cinema.equals(that.cinema)
                    & that.places.equals(that.places);
        }
    }
}