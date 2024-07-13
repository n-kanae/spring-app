package com.adconnect.webapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.adconnect.webapp.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
