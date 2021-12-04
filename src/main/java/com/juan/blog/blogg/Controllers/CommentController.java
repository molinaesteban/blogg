package com.juan.blog.blogg.Controllers;

import com.juan.blog.blogg.Service.CommentServiceImpl;
import com.juan.blog.blogg.entitys.Comment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/comments")
public class CommentController extends BaseControllerImpl <Comment, CommentServiceImpl>
{

}
