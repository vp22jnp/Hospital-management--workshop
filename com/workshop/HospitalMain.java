package com.workshop;

import com.hospital.Hospitall;
import com.hospital.PatientMain;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Hospital hospital= new Hospital();
        int decision;
        do {
            System.out.println("enter decision");
            decision = sc.nextInt();
            switch (decision) {
                case 1:
                System.out.println("adding patient details");
                Patient.addpatient();
                break;
                case 2:
                System.out.println("showing details");
                Patient.showDetails();
                break;
                default:
                    System.out.println("enter valid input");
                    break;
            }
        } while (decision != 2);
    }
}
