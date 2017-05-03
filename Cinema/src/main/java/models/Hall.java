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
        return id + " " + this.cinema + " " + this.places;
    }

    // TODO: equals
}
