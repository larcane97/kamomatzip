package com.frankie.kamomatzip.entitiy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PlaceEntity
{
    @Id
    @GeneratedValue
    @Column(name = "place_id")
    private Long placeId;

    private String placeName;

    private String placeLocation;



    /*
    * NOTE: onetomany 문이랑 jg 쪽은 쓰시나여? insert할 때 보면 꼬일 때가 있어서 우린 안쓰는듯
    * */
    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL)
    private List<ReviewEntity> reviewEntities = new ArrayList<>();
}
