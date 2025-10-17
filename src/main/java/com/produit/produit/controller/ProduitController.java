package com.produit.produit.controller;

import com.produit.produit.model.Produit;
import com.produit.produit.service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produits")
@RequiredArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @GetMapping("/all")
    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

    @PostMapping
    public Produit createProduit(@RequestBody Produit produit){
        return produitService.createProduit(produit);
    }

    @GetMapping("{id}")
    public Produit getProduitId(@PathVariable long id){
        return produitService.getProduitById(id);
    }

    @DeleteMapping("{id}")
    public String deleteProduitById(@PathVariable long id){
        return produitService.deleteProduitById(id);
    }

    @PutMapping("{id}")
    public Produit editProduit(@PathVariable long id,@RequestBody Produit produit){
        return produitService.editProduit(id,produit);
    }

}
