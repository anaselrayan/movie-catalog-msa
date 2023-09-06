package com.anaselrayan.moviecatalogservice.service;

import com.anaselrayan.moviecatalogservice.model.CatalogItem;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MovieCatalogService {

    public List<CatalogItem> getAllMoviesForUser(String userId) {
        return Collections.singletonList(
                new CatalogItem(1, "Mile22", "Great Action Movie!", 9)
        );
    }
}
