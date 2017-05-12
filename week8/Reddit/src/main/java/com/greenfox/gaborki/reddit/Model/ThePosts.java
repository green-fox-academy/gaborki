package com.greenfox.gaborki.reddit.Model;

import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import org.springframework.stereotype.Component;

@Entity
public class ThePosts {

  List<Objects> posts;

  public List<Objects> getPosts() {
    return posts;
  }

  public void setPosts(List<Objects> posts) {
    this.posts = posts;
  }
}
