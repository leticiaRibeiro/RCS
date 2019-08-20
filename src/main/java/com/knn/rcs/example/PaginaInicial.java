package com.knn.rcs.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaInicial {

    @RequestMapping("/")
    String homePage() {
        return "Oieeeeeeeee";
    }
}

