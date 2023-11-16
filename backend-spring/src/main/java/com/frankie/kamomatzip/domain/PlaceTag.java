package com.frankie.kamomatzip.domain;

import com.frankie.kamomatzip.entitiy.dto.BaseTimeEntity;

import javax.persistence.*;


@Entity
public class PlaceTag extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_tag_id")
    private String placeTagId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Place place;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    private Tag tag;
}
