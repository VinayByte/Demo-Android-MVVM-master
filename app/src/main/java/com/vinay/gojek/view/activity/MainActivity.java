package com.vinay.gojek.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;

import com.vinay.gojek.R;
import com.vinay.gojek.databinding.ActivityMainBinding;
import com.vinay.gojek.utils.FragmentUtils;
import com.vinay.gojek.view.base.BaseActivity;
import com.vinay.gojek.view.fragment.ArticleListFragment;

import static com.vinay.gojek.utils.FragmentUtils.TRANSITION_NONE;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.replaceFragment(this, ArticleListFragment.newInstance(), R.id.fragContainer, false, TRANSITION_NONE);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }
}
