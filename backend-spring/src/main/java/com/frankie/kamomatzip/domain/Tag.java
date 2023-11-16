package com.frankie.kamomatzip.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {
    @Id
    @GeneratedValue
    @Column(name = "tag_id")
    private Long tagId;

    private String tagName;
}
