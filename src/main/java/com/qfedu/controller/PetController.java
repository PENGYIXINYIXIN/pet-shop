package com.qfedu.controller;

import com.qfedu.pojo.Pet;
import com.qfedu.service.PetService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    //首页附近，根据地址查询宠物信息
    @RequestMapping("aroundpet.do")
    public JsonBean findAroundPet(){
        List<Pet> petList=petService.findAroundPet();
        System.out.println(petList);
        return  new JsonBean(1,petList);
    }
    //附近中，根据价格查询
    @RequestMapping("pricepet.do")
    public JsonBean findPetByPrice(String minprice,String maxprice){
        Map<String,Object> map=new HashMap<>();
        map.put("minprice",minprice);
        map.put("maxprice",maxprice);
        List<Pet> petList=petService.findPetByPrice(map);
        return new JsonBean(1,petList);
    }
}