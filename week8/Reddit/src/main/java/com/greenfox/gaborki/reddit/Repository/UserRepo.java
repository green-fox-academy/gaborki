package com.greenfox.gaborki.reddit.Repository;

import com.greenfox.gaborki.reddit.Model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<User, Long> {

}
