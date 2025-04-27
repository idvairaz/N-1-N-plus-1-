package com.example.avito_merch.repo;

import com.example.avito_merch.model.Employee2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee2, Long> {

    /**
     * Раскоментировав @Query (стр 19) получим решение  проблемы N+1 с помощью JOIN FETCH
     * (тип оператора JOIN в JPQL и HQL, который используется для оптимизации загрузки связанных
     * сущностей, позволяет одновременно загружать главную сущность и связанные с ней сущности
     * в одном запросе )
     * Чтобы увидеть запросы в консоли в application.properties установлены параметры
     */
//    @Query("SELECT e FROM Employee2 e  JOIN FETCH e.merchList")
    List<Employee2> findAll();
}
