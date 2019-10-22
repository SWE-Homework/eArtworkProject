package com.artwork.online.eartwork.service;

import com.artwork.online.eartwork.model.ShippingAddress;

import java.util.List;
import java.util.Optional;

public interface ShippingAddressService {
    ShippingAddress createNewShippingAddress(ShippingAddress ShippingAddress);
    List<ShippingAddress> getAllShippingAddresses();
    Optional<ShippingAddress> getShippingAddressByZipcode(String zipcode );
    ShippingAddress updateShippingAddressById(ShippingAddress ShippingAddress, Long ShippingAddressId);
    void deleteShippingAddressById(Long shippingAddressId);

}
