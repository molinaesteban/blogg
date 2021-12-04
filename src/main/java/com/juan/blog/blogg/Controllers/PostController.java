package com.juan.blog.blogg.Controllers;

import com.juan.blog.blogg.Service.PostServiceImpl;
import com.juan.blog.blogg.entitys.Poster;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/post")
public class PostController extends  BaseControllerImpl <Poster, PostServiceImpl> {
    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(post.search(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \""+e.getMessage()+"\"}"));
        }
    }

}
