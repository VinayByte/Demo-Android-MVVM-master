package com.vinay.gojek.data.remote;

import com.vinay.gojek.data.remote.model.PopularArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * File Description
 * <p>
 * Author: Vinay
 * Email: v6kr@outlook.com
 * Created: 7/24/2018
 * Modified: 7/24/2018
 */
public interface ApiService {

    @GET("svc/mostpopular/v2/mostviewed/all-sections/{index}.json")
    Call<PopularArticleResponse> loadPopularArticles(@Path("index") int index);
}
