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

    private Hall hall;
    private List<Integer> listOfPlaces;

    public Place() {
        this.hall = null;
        this.listOfPlaces = null;
    }

    public Place(Hall hall, List<Integer> listOfPlaces) {
        this.hall = hall;
        this.listOfPlaces = listOfPlaces;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public List<Integer> getListOfPlaces() {
        return listOfPlaces;
    }

    public void setListOfPlaces(List<Integer> listOfPlaces) {
        this.listOfPlaces = listOfPlaces;
    }

    @Override
    public String toString() {
        return hall + " " +
                listOfPlaces;

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
                    this.listOfPlaces.equals(that.listOfPlaces);
        }
    }
}



