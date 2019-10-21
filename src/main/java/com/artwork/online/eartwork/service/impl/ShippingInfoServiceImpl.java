package com.artwork.online.eartwork.service.impl;

import com.artwork.online.eartwork.model.ShippingInfo;
import com.artwork.online.eartwork.repository.ShippingInfoRepository;
import com.artwork.online.eartwork.service.ShippingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShippingInfoServiceImpl implements ShippingInfoService {
    @Autowired
    ShippingInfoRepository shippingInfoRepository;
    @Override
    public ShippingInfo save(ShippingInfo shippingInfo) {
        return shippingInfoRepository.save(shippingInfo);
    }

    @Override
    public List<ShippingInfo> getShippingInfos() {
        return shippingInfoRepository.findAll();
    }

    @Override
    public ShippingInfo getShippingInfoById(long id) {
        return shippingInfoRepository.findById(id).orElse(null);
    }

    @Override
    public ShippingInfo updateShippingInfo(ShippingInfo shippingInfo) {
        return shippingInfoRepository.save(shippingInfo);
    }

    @Override
    public void deleteShippingInfo(ShippingInfo shippingInfo) {
        shippingInfoRepository.delete(shippingInfo);
    }

    @Override
    public void deleteShippingInfoById(long shippingInfoid) {
        shippingInfoRepository.deleteById(shippingInfoid);
    }
}
