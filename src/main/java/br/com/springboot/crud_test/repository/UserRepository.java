package br.com.springboot.crud_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.crud_test.model.UserClass;

@Repository
public interface UserRepository extends JpaRepository<UserClass, Long> {
    

}
