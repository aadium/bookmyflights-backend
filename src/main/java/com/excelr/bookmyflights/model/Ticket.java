package com.excelr.bookmyflights.model;

import java.util.UUID;

public class Ticket {
    private UUID ticketId;
    private UUID flightId;
    private UUID passengerId;
    private String seatClass; // Economy, Business, First
    private String seatNumber;
    private int checkedInBagsAmount; // Number of bags checked in

    public UUID getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(UUID ticketId) {
        this.ticketId = ticketId;
    }

    public UUID getFlightId() {
        return this.flightId;
    }

    public void setFlightId(UUID flightId) {
        this.flightId = flightId;
    }

    public UUID getPassengerId() {
        return this.passengerId;
    }

    public void setPassengerId(UUID passengerId) {
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

    public Ticket(UUID ticketId, UUID flightId, UUID passengerId, String seatClass, String seatNumber, int checkedInBagsAmount) {
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
