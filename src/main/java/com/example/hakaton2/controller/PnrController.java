package com.example.hakaton2.controller;

import com.example.hakaton2.entity.Pnr;
import com.example.hakaton2.service.PnrService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PnrController {
    PnrService service;

    @GetMapping("/decoding/{code}")
    Pnr decodePnr(String code){
        return service.decode(code);
    }
}
