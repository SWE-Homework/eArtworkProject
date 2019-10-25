package com.artwork.online.eartwork.controller;

import com.artwork.online.eartwork.model.Artwork;
import com.artwork.online.eartwork.model.Category;
import com.artwork.online.eartwork.service.ArtworkService;
import com.artwork.online.eartwork.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.print.Book;
import java.util.List;


@RestController
@CrossOrigin(origins={"http://localhost:4200","http://localhost","http://localhost:4201","http://localhost:4203,"},allowedHeaders = "*")
@RequestMapping(value = "/eartwork/api/artworks",produces = MediaType.APPLICATION_JSON_VALUE)
public class ArtworkController {

    @Autowired
    private ArtworkService artworkService;

    @Autowired
    private CategoryService categoryService;

    public ArtworkController(ArtworkService service, CategoryService categoryService){
        artworkService=service;
        this.categoryService=categoryService;
    }

    @GetMapping(value="/list")
    public List<Artwork> getListArtworks() {
        return artworkService.getArtworks();

    }

    @GetMapping(value="/getById/{artworkId}")
    public Artwork getArtwork(@PathVariable Integer artworkId){
        return this.artworkService.getArtworkById(artworkId);
    }

    @GetMapping(value="/getByCategory/{categoryId}")
    public List<Artwork> getArtworkByCategory2(@PathVariable Integer categoryId){
        Category cat=new Category();
        cat.setCategoryId(categoryId);
        return this.artworkService.getArtworkByCategory(categoryId);
       // return "good";
    }


    @PostMapping(value="/add")
    public Artwork addArtwork(@Valid @RequestBody Artwork artwork){
        return this.artworkService.save(artwork);
    }

    @PutMapping(value = "/update/{artworkId}")

    public Artwork updateBook(@Valid @RequestBody Artwork editedArtwork, @PathVariable Integer artworkId) {

        return artworkService.updateArtworkById(editedArtwork, artworkId);

    }



    @DeleteMapping(value = "/delete/{artworkId}")

    public void deleteArtwork(@PathVariable Integer artworkId) {
        //Delete artwork
        artworkService.deleteArtwork(artworkId);

    }



}
