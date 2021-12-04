package com.juan.blog.blogg.Controllers;

import com.juan.blog.blogg.Service.BaseServiceImpl;
import com.juan.blog.blogg.entitys.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E,Long>>implements BaseController<E,Long>{

    @Autowired
    protected S post;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(post.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error intente otra vez.\"}");
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(post.findById(id));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error intente otra vez.\"}");
        }

    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(post.save(entity));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error intente otra vez.\"}");
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody E entity){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(post.update(id,entity));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error intente otra vez.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(post.delete(id));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error intente otra vez.\"}");
        }
    }


}
