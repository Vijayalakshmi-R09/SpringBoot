package com.app.Composite.service;

import java.util.List;
import java.util.Optional;

import com.app.Composite.Repository.HouseInfoRepo;
import com.app.Composite.entity.HouseInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseInfoManagerImpl 
{
    @Autowired
    private HouseInfoRepo hrepo;
    
    public void getHouse(HouseInfo hd) {
        
        hrepo.save(hd);
    }

    public List<HouseInfo> findAll() {
       
        return hrepo.findAll();
    }

    public Optional<HouseInfo> findHouseById(Integer id) {
       
        return hrepo.findById(id);
    }   
}
