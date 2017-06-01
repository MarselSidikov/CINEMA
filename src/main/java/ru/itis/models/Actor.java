package ru.itis.models;

/**
 * 08.05.2017
 * Actor
 *
 * @author Veronika Sotskova (First Software Engineering Platform)
 * @version v1.0
 */
public class Actor {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Actor() {
        this.id = 0;
        this.firstName = null;
        this.lastName = null;
        this.age = 0;
    }

    public Actor(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || !(object instanceof Actor)) {
            return false;
        } else {
            Actor that = (Actor) object;
            return this.id == that.id
                    && this.firstName.equals(that.firstName)
                    && this.lastName.equals(that.lastName)
                    && this.age == that.age;
        }
    }

    public String toString() {
        return this.id + " " + this.firstName + " " + this.lastName + " " + this.age;
    }
}
