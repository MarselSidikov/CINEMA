package models;

/**
 * 03.05.2017
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class User {
    private int id;
    private int password;
    private String firstName;
    private String lastName;
    private String login;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
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

    public User(int id, int password, String firstName, String lastName, String login) {

        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
    }
    public boolean equals(Object object  ){
        if (this == object){
            return true;
        }else if(object == null || !(object instanceof User)){
            return false;

        }else{
            User that = (User)object;
            return this.id == that.id &&
            this.firstName == that.firstName &&
            this.lastName == that.lastName &&
            this.login == that.login &&
            this.password == that.password;

        }
    }
    public String toString(){
        return this.login + "" +this.password + "" + this.firstName + "" +this.lastName + "" + this.id;
    }

}
