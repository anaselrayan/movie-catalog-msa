package com.anaselrayan.moviecatalogservice.controller;

import com.anaselrayan.moviecatalogservice.model.CatalogItem;
import com.anaselrayan.moviecatalogservice.service.MovieCatalogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/catalog")
public class MovieCatalogController {
    private final MovieCatalogService movieCatalogService;

    public MovieCatalogController(MovieCatalogService movieCatalogService) {
        this.movieCatalogService = movieCatalogService;
    }

    @GetMapping("{userId}")
    public List<CatalogItem> getMovieCatalogForUser(@PathVariable String userId) {
        return movieCatalogService.getAllMoviesForUser(userId);
    }
}
