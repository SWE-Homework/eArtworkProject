package com.artwork.online.eartwork.controller;


import com.artwork.online.eartwork.model.Artwork;
import com.artwork.online.eartwork.model.Category;
import com.artwork.online.eartwork.service.ArtworkService;
import com.artwork.online.eartwork.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins={"http://localhost:4200","http://localhost"},allowedHeaders = "*")
@RequestMapping(value = "/category/api/categories",produces = MediaType.APPLICATION_JSON_VALUE)
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    public CategoryController( CategoryService categoryService){
        this.categoryService=categoryService;
    }

    @GetMapping(value="/list")
    public List<Category> getListArtworks() {
        return categoryService.getCategories();

    }

}
