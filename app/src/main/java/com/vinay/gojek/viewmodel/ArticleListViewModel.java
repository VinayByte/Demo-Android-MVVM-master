package com.vinay.gojek.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;


import com.vinay.gojek.data.local.entity.ArticleEntity;
import com.vinay.gojek.data.remote.Resource;
import com.vinay.gojek.data.remote.repository.ArticleRepository;

import java.util.List;

import javax.inject.Inject;

/**
 * File Description
 * <p>
 * Author: Vinay
 * Email: v6kr@outlook.com
 * Created: 7/24/2018
 * Modified: 7/24/2018
 */
public class ArticleListViewModel extends ViewModel {
    private final LiveData<Resource<List<ArticleEntity>>> popularArticles;

    @Inject
    public ArticleListViewModel(ArticleRepository articleRepository) {
        popularArticles = articleRepository.loadPopularArticles(7);
    }

    public LiveData<Resource<List<ArticleEntity>>> getPopularArticles() {
        return popularArticles;
    }
}
