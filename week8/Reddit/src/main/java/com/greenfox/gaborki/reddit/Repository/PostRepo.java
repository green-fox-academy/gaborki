package com.greenfox.gaborki.reddit.Repository;

import com.greenfox.gaborki.reddit.Model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {

}
