package models;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * 03.05.2017
 * Film
 *
 * @author Veronika Sotskova (ITIS)
 * @version v1.0
 */
public class Film {
    private int id;
    private String name;
    private int duration;
    private double rating;
    private List<String> actors;
    private URL poster;
    private boolean is3D;

    public Film() {
        this.id = 0;
        this.name = null;
        this.duration = 0;
        this.rating = 0;
        this.actors = null;
        this.poster = null;
        this.is3D = false;
    }

    public Film(int id, String name, int duration, int rating, List<String> actors, URL poster, boolean is3D) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        this.actors = actors;
        this.poster = poster;
        this.is3D = is3D;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public URL getPoster() {
        return poster;
    }

    public void setPoster(URL poster) {
        this.poster = poster;
    }

    public boolean is3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public boolean equals(Object object) {
        // TODO: doing as User-equals, and fields equals
        if (!(object instanceof Film)) {
            return false;
        }
        Film that = (Film) object;
        return this.getId() == that.getId()
                && this.getName().equals(that.getName())
                && this.getDuration() == that.getDuration()
                && this.getRating() == that.getRating()
                && this.getActors().equals(that.getActors())
                && this.getPoster().equals(that.getPoster())
                && this.is3D == that.is3D;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.duration + " " + this.rating + " " + actors.toString() + " " +
                this.poster + " " + this.is3D;
    }
}