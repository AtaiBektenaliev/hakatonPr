package com.example.hakaton2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pnr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String flightNumberPnr;
    private String departureDatePnr;
    private String departurePnr;
    private String arrivalPnr;
    private String terminalPnr;
    private String departureTimePnr;
    private String arrivalTimePnr;
    private String companiesPnr;

    //поля которые не видет user
    private String dayOfDeparturePnr;
    private String planeTypePnr;
    private String eTicketPnr;
}
