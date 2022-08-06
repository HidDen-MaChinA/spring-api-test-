package com.example.demo.repository;
import com.example.demo.model.Students;
import com.example.demo.repository.studentsRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class fromtable implements studentsRepository{
    private studentsRepository repo;
    @Override
    public List <Students> findAll(){
        List<Students> listOfStudents=new ArrayList<>();
        try{

            Connection conn=DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/test_for_jpa","postgres","password"
            );
            Statement stmt=conn.createStatement();
            ResultSet test=stmt.executeQuery("select * from students;");
            while(test.next()){
                listOfStudents.add(new Students(test.getString(2), test.getInt(1)));
            }
        }catch (Exception err){
            err.printStackTrace();
        }
        return listOfStudents;
    }
    public List<Students> test(){
        return repo.test().stream().toList();
    }

}
