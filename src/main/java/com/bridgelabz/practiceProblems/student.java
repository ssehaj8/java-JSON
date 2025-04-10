package com.bridgelabz.practiceProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class student {
    public static void main(String[] args){

        JSONArray subjects= new JSONArray();
        subjects.put("Java");
        subjects.put("Spring");
        subjects.put("Sql");

        JSONObject student= new JSONObject();
        student.put("name", "Sehaj");
        student.put("age", "22");

        student.put("subjects", subjects);

        System.out.println(student.toString(2));
    }
}
/*
{
  "subjects": [
    "Java",
    "Spring",
    "Sql"
  ],
  "name": "Sehaj",
  "age": "22"
}
 */