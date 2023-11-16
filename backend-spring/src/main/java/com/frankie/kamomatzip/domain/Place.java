package com.frankie.kamomatzip.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Place {
    @Id @GeneratedValue
    @Column(name = "place_id")
    private Long placeId;

    @OneToMany(mappedBy = "place",cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();
}
