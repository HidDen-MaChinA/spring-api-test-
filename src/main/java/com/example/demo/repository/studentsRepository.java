package com.example.demo.repository;
import com.example.demo.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface studentsRepository {
    List<Students> findAll();
    @Query(value = "SELECT (*) from TABLE students",nativeQuery = true)
    List<Students> test();
    //devoir:
    //    implementer l'interface StudentRepository avec une classe concrete avec jdbc et proposer
    //    une autre implementation avec jpql(Java Persistence Query Language) vous pouvez voir l'annotation: @Query

}
