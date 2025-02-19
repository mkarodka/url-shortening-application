package org.url.shortener.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.url.shortener.model.UrlUser;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UrlUser, Long> {
    Optional<UrlUser> findByUsername(String username);
}
