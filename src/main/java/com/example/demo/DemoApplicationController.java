package com.example.demo;

import com.example.demo.model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.repository.fromtable;
@RestController
public class DemoApplicationController {
    @GetMapping("/{name}")

    public String helloWorld(@PathVariable String name){
        return "hello "+name;
    };

    @GetMapping("/students")
    public  List<Students> getStudents(){
        fromtable students=new fromtable();
        return students.findAll();
    };
    @GetMapping("/JPQLTest")
    public List<Students> getStudentsJPQL(){
        fromtable students=new fromtable();
        return students.test();
    }
}