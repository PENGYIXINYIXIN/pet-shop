package com.qfedu.controller;

import com.qfedu.pojo.Pet;
import com.qfedu.service.PetService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by PENGYIXIN on 2019/6/22.
 */

@Controller
@ResponseBody
public class PetController {

    @Autowired
    private PetService petService;

    //首页的宠物列表
    @RequestMapping("list.do")
    public JsonBean findPet(){
        //System.out.println("进入查询");
        List<Pet> petList = petService.findPet();
        //System.out.println("查询结果"+petList);
        return new JsonBean(1,petList);
    }

    //根据id 查询宠物的信息详情
    @RequestMapping("petdetail.do")
    public JsonBean findPetById(Integer id ){
        System.out.println(id);
        System.out.println("进入查询");
        Pet pet = petService.findPetById(id);
        System.out.println("查丶结果"+ pet);
        return new JsonBean(1,pet);
    }
}