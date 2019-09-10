package ru.beerplease.beerplease.exception;

public class BeerNotFoundException extends RuntimeException {
    public BeerNotFoundException(Long id) {
        super("Beer with id: " + id + " not found");
    }
}
