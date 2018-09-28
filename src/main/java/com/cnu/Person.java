package com.cnu;

public class Person {

    private String name;
    private String job;
    private String officeAreaCode = "555";
    private String officeNumber;

    public Person(String officeNumber){
        this.officeNumber = officeNumber;
    }

    public String getTelephoneNumber(){
        String phone = officeAreaCode + "-" + officeNumber;
        name += ", " + phone;
        job += ", " + phone;
        return phone;
    }

    public void changeJob(String newJob){
        if(!newJob.equals(job)){
            this.job = newJob;
        }
        name += ", " + newJob;
    }

    public void modifyName(String newName){
        if(!newName.equals(name)){
            this.name = newName;
        }
        job = newName + ", " + job;
    }
}
