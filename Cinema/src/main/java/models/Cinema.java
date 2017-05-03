package models;

/**
 * 03.05.2017
 * Cinema
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Cinema {
    private int id;
    private String name;
    private String location;
    private int countSits;

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    private Seance seance;
    private Hall hall;

    public Cinema(int id, String name, String location, int countSits) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.countSits = countSits;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCountSits() {
        return countSits;
    }

    public void setCountSits(int countSits) {
        this.countSits = countSits;
    }



    @Override
    public String toString() {
        return  id + " " + this.name + " " + this.location + " " + this.countSits;
    }
    public boolean equals(Object o) {
        if (o instanceof Cinema && o != null) {
            Cinema that = (Cinema)o;
            return this.name.equals(that.name) &&
                    this.countSits == that.countSits && this.location == that.location;
        } else return false;
    }
}
