package com.derster.booknetwork.role;

import com.derster.booknetwork.user.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<User, Integer> {
    Optional<Role> findByName(String roleName);
}
