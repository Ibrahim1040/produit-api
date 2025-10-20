package com.produit.produit.service;

import com.produit.produit.exceptions.ProduitNotFoundException;
import com.produit.produit.model.Produit;
import com.produit.produit.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProduitService {

    private final ProduitRepository produitRepository;

    public List<Produit> getAllProduits() { return produitRepository.findAll(); }

    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public Produit getProduitById(long id){
        Optional<Produit> optionalProduit = produitRepository.findById(id);

        if(optionalProduit.isEmpty()){
            throw new ProduitNotFoundException("Désolé produit inexistant");
        }
        return optionalProduit.get();

    }

    public String deleteProduitById(long id){
        Optional<Produit> optionalProduit = produitRepository.findById(id);

        if(optionalProduit.isEmpty()){
            throw new RuntimeException("Suppression impossible: produit inexistant");
        }
        produitRepository.delete(optionalProduit.get());
        return "Produit supprimé avec succès ! ";
    }

    public Produit editProduit(long id, Produit produit) {
        Optional<Produit> optionalProduit = produitRepository.findById(id);

        if(optionalProduit.isEmpty()){
            throw new RuntimeException("Modification impossible");
        }
        Produit produitModifier = optionalProduit.get();

        produitModifier.setName(produit.getName());
        produitModifier.setPrice(produit.getPrice());

        return produitRepository.save(produitModifier);
    }
}
