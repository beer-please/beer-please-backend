package ru.beerplease.beerplease.service;

import org.springframework.data.domain.Pageable;
import ru.beerplease.beerplease.model.Beer;

import java.util.List;

public interface BeerService {
    List<Beer> getBeersByName(String name, Pageable pageable);
    Beer getBeerById(Long id);
    Beer getBeerByBarcode(String barcode);
}
