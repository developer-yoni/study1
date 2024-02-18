package com.example.ecommerce.domain.user.repository;

import com.example.ecommerce.domain.user.User;
import com.example.ecommerce.global.enums.EntityStatus;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);

    Optional<User> findByUsernameAndEntityStatus(String username, EntityStatus entityStatus);
}
