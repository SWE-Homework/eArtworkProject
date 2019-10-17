package com.artwork.online.eartwork.repository;

import com.artwork.online.eartwork.model.Artwork;
import com.artwork.online.eartwork.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface ArtworkRepository extends JpaRepository<Artwork, Integer> {

    @Query("select art from Artwork art where art.category.categoryId = ?1")
    public List<Artwork> findArtworkByCategory2(Integer id);

   // @Query("select art from artworks art")
    //public List<Artwork> getAllArtworks();

    Optional<List<Artwork>> findArtworkByCategory(Category category);

}
