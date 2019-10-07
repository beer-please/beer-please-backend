package ru.beerplease.beerplease.exception;

public class BeerNotFoundException extends RuntimeException {
    public BeerNotFoundException(Long id) {
        super("Beer with id " + id + " not found");
    }

    public BeerNotFoundException(String barcode) {
        super("Beer with barcode " + barcode + " not found");
    }
}
