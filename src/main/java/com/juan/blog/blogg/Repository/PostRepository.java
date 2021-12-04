package com.juan.blog.blogg.Repository;

import com.juan.blog.blogg.entitys.Base;
import com.juan.blog.blogg.entitys.Poster;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends BaseRepository <Poster,Long> {

    @Query(
            value = "SELECT * FROM post where post.title LIKE %:filtro%",
            nativeQuery = true
    )
    List<Poster> searchNativo(@Param("filtro")String filtro);
}
