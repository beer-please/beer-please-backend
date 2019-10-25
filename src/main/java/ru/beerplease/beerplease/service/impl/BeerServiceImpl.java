package ru.beerplease.beerplease.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.beerplease.beerplease.exception.BeerNotFoundException;
import ru.beerplease.beerplease.model.Beer;
import ru.beerplease.beerplease.repository.BeerRepository;
import ru.beerplease.beerplease.service.BeerService;

import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;

    @Autowired
    public BeerServiceImpl(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public List<Beer> getBeersByName(String name, Pageable pageable) {
        if (name == null) {
            // not optimal
            return beerRepository.findAll(pageable).getContent();
        }

        return beerRepository.findAllByNameContainsIgnoreCase(name, pageable);
    }

    @Override
    public Beer getBeerById(Long id) {
        return beerRepository.findById(id).orElseThrow(() -> new BeerNotFoundException(id));
    }

    @Override
    public Beer getBeerByBarcode(String barcode) {
        return beerRepository.findBeerByBarcode(barcode).orElseThrow(() -> new BeerNotFoundException(barcode));
    }
}
