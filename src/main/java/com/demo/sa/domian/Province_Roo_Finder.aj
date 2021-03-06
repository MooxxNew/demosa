// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.demo.sa.domian;

import com.demo.sa.domian.Province;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect Province_Roo_Finder {
    
    public static Long Province.countFindProvincesByNameLike(String name) {
        if (name == null || name.length() == 0) throw new IllegalArgumentException("The name argument is required");
        name = name.replace('*', '%');
        if (name.charAt(0) != '%') {
            name = "%" + name;
        }
        if (name.charAt(name.length() - 1) != '%') {
            name = name + "%";
        }
        EntityManager em = Province.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Province AS o WHERE LOWER(o.name) LIKE LOWER(:name)", Long.class);
        q.setParameter("name", name);
        return ((Long) q.getSingleResult());
    }
    
    public static TypedQuery<Province> Province.findProvincesByNameLike(String name) {
        if (name == null || name.length() == 0) throw new IllegalArgumentException("The name argument is required");
        name = name.replace('*', '%');
        if (name.charAt(0) != '%') {
            name = "%" + name;
        }
        if (name.charAt(name.length() - 1) != '%') {
            name = name + "%";
        }
        EntityManager em = Province.entityManager();
        TypedQuery<Province> q = em.createQuery("SELECT o FROM Province AS o WHERE LOWER(o.name) LIKE LOWER(:name)", Province.class);
        q.setParameter("name", name);
        return q;
    }
    
    public static TypedQuery<Province> Province.findProvincesByNameLike(String name, String sortFieldName, String sortOrder) {
        if (name == null || name.length() == 0) throw new IllegalArgumentException("The name argument is required");
        name = name.replace('*', '%');
        if (name.charAt(0) != '%') {
            name = "%" + name;
        }
        if (name.charAt(name.length() - 1) != '%') {
            name = name + "%";
        }
        EntityManager em = Province.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Province AS o WHERE LOWER(o.name) LIKE LOWER(:name)");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<Province> q = em.createQuery(queryBuilder.toString(), Province.class);
        q.setParameter("name", name);
        return q;
    }
    
}
