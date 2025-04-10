package com.bridgelabz.practiceProblems.ReadAndExtract;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadJSON {
    public static void  main(String[] args){
        String filepath="C:\\Users\\sehajpreet\\Desktop\\bridgelabz-workspace\\java-JSON\\src\\main\\java\\com\\bridgelabz\\practiceProblems\\ReadAndExtract\\user.json";
        try{
            //read the contnt of the file
            String content= new String(Files.readAllBytes(Paths.get(filepath)));

            JSONObject json= new JSONObject(content);

            String name= json.getString("name");
            String email= json.getString("email");

            System.out.println("Name : " + name);
            System.out.println("Email: " + email);
        }
        catch(IOException e){
            System.out.println("error rading the file: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("error parsing JSON: "+e.getMessage());
        }
    }

}
/*
Name : Sehajpreet Kaur
Email: sehaj08@gmail.com
 */
