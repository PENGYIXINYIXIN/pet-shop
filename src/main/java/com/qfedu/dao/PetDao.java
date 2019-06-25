package com.qfedu.dao;

import com.qfedu.pojo.Pet;

import java.util.List;
import java.util.Map;

/**
 * Created by PENGYIXIN on 2019/6/22.
 */
public interface  PetDao {
    List<Pet> findPet();

    Pet  findPetById(Integer id);

    List<Pet> findAroundPet();

    List<Pet> findPetByPrice(Map map);
}