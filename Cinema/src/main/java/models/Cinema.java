package models;

import java.util.List;

/**
 * 03.05.2017
 * Cinema
 *
 * @author Marat Shigabutdinov (ITIS)
 * @version v1.0
 */
public class Cinema {
    private int id;
    private String name;
    private String location;
    private int countSits;
    private List<Seance> seances;
    private List<Hall> halls;

    public Cinema() {
    }

    public Cinema(int id, String name, String location, int countSits, List<Seance> seances, List<Hall> halls) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.countSits = countSits;
        this.seances = seances;
        this.halls = halls;
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

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public void setHalls(List<Hall> halls) {
        this.halls = halls;
    }

    @Override
    public String toString() {
        // TODO: done
        return  id + " " + this.name + " " + this.location + " " + this.countSits;
    }

    public boolean equals(Object o) {
        // TODO: done as User
        if (o instanceof Cinema && o != null) {
            Cinema that = (Cinema)o;
            return this.name.equals(that.name) &&
                    this.countSits == that.countSits && this.location == that.location;
        } else return false;
    }
}
