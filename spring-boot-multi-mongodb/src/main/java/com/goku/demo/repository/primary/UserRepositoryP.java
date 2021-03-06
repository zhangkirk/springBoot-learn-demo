package com.goku.demo.repository.primary;

import com.goku.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by nbfujx on 2017-12-08.
 */
public interface UserRepositoryP extends MongoRepository<User, Long> {
    User findByUsername(String username);
}
