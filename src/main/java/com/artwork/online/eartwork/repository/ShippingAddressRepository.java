package com.artwork.online.eartwork.repository;

import com.artwork.online.eartwork.model.ShippingAddress;
import com.artwork.online.eartwork.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShippingAddressRepository extends JpaRepository<ShippingAddress,Long> {
    Optional<ShippingAddress> findByZipcode(String zipcode);

}
