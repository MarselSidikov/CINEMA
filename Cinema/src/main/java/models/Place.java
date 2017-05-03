package models;

import java.util.List;

/**
 * 03.05.2017
 * Place
 *
 * @author Guzel
 * @version v1.0
 */
public class Place {

    Hall hall;
    List<Integer> listOfPlaces;

    public Place(Hall hall, List<Integer> listOfPlaces) {
        this.hall = hall;
        this.listOfPlaces = listOfPlaces;
    }

    public Place() {
    }

    ;


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
        if (obj != null && obj instanceof Place) {
            Place that = (Place) obj;
            return this.hall.equals(that.hall) &&
                    this.listOfPlaces == that.listOfPlaces;
        } else return false;
    }
}
