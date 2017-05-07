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
        this.id = 0;
        this.name = null;
        this.location = null;
        this.countSits = 0;
        this.seances = null;
        this.seances = null;
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
        return  id + " " + this.name + " " + this.location + " " + this.countSits + " " + this.seances + " " + this.halls;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || !(object instanceof Cinema)) {
            return false;
        } else {
            Cinema that = (Cinema) object;
            return this.id == that.id &&
                    this.name.equals(that.name) &&
                    this.location.equals(that.location) &&
                    this.countSits == that.countSits &&
                    this.seances.equals(that.seances) &&
                    this.halls.equals(that.halls);

        }
    }
}
