package ru.beerplease.beerplease.repository;

import org.springframework.data.repository.CrudRepository;
import ru.beerplease.beerplease.model.Beer;

public interface BeerRepository extends CrudRepository<Beer, Long> {
}
