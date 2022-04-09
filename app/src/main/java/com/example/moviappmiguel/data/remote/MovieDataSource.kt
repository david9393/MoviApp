package com.example.moviappmiguel.data.remote

import com.example.moviappmiguel.application.AppConstants
import com.example.moviappmiguel.data.model.MovieList
import com.example.moviappmiguel.domain.WebService

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList {
        return webService.getUpcomingMovies(AppConstants.API_KEY)
    }

    suspend fun getTopRatedMovies(): MovieList {
        return webService.getTopRatedMovies(AppConstants.API_KEY)
    }

    suspend fun getPopularMovies(): MovieList {
        return webService.getPopulardMovies(AppConstants.API_KEY)
    }
}