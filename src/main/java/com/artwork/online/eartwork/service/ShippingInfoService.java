package com.artwork.online.eartwork.service;

import com.artwork.online.eartwork.model.ShippingInfo;

import java.util.List;

public interface ShippingInfoService {
    public ShippingInfo save(ShippingInfo shippingInfo);
    public List<ShippingInfo> getShippingInfos();

    public ShippingInfo getShippingInfoById(long id);

    public ShippingInfo updateShippingInfo(ShippingInfo shippingInfo);
    public void deleteShippingInfo(ShippingInfo shippingInfo);
    public void deleteShippingInfoById(long shippingInfoid);
}
