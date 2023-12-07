package com.frankie.kamomatzip.entitiy;

import com.frankie.kamomatzip.dto.BaseTimeEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserEntity extends BaseTimeEntity {
    @Id @GeneratedValue
    @Column(name = "user_id")
    private long userId;

    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ReviewEntity> reviewEntities = new ArrayList<>();

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
