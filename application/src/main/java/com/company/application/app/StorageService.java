package com.company.application.app;

import com.company.application.entity.ExtStorage;
import com.company.inventorycontrolsystem.entity.Storage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("app_StorageService")
public class StorageService {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Storage> fetchStorage() {
        return entityManager.createQuery("select e from ics_Storage e", Storage.class).getResultList();
    }
    @Transactional
    public List<ExtStorage> fetchExtStorage() {
        return entityManager.createQuery("select e from app_ExtStorage e", ExtStorage.class).getResultList();
    }
}