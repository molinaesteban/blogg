package com.juan.blog.blogg.Service;

import com.juan.blog.blogg.Repository.BaseRepository;
import com.juan.blog.blogg.Repository.PostRepository;
import com.juan.blog.blogg.entitys.Poster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl extends BaseServiceImpl<Poster,Long> implements PostService{

    @Autowired
    private PostRepository postRepository;


    public PostServiceImpl(BaseRepository<Poster, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Poster> search(String filtro) throws Exception {
        try{
            List<Poster>posters=postRepository.searchNativo(filtro);
            return posters;
        }catch (Exception e){
            throw new Exception((e.getMessage()));
        }
    }
}
