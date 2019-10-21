package com.artwork.online.eartwork.repository;

import com.artwork.online.eartwork.model.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingInfoRepository  extends JpaRepository<ShippingInfo,Long> {
}
