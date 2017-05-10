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
    private int hall_Number;

    public Hall() {
        this.id = 0;
        this.places = null;
        this.hall_Number = 0;
    }

    public Hall(int id, List<Place> places, int hall_Number) {
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

    public int getHall_Number() {
        return hall_Number;
    }

    public void setHall_Number(int hall_Number) {
        this.hall_Number = hall_Number;
    }


    @Override
    public String toString() {
        return this.id + " " + this.places + " " + this.hall_Number;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || !(object instanceof User)) {
            return false;
        } else {
            Hall that = (Hall)object;

            return this.id == that.id
                    && this.places.equals(that.places)
                     && this.hall_Number == that.hall_Number;
        }
    }

}