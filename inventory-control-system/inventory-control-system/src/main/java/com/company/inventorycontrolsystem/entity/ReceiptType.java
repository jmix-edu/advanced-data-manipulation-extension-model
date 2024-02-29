package com.company.inventorycontrolsystem.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum ReceiptType implements EnumClass<String> {

    POSTING("P"),
    RECEIPT("R");

    private final String id;

    ReceiptType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ReceiptType fromId(String id) {
        for (ReceiptType at : ReceiptType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}