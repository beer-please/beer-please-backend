package ru.beerplease.beerplease.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.beerplease.beerplease.model.Beer;

import java.util.List;
import java.util.Optional;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {
    List<Beer> findAllByNameContainsIgnoreCase(String name, Pageable pageable);
    Optional<Beer> findBeerByBarcode(String barcode);
}
