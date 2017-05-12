package com.greenfox.gaborki.reddit.Controller;


import com.greenfox.gaborki.reddit.Model.ThePosts;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

@RequestMapping("/listpost")
public ThePosts listPosts(){

}

}
