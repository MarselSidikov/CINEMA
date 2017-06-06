package ru.itis.models;

import javax.persistence.*;
import java.net.URL;
import java.util.List;

/**
 * 03.05.2017
 * Film
 *
 * @author Veronika Sotskova (ITIS)
 * @version v1.0
 */
@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
    @Column
    private int duration;
    @Column
    private double rating;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "actor_film",
            joinColumns = {
            @JoinColumn(name = "film_id") },
            inverseJoinColumns = {
            @JoinColumn(name = "actor_id")})
    private List<Actor> actors;

    @Column
    private String poster;

    @Column(name = "is3d")
    private boolean is3D;

    @Column
    private String trailer;

    @Column
    private String description;

    public Film() {
        this.id = 0;
        this.name = null;
        this.duration = 0;
        this.rating = 0;
        this.actors = null;
        this.poster = null;
        this.is3D = false;
        this.trailer = null;
        this.description = null;
    }

    public Film(int id, String name, int duration, double rating, List<Actor> actors, String poster, boolean is3D, String trailer, String description) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        this.actors = actors;
        this.poster = poster;
        this.is3D = is3D;
        this.trailer = trailer;
        this.description = description;
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

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public boolean getIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || !(object instanceof Film)) {
            return false;
        } else {
            Film that = (Film) object;
            return this.id == that.id
                    && this.name.equals(that.name)
                    && this.duration == that.duration
                    && this.rating == that.rating
                    && this.actors.equals(that.actors)
                    && this.poster.equals(that.poster)
                    && this.is3D == that.is3D;

        }
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.duration + " " + this.rating + " " + actors.toString() + " " +
                this.poster + " " + this.is3D;
    }
}