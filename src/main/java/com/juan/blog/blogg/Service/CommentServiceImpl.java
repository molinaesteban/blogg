package com.juan.blog.blogg.Service;

import com.juan.blog.blogg.Repository.BaseRepository;
import com.juan.blog.blogg.Repository.CommentRepository;
import com.juan.blog.blogg.entitys.Comment;
import com.juan.blog.blogg.entitys.Poster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment,Long> implements CommentService {

  @Autowired
  private CommentRepository commentRepository;

    public CommentServiceImpl(BaseRepository<Comment, Long> baseRepository) {
        super(baseRepository);
    }



}
