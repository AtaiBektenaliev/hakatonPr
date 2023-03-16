package com.example.hakaton2.service;

import com.example.hakaton2.entity.Pnr;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PnrService {
    public Pnr decode(String code){
        Pnr model = new Pnr();
        model.setCompaniesPnr(code.substring(0, 2));
        model.setFlightNumberPnr(code.substring(2, 5));
        model.setDepartureDatePnr(code.substring(6, 11));
        model.setDeparturePnr(code.substring(12, 18));
        model.setArrivalPnr(code.substring(12, 18));
        model.setTerminalPnr(code.substring(18, 21));
        model.setDepartureTimePnr(code.substring(21, 25));
        model.setArrivalTimePnr(code.substring(25, 29));
        model.setDayOfDeparturePnr(code.substring(11, 12));
        model.setPlaneTypePnr(code.substring(29, 32));
        model.setETicketPnr(code.substring(32, 33));
        return model;
    }
}
