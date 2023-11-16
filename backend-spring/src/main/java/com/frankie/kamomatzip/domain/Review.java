package com.frankie.kamomatzip.domain;

import com.frankie.kamomatzip.entitiy.dto.BaseTimeEntity;

import javax.persistence.*;

@Entity
public class Review extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "review_id")
    private long reviewId;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "place_id")
    private Place place;

    private String content;
    private int peopleNums;
    private int pricePerPeople;
    private Boolean isReservation;
    private String mealTime;

}
