package com.artwork.online.eartwork.service;

import com.artwork.online.eartwork.model.Artwork;
import com.artwork.online.eartwork.model.Category;

import java.util.List;

public interface ArtworkService {
    public Artwork save(Artwork artwork);
    public List<Artwork> getArtworks();
    public List<Artwork> getArtworkByCategory(Integer catId);

    public Artwork getArtworkById(Integer id);

}
