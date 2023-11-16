package com.frankie.kamomatzip.domain;

import com.frankie.kamomatzip.entitiy.dto.BaseTimeEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends BaseTimeEntity {
    @Id @GeneratedValue
    @Column(name = "user_id")
    private long userId;

    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    private String placeName;
    private String placeLocation;
    private Double placeLat;
    private Double placeLng;
    private Double placeDistance;
    private String placeCategory;
    private String placePhoneNumber;
    private String mainImage;
    private Boolean isOpen;
}
