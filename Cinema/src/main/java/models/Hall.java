package models;

public class Hall {
    private int HallId;
    private String name;
    private int HallPlacesNum[];

    public Hall(String name, int HallPlaces) {
        this.name = name;
        this.HallPlacesNum = HallPlacesNum;
    }
    public Hall(int HallId, String name, int hallPlacesNum) {
        this(name, hallPlacesNum);
        this.HallId = HallId;
    }
    public int getHallId(){
        return HallId;
    }
    public void setHallId(int hallId){
        this.HallId = hallId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHallPlacesNum(){
        return HallPlacesNum[getHallPlacesNum()];
    }
    public void setHallPlacesNum(int hallPlacesNum[]){
        this.HallPlacesNum = hallPlacesNum;
    }
    @Override
    public String toString(){
        return HallId + " " + this.name + " " + this.HallPlacesNum;
    }
}
