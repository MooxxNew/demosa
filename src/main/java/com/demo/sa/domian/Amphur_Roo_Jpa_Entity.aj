// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.demo.sa.domian;

import com.demo.sa.domian.Amphur;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Amphur_Roo_Jpa_Entity {
    
    declare @type: Amphur: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Amphur.id;
    
    @Version
    @Column(name = "version")
    private Integer Amphur.version;
    
    public Long Amphur.getId() {
        return this.id;
    }
    
    public void Amphur.setId(Long id) {
        this.id = id;
    }
    
    public Integer Amphur.getVersion() {
        return this.version;
    }
    
    public void Amphur.setVersion(Integer version) {
        this.version = version;
    }
    
}