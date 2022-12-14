package com.raiseup.PetClinic.service.mapService;

import com.raiseup.PetClinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(this.getNextId(),object);
        }else {
            throw new RuntimeException("Object is null");
        }

        return object;
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        Long nextId=null;
        try {
            nextId= Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException e){
            nextId=1L;
        }
        return nextId;
    }
}
