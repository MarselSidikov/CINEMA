package models;

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
        this.id = 0;
    }

    public Place(int id, Hall hall, int placeNumber) {
        this.id = id;
        this.hall = hall;
        this.placeNumber = placeNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    @Override
    public String toString() {
        return id + " " + hall + " " +
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
            return this.id == that.id && this.hall.equals(that.hall) &&
                    this.placeNumber == that.placeNumber;
        }
    }
}



