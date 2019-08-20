package com.knn.rcs.controller;

import com.knn.rcs.model.Replacement;
import com.knn.rcs.repository.ReplacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/replacement")
public class ReplacementController {

    @Autowired
    private ReplacementRepository replacementRepository;

    @PostMapping
    public Replacement save(@RequestBody Replacement replacement) {
        return replacementRepository.save(replacement);
    }

}
