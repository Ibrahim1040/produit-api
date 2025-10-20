package com.produit.produit.controller;

import com.produit.produit.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;
}
