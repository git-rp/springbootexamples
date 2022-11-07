package com.demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements BeanNameAware {
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public String qualification ;
    public void assist(){
        System.out.println("Doctor is assiting...");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("set bean name is called");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct...");
    }
}
