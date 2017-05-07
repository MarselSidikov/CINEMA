package models;

import java.time.LocalDate;

/**
 * 03.05.2017
 * Seance
 *
 * @author Ruslan Korchenov (ITIS)
 * @version v1.0
 */
public class Seance {
    private int id;
    private Hall hall;
    private int price;
    private LocalDate time;
    private Film film;

    public Seance() {
        this.id = 0;
        this.hall = null;
        this.price = 0;
        this.time = null;
        this.film = null;
    }

    public Seance(int id, Hall hall, int price, LocalDate time, Film film) {
        this.id = id;
        this.hall = hall;
        this.price = price;
        this.time = time;
        this.film = film;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || !(o instanceof User)) {
            return false;
        } else {
            Seance that = (Seance) o;
            return this.id == that.id
                    && this.hall.equals(that.hall)
                    && this.price == that.price
                    && this.time.equals(that.time)
                    && this.film.equals(that.film);
        }
    }

    @Override
    public String toString() {
        return this.id + " " + this.hall + " " + this.price + " " + this.time + " " + this.film;
    }
}
