package ru.beerplease.beerplease.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.beerplease.beerplease.model.Beer;

import java.util.Optional;

@Repository
public interface BeerRepository extends CrudRepository<Beer, Long> {
    Optional<Beer> findBeerByBarcode(String barcode);
}
