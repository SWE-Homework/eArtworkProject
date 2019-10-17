package com.artwork.online.eartwork.service;

import com.artwork.online.eartwork.model.Category;

import java.util.List;

public interface CategoryService {
    public boolean save(Category category);
    public List<Category> getArtworks();
    public Category getCategoryById(Integer id);
}
