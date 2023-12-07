package com.frankie.kamomatzip.entitiy;

import com.frankie.kamomatzip.dto.BaseTimeEntity;

import javax.persistence.*;

@Entity
public class ReviewEntity extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "review_id")
    private long reviewId;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "place_id")
    private PlaceEntity place;

    private String content;
    private int peopleNums;
    private int pricePerPeople;
    private Boolean isReservation;
    private String mealTime;

}
