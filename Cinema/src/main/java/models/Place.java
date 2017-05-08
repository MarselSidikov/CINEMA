package models;

import java.util.List;

/**
 * 03.05.2017
 * Place
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Place {

    private int id;
    private Hall hall;
    private int placeNumber;

    public Place() {
        this.hall = null;
        this.placeNumber = 0;
    }

    public Hall getHall() {
        return hall;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    @Override
    public String toString() {
        return hall + " " +
                placeNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || !(obj instanceof Place)) {
            return false;
        } else {
            Place that = (Place) obj;
            return this.hall.equals(that.hall) &&
                    this.placeNumber == that.placeNumber;
        }
    }
}



