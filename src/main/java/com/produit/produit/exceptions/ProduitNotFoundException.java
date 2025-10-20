package com.produit.produit.exceptions;

public class ProduitNotFoundException extends RuntimeException{
    public ProduitNotFoundException(String message) {
        super(message);
    }
}
