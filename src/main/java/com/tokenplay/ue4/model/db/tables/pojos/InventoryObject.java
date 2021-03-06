/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class InventoryObject implements Serializable {

    private static final long serialVersionUID = 1143875991;

    private String id;
    private String name;
    private String bluMaster;
    private Long size;
    private String type;

    public InventoryObject() {
    }

    public InventoryObject(InventoryObject value) {
        this.id = value.id;
        this.name = value.name;
        this.bluMaster = value.bluMaster;
        this.size = value.size;
        this.type = value.type;
    }

    public InventoryObject(String id, String name, String bluMaster, Long size, String type) {
        this.id = id;
        this.name = name;
        this.bluMaster = bluMaster;
        this.size = size;
        this.type = type;
    }

    @NotNull
    public String getInoId() {
        return this.id;
    }

    public void setInoId(String id) {
        this.id = id;
    }

    @NotNull
    public String getInoName() {
        return this.name;
    }

    public void setInoName(String name) {
        this.name = name;
    }

    public String getInoBluMaster() {
        return this.bluMaster;
    }

    public void setInoBluMaster(String bluMaster) {
        this.bluMaster = bluMaster;
    }

    public Long getInoSize() {
        return this.size;
    }

    public void setInoSize(Long size) {
        this.size = size;
    }

    public String getInoType() {
        return this.type;
    }

    public void setInoType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InventoryObject (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(bluMaster);
        sb.append(", ").append(size);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}
