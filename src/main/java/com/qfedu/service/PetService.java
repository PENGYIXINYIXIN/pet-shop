package com.qfedu.service;

import com.qfedu.pojo.Pet;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/22.
 */
public interface PetService {
    List<Pet> findPet();

    Pet findPetById(Integer id);
}