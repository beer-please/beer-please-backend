package ru.beerplease.beerplease.controller.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.beerplease.beerplease.model.Beer;
import ru.beerplease.beerplease.service.BeerService;

@RestController
@RequestMapping("/api/v1/beers/")
public class BeerController {
    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Beer> getBeerById(@PathVariable Long id) {
        return ResponseEntity.ok(beerService.getBeerById(id));
    }
}
