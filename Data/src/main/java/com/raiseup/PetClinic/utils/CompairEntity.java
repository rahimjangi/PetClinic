package com.raiseup.PetClinic.utils;

import com.raiseup.PetClinic.model.BaseEntity;

import java.util.Comparator;

public class CompairEntity implements Comparator<BaseEntity> {

    @Override
    public int compare(BaseEntity o1, BaseEntity o2) {
        return Long.compare(o1.getId(),o2.getId());
    }
}
