// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.demo.sa.domian;

import com.demo.sa.domian.Province;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Province_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Province.entityManager;
    
    public static final List<String> Province.fieldNames4OrderClauseFilter = java.util.Arrays.asList("name");
    
    public static final EntityManager Province.entityManager() {
        EntityManager em = new Province().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Province.countProvinces() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Province o", Long.class).getSingleResult();
    }
    
    public static List<Province> Province.findAllProvinces() {
        return entityManager().createQuery("SELECT o FROM Province o", Province.class).getResultList();
    }
    
    public static List<Province> Province.findAllProvinces(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Province o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Province.class).getResultList();
    }
    
    public static Province Province.findProvince(Long id) {
        if (id == null) return null;
        return entityManager().find(Province.class, id);
    }
    
    public static List<Province> Province.findProvinceEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Province o", Province.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Province> Province.findProvinceEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Province o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Province.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Province.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Province.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Province attached = Province.findProvince(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Province.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Province.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Province Province.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Province merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
