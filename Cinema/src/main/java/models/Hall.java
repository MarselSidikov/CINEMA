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
    private List<Place> places;

    public Hall() {
        this.id = 0;
        this.places = null;
    }

    public Hall(int id, List<Place> places) {
        this.id = id;
        this.places = places;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return this.id + " " + this.places;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || !(object instanceof User)) {
            return false;
        } else {
            Hall that = (Hall)object;
            return this.id == that.id
                    && this.places.equals(that.places);
        }
    }
}