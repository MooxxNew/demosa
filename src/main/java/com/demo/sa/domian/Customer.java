package com.demo.sa.domian;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Customer {

    /**
     */
    @NotNull
    @Size(min = 2)
    private String firstName;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String lastName;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String address;

    /**
     */
    @ManyToOne
    private Amphur amphur;
}
