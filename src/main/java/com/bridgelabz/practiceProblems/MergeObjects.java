package com.bridgelabz.practiceProblems;
import java.util.*;
import org.json.JSONObject;

public class MergeObjects {
    public static void main(String[] args) {
        JSONObject obj1= new JSONObject();
        obj1.put("name", "Sehaj");
        obj1.put("email","sehaj08@gmailcom" );

        JSONObject obj2= new JSONObject();
        obj2.put("age", 22);
        obj2.put("city", "Gurdaspur");

        for (String key : obj2.keySet()) {
            obj1.put(key, obj2.get(key));
        }
        System.out.println(obj1.toString(2));
    }
}

/*
{
  "city": "Gurdaspur",
  "name": "Sehaj",
  "email": "sehaj08@gmailcom",
  "age": 22
}
 */