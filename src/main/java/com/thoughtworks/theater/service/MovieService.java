package com.thoughtworks.theater.service;

import com.thoughtworks.theater.entity.Movie;
import com.thoughtworks.theater.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  private final MovieRepository movieRepository;

  public MovieService(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  public Iterable<Movie> getNewMovies() {
    return movieRepository.getNewMovies();
  }

  // TODO: complete this service
}
