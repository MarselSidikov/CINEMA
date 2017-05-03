package models;

import java.util.Arrays;

/**
 * 03.05.2017
 * Film
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Film {
     private int id;
     private String name;
     private int duration;
     private int rating;
     private String[] actors;
     private String poster;
     private String format;

     public Film() {
          this.id = 0;
          this.name = null;
          this.duration = 0;
          this.rating = 0;
          this.actors = null;
          this.poster = null;
          this.format = null;
     }

     public Film(int id, String name, int duration, int rating, String[] actors, String poster, String format) {
          this.id = id;
          this.name = name;
          this.duration = duration;
          this.rating = rating;
          this.actors = actors;
          this.poster = poster;
          this.format = format;
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

     public int getRating() {
          return rating;
     }

     public void setRating(int rating) {
          this.rating = rating;
     }

     public String[] getActors() {
          return actors;
     }

     public void setActors(String[] actors) {
          this.actors = actors;
     }

     public String getPoster() {
          return poster;
     }

     public void setPoster(String poster) {
          this.poster = poster;
     }

     public String getFormat() {
          return format;
     }

     public void setFormat(String format) {
          this.format = format;
     }

     public boolean equals(Object object) {
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
                  && this.getFormat().equals(that.getFormat());
     }

     @Override
     public String toString() {
          return this.id + " " + this.name + " " + this.duration + " " + this.rating + " " + Arrays.toString(actors) + " " +
                  this.poster + " " + this.format;
     }
}