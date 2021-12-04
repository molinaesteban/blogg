package com.juan.blog.blogg.entitys;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@Table(name = "comment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment extends Base {
    @Column(name = "email")
    private String email;

    @Column(name = "author")
    private String author;

    @Column(name = "content")
    private String content;

    @Column(name = "datatime")
    private String datatime;



}
