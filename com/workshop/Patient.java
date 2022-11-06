package com.workshop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
enum Department {
    NEUROLOGY, CARDIOLOGY,
    GYNECOLOGY, ONCOLOGY;
}
public class Patient {

        private String name;
        private String age;
        private String phoneno;
        private String city;
        private String state;
        private String department;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getPhoneno() {
            return phoneno;
        }

        public void setPhoneno(String phoneno) {
            this.phoneno = phoneno;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        @Override
        public String toString() {
            return "patient{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", phoneno='" + phoneno + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }

        public Patient() {
            this.name = this.name;
            this.phoneno = this.phoneno;
            this.city = this.city;
            this.age = this.age;
            this.state = this.state;
            this.department = this.department;
        }

        public Department dept() {
            switch (dept()) {
                case NEUROLOGY:
                    System.out.println("patient have neurology related problem");
                    break;
                case CARDIOLOGY:
                    System.out.println("patient have cardiology related problem");
                    break;
                case ONCOLOGY:
                    System.out.println("patient have oncology related problem");
                    break;
                case GYNECOLOGY:
                    System.out.println("patient have gynecology related problem");
                default:
                    System.out.println("none");
            }
            return null;
        }

        static Patient patient = new Patient();
        static Scanner sc = new Scanner(System.in);
        static HashMap<String, String> list = new HashMap<>();

        public static void addpatient() {
            System.out.println("enter name");
            String name = sc.next();
            System.out.println(" enter phonenumber");
            long phonenumber = sc.nextLong();
            System.out.println("enter city name");
            String city = sc.next();
            System.out.println("enter age");
            int age = sc.nextInt();
            System.out.println("enter state");
            String state = sc.next();
            System.out.println("enter department name");
            String department = sc.next();
            //com.hospital.Patient p = new com.hospital.Patient();
            System.out.println("enter hospital name");
            list.put(sc.next(), list.get(patient));
        }

        public static void showDetails() {
            for (Map.Entry<String, String> entry : list.entrySet()) {
                System.out.println("hospital name-" + entry.getKey());
                System.out.println(patient);
            }
        }
    }

