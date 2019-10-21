package com.artwork.online.eartwork.repository;

import com.artwork.online.eartwork.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository  extends JpaRepository<OrderDetail,Long> {
}
