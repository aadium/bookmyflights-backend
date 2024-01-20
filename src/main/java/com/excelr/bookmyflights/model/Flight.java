package com.excelr.bookmyflights.model;

import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "flights")
public class Flight {
    @Id
    private UUID flightId;
    private HashMap<String, String> flightAirlineNumbers; // [Airline: Flight Number]
    private Duration [] flightDurations;
    private String source;
    private String destination;
    private Date departureTime;
    private Date arrivalTime;
    private int SeatsAvailable;
    private HashMap<String, Integer> classPrice; // [Class: Price]
    private HashMap<String, Duration> flightLayoversDurations; // [Layover Airport: Duration]

    public UUID getFlightId() {
        return this.flightId;
    }

    public void setFlightId(UUID flightId) {
        this.flightId = flightId;
    }

    public HashMap<String,String> getFlightAirlineNumbers() {
        return this.flightAirlineNumbers;
    }

    public void setFlightAirlineNumbers(HashMap<String,String> flightAirlineNumbers) {
        this.flightAirlineNumbers = flightAirlineNumbers;
    }

    public Duration[] getFlightDurations() {
        return this.flightDurations;
    }

    public void setFlightDurations(Duration[] flightDurations) {
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

    public Date getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getSeatsAvailable() {
        return this.SeatsAvailable;
    }

    public void setSeatsAvailable(int SeatsAvailable) {
        this.SeatsAvailable = SeatsAvailable;
    }

    public HashMap<String,Integer> getClassPrice() {
        return this.classPrice;
    }

    public void setClassPrice(HashMap<String,Integer> classPrice) {
        this.classPrice = classPrice;
    }

    public HashMap<String,Duration> getFlightLayoversDurations() {
        return this.flightLayoversDurations;
    }

    public void setFlightLayoversDurations(HashMap<String,Duration> flightLayoversDurations) {
        this.flightLayoversDurations = flightLayoversDurations;
    }


    public Flight() {
    }

    public Flight(UUID flightId, HashMap<String,String> flightAirlineNumbers, Duration[] flightDurations, String source, String destination, Date departureTime, Date arrivalTime, int SeatsAvailable, HashMap<String,Integer> classPrice, HashMap<String,Duration> flightLayoversDurations) {
        this.flightId = flightId;
        this.flightAirlineNumbers = flightAirlineNumbers;
        this.flightDurations = flightDurations;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.SeatsAvailable = SeatsAvailable;
        this.classPrice = classPrice;
        this.flightLayoversDurations = flightLayoversDurations;
    }

    @Override
    public String toString() {
        return "{" +
            " flightId='" + getFlightId() + "'" +
            ", flightAirlineNumbers='" + getFlightAirlineNumbers() + "'" +
            ", flightDurations='" + getFlightDurations() + "'" +
            ", source='" + getSource() + "'" +
            ", destination='" + getDestination() + "'" +
            ", departureTime='" + getDepartureTime() + "'" +
            ", arrivalTime='" + getArrivalTime() + "'" +
            ", SeatsAvailable='" + getSeatsAvailable() + "'" +
            ", classPrice='" + getClassPrice() + "'" +
            ", flightLayoversDurations='" + getFlightLayoversDurations() + "'" +
            "}";
    }
}