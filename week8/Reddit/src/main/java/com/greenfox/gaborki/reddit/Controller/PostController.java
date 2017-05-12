package com.greenfox.gaborki.reddit.Controller;


import com.greenfox.gaborki.reddit.Model.Post;
import com.greenfox.gaborki.reddit.Model.ThePosts;
import com.greenfox.gaborki.reddit.Repository.PostRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @Autowired
  ThePosts thePosts;

  @Autowired
  PostRepo postrepo;

  @PostMapping("/post")
    public void savePost(@RequestBody Post post){
      postrepo.save(post);
    }

  @GetMapping("/post")
  public ThePosts listPosts(){
    thePosts.setPosts(postrepo.findAll());
      return thePosts;
  }

}
