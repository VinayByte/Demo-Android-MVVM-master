package com.vinay.gojek.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.vinay.gojek.R;
import com.vinay.gojek.common.Constants;

import com.vinay.gojek.databinding.FragmentArticleDetailsBinding;
import com.vinay.gojek.view.base.BaseFragment;
import com.vinay.gojek.viewmodel.ArticleDetailsViewModel;

/**
 * File Description
 * <p>
 * Author: Vinay
 * Email: v6kr@outlook.com
 * Created: 7/24/2018
 * Modified: 7/24/2018
 */
public class ArticleDetailFragment extends BaseFragment<ArticleDetailsViewModel, FragmentArticleDetailsBinding> {
    @Override
    protected Class<ArticleDetailsViewModel> getViewModel() {
        return ArticleDetailsViewModel.class;
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_article_details;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle args = getArguments();
        if(null != args) {
            viewModel.setUrl(args.getString(Constants.BUNDLE_KEY_ARTICLE_URL));
            viewModel.loadArticleDetails();
        }
        viewModel.getArticleEntityMutableLiveData().observe(this, articleEntity -> {
            if(null != articleEntity && null != args) {
                dataBinding.textTitle.setText(articleEntity.getTitle());
                dataBinding.textContent.setText(articleEntity.getContent());
                dataBinding.textPublishedDate.setText(args.getString(Constants.BUNDLE_KEY_ARTICLE_PUBLISHED_DATE));
                dataBinding.loadingProgress.setVisibility(View.GONE);
            }
        });

        viewModel.getErrorMessageRecieved().observe(this, message ->{
            dataBinding.loadingProgress.setVisibility(View.GONE);
            dataBinding.textContent.setText(getActivity().getString(R.string.networkError));
        });
    }
}
