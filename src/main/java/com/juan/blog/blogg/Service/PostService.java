package com.juan.blog.blogg.Service;

import com.juan.blog.blogg.entitys.Poster;

import java.util.List;

public interface PostService extends BaseService<Poster,Long> {
    List<Poster> search(String filtro)throws Exception;

}
