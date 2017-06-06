package ru.itis.models;

/**
 * 03.05.2017
 * User
 *
 * @author Sergey Tikhomirov (ITIS)
 * @version v1.0
 */
public class User {

    private int id;
    private String password;
    private String firstName;
    private String lastName;
    private String login;

    public User() {
        this.id = 0;
        this.password = null;
        this.firstName = null;
        this.lastName = null;
        this.login = null;
    }

    public User(int id, String password, String firstName, String lastName, String login) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || !(object instanceof User)) {
            return false;
        } else {
            User that = (User) object;
            return this.id == that.id &&
                    this.firstName.equals(that.firstName) &&
                    this.lastName.equals(that.lastName) &&
                    this.login.equals(that.login) &&
                    this.password.equals(that.password);

        }
    }

    public String toString(){
        return this.login + " " +this.password + " " + this.firstName + " " +this.lastName + " " + this.id;
    }

}
