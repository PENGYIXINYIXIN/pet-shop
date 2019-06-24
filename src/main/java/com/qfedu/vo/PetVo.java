package com.qfedu.vo;

import com.qfedu.pojo.Pet;

/**
 * Created by PENGYIXIN on 2019/6/22.
 */
public class PetVo extends Pet {
    private  String typename;

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "PetVo{" +
                "typename='" + typename + '\'' +
                '}';
    }
}