package com.greenfox.gaborki.reddit.Controller;


import com.greenfox.gaborki.reddit.Model.Post;
import com.greenfox.gaborki.reddit.Model.PostList;
import com.greenfox.gaborki.reddit.Model.User;
import com.greenfox.gaborki.reddit.Repository.PostRepo;
import com.greenfox.gaborki.reddit.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class PostController {

  @Autowired
  PostList thePosts;
  @Autowired
  PostRepo postrepo;
  @Autowired
  UserRepo userRepo;

  @PostMapping("/post")
    public Post savePost(@RequestBody Post post, @RequestHeader String owner){
      userRepo.save(new User(owner));
      post.setOwner(owner);
      postrepo.save(post);
      return post;
    }

  @GetMapping("/post")
  public PostList listPosts(){
    thePosts.setPosts(postrepo.findAll());
      return thePosts;
  }

  @PutMapping("/post/{id}/upvote")
  public Post upVote(@PathVariable long id){
    Post post = postrepo.findOne(id);
    post.setScore(post.getScore()+1);
    postrepo.save(post);
    return post;
  }

  @PutMapping("/post/{id}/downvote")
  public Post downVote(@PathVariable long id){
    Post post = postrepo.findOne(id);
    post.setScore(post.getScore()-1);
    postrepo.save(post);
    return post;
  }

}
