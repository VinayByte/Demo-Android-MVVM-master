package com.vinay.gojek.view.callbacks;

import com.vinay.gojek.data.local.entity.ArticleEntity;

public interface ResponseListener {

    void onSuccess(ArticleEntity data);
    void onFailure(String message);
}
