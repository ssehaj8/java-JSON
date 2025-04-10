package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

            public static void main (String[]args){
            try {

                List<Student> students = new ArrayList<>();
                students.add(new Student("Sehaj", 22));
                students.add(new Student("Bhawishya", 21));
                students.add(new Student("Sanya", 21));

                ObjectMapper objectMapper = new ObjectMapper();

                String jsonArray = objectMapper.writeValueAsString(students);

                System.out.println(jsonArray);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }


}
/*
[{"name":"Sehaj","age":22},{"name":"Bhawishya","age":21},{"name":"Sanya","age":21}]
 */
