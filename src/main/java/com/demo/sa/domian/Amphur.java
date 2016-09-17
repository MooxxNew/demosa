package com.demo.sa.domian;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findAmphursByProvince", "findAmphursByNameLike" })
public class Amphur {

    /**
     */
    @NotNull
    @Size(min = 2)
    private String name;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String postal_code;

    /**
     */
    @ManyToOne
    private Province province;
}
