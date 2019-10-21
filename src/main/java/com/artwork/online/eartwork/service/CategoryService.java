package com.artwork.online.eartwork.service;

import com.artwork.online.eartwork.model.Artwork;
import com.artwork.online.eartwork.model.Category;

import java.util.List;

public interface CategoryService {
    public Category save(Category category);
    public List<Category> getCategories();
    public Category getCategoryById(Integer id);
    public Category update(Category category, Integer categoryId);
    public Category delete(Integer categoryId);
}
