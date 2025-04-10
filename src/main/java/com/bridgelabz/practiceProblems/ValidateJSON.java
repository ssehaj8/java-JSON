package com.bridgelabz.practiceProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJSON {
    public static void main(String[] args) {
        String jsonString="{\"name\":\"Sehaj\",\"age\":22,\"email\":\"sehaj08@gmail.com\"}";

        ObjectMapper objectMapper= new ObjectMapper();

        try{
            JsonNode rootnode= objectMapper.readTree(jsonString);

            String name= rootnode.get("name").asText();
            int age= rootnode.get("age").asInt();
            String email= rootnode.get("email").asText();

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Email: " + email);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

/*
Name: Sehaj
Age: 22
Email: sehaj08@gmail.com
 */