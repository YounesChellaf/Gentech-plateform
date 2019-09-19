package com.project2cs.demo.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "article")
public class Article implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;


    @Column(name = "publish_date")
    private String publish_date;

    protected Article() {
    }

    public Article(String title, String content,String  publish_date) {
        this.title = title;
        this.content = content;
        this.publish_date= publish_date;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}