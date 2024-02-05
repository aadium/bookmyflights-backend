package com.excelr.bookmyflights.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "flights")
public class Flight {
    @Id
    private String flightId;
    private String [] airlines;
    private String [] flightNumbers;
    private String [] flightDurations;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int seatsAvailable;
    private String [] layovers;
    private String [] layoverDurations;
    private String [] classes;
    private double [] prices;

    public String getFlightId() {
        return this.flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String[] getAirlines() {
        return this.airlines;
    }

    public void setAirlines(String[] airlines) {
        this.airlines = airlines;
    }

    public String[] getFlightNumbers() {
        return this.flightNumbers;
    }

    public void setFlightNumbers(String[] flightNumbers) {
        this.flightNumbers = flightNumbers;
    }

    public String[] getFlightDurations() {
        return this.flightDurations;
    }

    public void setFlightDurations(String[] flightDurations) {
        this.flightDurations = flightDurations;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getSeatsAvailable() {
        return this.seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public String[] getLayovers() {
        return this.layovers;
    }

    public void setLayovers(String[] layovers) {
        this.layovers = layovers;
    }

    public String[] getLayoverDurations() {
        return this.layoverDurations;
    }

    public void setLayoverDurations(String[] layoverDurations) {
        this.layoverDurations = layoverDurations;
    }

    public String[] getClasses() {
        return this.classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public double[] getPrices() {
        return this.prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    public Flight() {
    }

    public Flight(String flightId, String[] airlines, String[] flightNumbers, String[] flightDurations, String source, String destination, String departureTime, String arrivalTime, int seatsAvailable, String[] layovers, String[] layoverDurations, String[] classes, double[] prices) {
        this.flightId = flightId;
        this.airlines = airlines;
        this.flightNumbers = flightNumbers;
        this.flightDurations = flightDurations;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatsAvailable = seatsAvailable;
        this.layovers = layovers;
        this.layoverDurations = layoverDurations;
        this.classes = classes;
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "{" +
            " flightId='" + getFlightId() + "'" +
            ", airlines='" + getAirlines() + "'" +
            ", flightNumbers='" + getFlightNumbers() + "'" +
            ", flightDurations='" + getFlightDurations() + "'" +
            ", source='" + getSource() + "'" +
            ", destination='" + getDestination() + "'" +
            ", departureTime='" + getDepartureTime() + "'" +
            ", arrivalTime='" + getArrivalTime() + "'" +
            ", seatsAvailable='" + getSeatsAvailable() + "'" +
            ", layovers='" + getLayovers() + "'" +
            ", layoverDurations='" + getLayoverDurations() + "'" +
            ", classes='" + getClasses() + "'" +
            ", prices='" + getPrices() + "'" +
            "}";
    }
}