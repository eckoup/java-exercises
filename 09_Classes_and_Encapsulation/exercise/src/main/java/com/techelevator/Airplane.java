package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int availableFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats=totalFirstClassSeats;
        this.totalCoachSeats=totalCoachSeats;
        this.availableFirstClassSeats=totalFirstClassSeats;
        this.availableCoachSeats=totalCoachSeats;
    }
    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass && availableFirstClassSeats >= totalNumberOfSeats) {
            this.bookedFirstClassSeats = totalNumberOfSeats + this.bookedFirstClassSeats;
            availableFirstClassSeats = (availableFirstClassSeats - totalNumberOfSeats);
            return true;
        } else if (!forFirstClass && availableCoachSeats >= totalNumberOfSeats) {
            this.bookedCoachSeats = totalNumberOfSeats + this.bookedCoachSeats;
            availableCoachSeats = (availableCoachSeats-totalNumberOfSeats);
            return true;
        } else{
            return false;
        }
    }
    public String getPlaneNumber(){
        return planeNumber;
    }
    public int getTotalFirstClassSeats(){
        return totalFirstClassSeats;
    }
    public int getBookedFirstClassSeats(){
        return bookedFirstClassSeats;
    }
    public int getAvailableFirstClassSeats(){
        return availableFirstClassSeats;
    }
    public int getTotalCoachSeats(){
        return totalCoachSeats;
    }
    public int getBookedCoachSeats(){
        return bookedCoachSeats;
    }
    public int getAvailableCoachSeats() {
        return availableCoachSeats;
    }
}
