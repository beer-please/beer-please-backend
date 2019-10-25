package ru.beerplease.beerplease.controller.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.beerplease.beerplease.model.Beer;
import ru.beerplease.beerplease.service.BeerService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/beers")
public class BeerController {
    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping
    public ResponseEntity<List<Beer>> getBeers(@RequestParam(required = false) String name,
                                                     @RequestParam(defaultValue = "1") int page,
                                                     @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(beerService.getBeersByName(name, PageRequest.of(page - 1, size)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Beer> getBeerById(@PathVariable Long id) {
        return ResponseEntity.ok(beerService.getBeerById(id));
    }

    @GetMapping("/barcode/{barcode}")
    public ResponseEntity<Beer> getBeerByBarcode(@PathVariable String barcode) {
        return ResponseEntity.ok(beerService.getBeerByBarcode(barcode));
    }
}
