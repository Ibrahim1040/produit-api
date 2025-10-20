package com.produit.produit.service;

import com.produit.produit.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private  final PersonRepository personRepository;
}
