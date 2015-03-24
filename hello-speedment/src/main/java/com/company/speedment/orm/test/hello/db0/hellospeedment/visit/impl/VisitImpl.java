package com.company.speedment.orm.test.hello.db0.hellospeedment.visit.impl;

import com.company.speedment.orm.test.hello.db0.hellospeedment.visit.Visit;
import com.company.speedment.orm.test.hello.db0.hellospeedment.visit.VisitBuilder;
import java.sql.Time;
import java.util.Objects;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * An implementation  representing an entity (for example, a row) in the Table 'hello.db0.hellospeedment.visit'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class VisitImpl implements VisitBuilder {
    
    private Integer id;
    private Time time;
    private Integer user;
    private String image;
    
    public VisitImpl() {
        
    }
    
    public VisitImpl(final Visit visit) {
        setId(visit.getId());
        setTime(visit.getTime());
        setUser(visit.getUser());
        setImage(visit.getImage());
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public VisitImpl setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Time getTime() {
        return time;
    }
    
    @Override
    public VisitImpl setTime(Time time) {
        this.time = time;
        return this;
    }
    
    @Override
    public Integer getUser() {
        return user;
    }
    
    @Override
    public VisitImpl setUser(Integer user) {
        this.user = user;
        return this;
    }
    
    @Override
    public String getImage() {
        return image;
    }
    
    @Override
    public VisitImpl setImage(String image) {
        this.image = image;
        return this;
    }
    
    @Override
    public Visit build() {
        return new VisitImpl(this);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "+Objects.toString(getId()));
        sj.add("time = "+Objects.toString(getTime()));
        sj.add("user = "+Objects.toString(getUser()));
        sj.add("image = "+Objects.toString(getImage()));
        return "VisitImpl "+sj.toString();
    }
}