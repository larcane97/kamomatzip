package com.frankie.kamomatzip.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TagEntity
{
    @Id
    @GeneratedValue
    @Column(name = "tag_id")
    private Long tagId;

    private String tagName;
}
