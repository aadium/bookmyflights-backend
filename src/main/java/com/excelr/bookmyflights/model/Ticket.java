package com.excelr.bookmyflights.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tickets")
public class Ticket {
    @Id
    private String ticketId;
    private String flightId;
    private String passengerId;
    private String seatClass; // Economy, Business, First
    private String seatNumber;
    private int checkedInBagsAmount; // Number of bags checked in

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getFlightId() {
        return this.flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPassengerId() {
        return this.passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getSeatClass() {
        return this.seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getCheckedInBagsAmount() {
        return this.checkedInBagsAmount;
    }

    public void setCheckedInBagsAmount(int checkedInBagsAmount) {
        this.checkedInBagsAmount = checkedInBagsAmount;
    }

    public Ticket() {
    }

    public Ticket(String ticketId, String flightId, String passengerId, String seatClass, String seatNumber, int checkedInBagsAmount) {
        this.ticketId = ticketId;
        this.flightId = flightId;
        this.passengerId = passengerId;
        this.seatClass = seatClass;
        this.seatNumber = seatNumber;
        this.checkedInBagsAmount = checkedInBagsAmount;
    }

    @Override
    public String toString() {
        return "{" +
            " ticketId='" + getTicketId() + "'" +
            ", flightId='" + getFlightId() + "'" +
            ", passengerId='" + getPassengerId() + "'" +
            ", seatClass='" + getSeatClass() + "'" +
            ", seatNumber='" + getSeatNumber() + "'" +
            ", checkedInBagsAmount='" + getCheckedInBagsAmount() + "'" +
            "}";
    }
}
