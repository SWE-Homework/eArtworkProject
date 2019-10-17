package com.artwork.online.eartwork.service.impl;

import com.artwork.online.eartwork.model.Category;
import com.artwork.online.eartwork.repository.CategoryRepository;
import com.artwork.online.eartwork.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

//    public CategoryImpl(CategoryRepository categoryRepository){
//        this.categoryRepository=categoryRepository;
//    }

    @Override
    public boolean save(Category category) {
        this.categoryRepository.save(category);
        return true;
    }

    @Override
    public List<Category> getArtworks() {
        return this.categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Integer id) {
        return this.categoryRepository.findById(id).orElse(null);
    }
}
