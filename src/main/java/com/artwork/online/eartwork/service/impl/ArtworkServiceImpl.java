package com.artwork.online.eartwork.service.impl;

import com.artwork.online.eartwork.model.Artwork;
import com.artwork.online.eartwork.model.Category;
import com.artwork.online.eartwork.repository.ArtworkRepository;
import com.artwork.online.eartwork.service.ArtworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtworkServiceImpl implements ArtworkService {

    @Autowired
    private ArtworkRepository artworkRepository;

//    public ArtworkServiceImpl(ArtworkRepository artworkRepository){
//        this.artworkRepository=artworkRepository;
//    }

    @Override
    public Artwork save(Artwork artwork) {
        return this.artworkRepository.save(artwork);
    }

    @Override
    public List<Artwork> getArtworks() {
        return this.artworkRepository.findAll();
    }

    @Override
    public List<Artwork> getArtworkByCategory(Integer id) {
        return this.artworkRepository.findArtworkByCategory2(id);
    }

    public Artwork getArtworkById(Integer  artworkId) {
        return artworkRepository.findById(artworkId).orElse(null);
    }
}
