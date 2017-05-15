package com.greenfox.gaborki.reddit.Model;

import org.springframework.stereotype.Component;

@Component
public class PostList {

  Iterable<Post> posts;

  public Iterable<Post> getPosts() {
    return posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }
}
