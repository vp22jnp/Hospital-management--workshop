package com.workshop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hospital {
    public String Hospitalname;
    public String department;

    public String getHospitalname() {
        return Hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        Hospitalname = hospitalname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }




    @Override
    public String toString() {
        return "Hospital{" +
                "Hospitalname='" + Hospitalname + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Hospital(){
    this.department=this.department;
    this.Hospitalname=this.Hospitalname;
}
Scanner sc=new Scanner(System.in);
    public Map<String,Hospital> List=new HashMap<String,Hospital>();

    //public void addpatient() {
    //}
}