package com.artwork.online.eartwork.model;

import javax.persistence.*;

@Entity
@Table(name="artworks")
public class Artwork {

    public Artwork(){}

    public Artwork(String name, String description, String artiste, double shippingWeight, double amount, Category category) {
        this.name = name;
        this.description = description;
        this.artiste = artiste;
        this.shippingWeight = shippingWeight;
        this.amount = amount;
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer artworkId;

    @Column(nullable = false)
    private String name;

    private String description;
    private String artiste;
    private double shippingWeight;

    @Column(nullable = false)
    private double amount;

    @ManyToOne()
    @JoinColumn(name="category_id",nullable = false)
    private Category category;


    public Integer getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(Integer artworkId) {
        this.artworkId = artworkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
