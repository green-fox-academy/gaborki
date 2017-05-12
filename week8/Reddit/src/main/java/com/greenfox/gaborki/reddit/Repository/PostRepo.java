package com.greenfox.gaborki.reddit.Repository;

import com.greenfox.gaborki.reddit.Model.ThePosts;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<ThePosts, Long> {

}
