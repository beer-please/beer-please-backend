package ru.beerplease.beerplease.service;

import ru.beerplease.beerplease.model.Beer;

public interface BeerService {
    Beer getBeerById(Long id);
    Beer getBeerByBarcode(String barcode);
}
