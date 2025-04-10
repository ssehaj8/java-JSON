package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class FilterRecords {
    public static class Student{
        private String name;
        private  int age;

        public Student() {}

        public Student(String name, int age){
            this.name=name;
            this.age=age;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        @Override
        public String toString(){
            return "Student{name='" + name + "', age=" + age + "}";
    }
}

    public static void main(String[] args) {
        try{
            String jsonString = "[{\"name\":\"Sehaj\",\"age\":22},{\"name\":\"Bhawishya\",\"age\":32},{\"name\":\"Sanya\",\"age\":27},{\"name\":\"Chirag\",\"age\":28}]";

            ObjectMapper objectMapper=new ObjectMapper();

            List<Student> students = objectMapper.readValue(jsonString, new TypeReference<List<Student>>() {});

            List<Student> filteredStudents= students.stream().filter(student -> student.getAge()>25).collect(Collectors.toList());

            System.out.println("Filtered Students(Age>25:");
            for(Student student: filteredStudents){
                System.out.println(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
Filtered Students(Age>25:
Student{name='Bhawishya', age=32}
Student{name='Sanya', age=27}
Student{name='Chirag', age=28}

 */