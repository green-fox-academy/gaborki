package com.greenfox.gaborki.reddit.Model;

import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ThePosts {

  Iterable<Post> posts;

  public Iterable<Post> getPosts() {
    return posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }
}
