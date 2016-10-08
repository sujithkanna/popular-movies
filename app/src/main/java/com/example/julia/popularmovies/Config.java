/*
 * Copyright 2016.  Julia Kozhukhovskaya
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.julia.popularmovies;

class Config {

    // Paths used in the JSON String
    static final String TMD_ID = "id";
    static final String TMD_LIST = "results";
    static final String TMD_POSTER = "poster_path";
    static final String TMD_TITLE = "title";
    static final String TMD_DATE = "release_date";
    static final String TMD_RATING = "vote_average";
    static final String TMD_PLOT = "overview";

    // JSON URL
    static final String MOVIE_BASE_URL = "http://api.themoviedb.org/3/discover/movie?";
    static final String SORT_BY_PARAM = "sort_by";
    static final String API_KEY_PARAM = "api_key";

    // Sort options
    static final String POPULAR = "popular";
    static final String TOP_RATED = "top_rated";
    static final String FAVORITES = "favorites";
}