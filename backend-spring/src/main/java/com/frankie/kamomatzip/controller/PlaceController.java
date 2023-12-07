package com.frankie.kamomatzip.controller;

import com.frankie.kamomatzip.dto.PlaceResponse;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlaceController
{
    @GetMapping("/api/v1/place")
    public ResponseEntity<List<PlaceResponse>> getPlaceList(@Param("category") String category)
    {

        return new ResponseEntity<>(new ArrayList(), HttpStatus.OK);
    }
}
