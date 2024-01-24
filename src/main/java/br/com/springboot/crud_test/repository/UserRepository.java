package br.com.springboot.crud_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.springboot.crud_test.model.UserClass;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<UserClass, Long> {
    
    @Query(value = "select u from UserClass u where upper(trim(u.name)) like %?1%")
    List<UserClass> searchByName(String name);

}
