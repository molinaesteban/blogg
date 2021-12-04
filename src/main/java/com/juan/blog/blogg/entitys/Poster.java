package com.juan.blog.blogg.entitys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "post")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Poster extends Base {

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "data_time")
    private String dataTime;

    @Column(name = "comment")
    private String comment;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinTable(
            name = "poster_comentario",
            joinColumns = @JoinColumn(name = "poster_id"),
            inverseJoinColumns = @JoinColumn(name = "comment_id")
    )
    private List<Comment> commentList= new ArrayList<Comment>();

}
