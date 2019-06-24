package com.qfedu.service.impl;

import com.qfedu.dao.PetDao;
import com.qfedu.pojo.Pet;
import com.qfedu.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/22.
 */
@Service
public class PetServiceImpl implements PetService {

    @Autowired()
    private PetDao petDao;

    @Override
    public List<Pet> findPet() {
        //System.out.println("进入service查询");
        List<Pet> petList =  petDao.findPet();
        return petList;
    }

    @Override
    public Pet findPetById(Integer id) {
        Pet pet = petDao.findPetById(id);
        return pet;
    }
}