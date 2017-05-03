package models;

/**
 * 03.05.2017
 * Seance
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Seance {
    private int id;
    Hall hall;
    private int price;
    private int time;
    Film film;

    public Seance() {
        this.id = 0;
        this.hall = null;
        this.price = 0;
        this.time = 0;
        this.film = null;
    }

    public Seance(int id, Hall hall, int price, int time, Film film) {
        this.id = id;
        this.hall = hall;
        this.price = price;
        if (time >= 0 && time <= 24) {
            this.time = time;
        }
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
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
       if (o instanceof Seance && o != null){
           Seance that = (Seance)o;
           return this.id == that.id
                   && this.hall.equals(that.hall)
                   && this.price == that.price
                   && this.time == that.time
                   && this.film.equals(that.film);
       } else return false;
    }

    @Override
    public String toString() {
        return this.id + " " + this.hall + " " + this.price + " " + this.time + " " + this.film;
    }
}
