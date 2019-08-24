package ru.beerplease.beerplease.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "beer")
public class Beer {
    @Id
    @SequenceGenerator(name= "beerIdSeq", sequenceName = "beer_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "beerIdSeq")
    private Long id;
    private String barcode;
    private String name;
    private String title;
    private String description;
}
