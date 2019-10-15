package com.vinay.gojek.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.vinay.gojek.data.local.dao.ArticleDao;
import com.vinay.gojek.data.local.entity.ArticleEntity;

/**
 * File Description
 * <p>
 * Author: Vinay
 * Email: v6kr@outlook.com
 * Created: 7/24/2018
 * Modified: 7/24/2018
 */
@Database(entities = {ArticleEntity.class}, version = 2)
public abstract class ArticleDatabase extends RoomDatabase {
    public abstract ArticleDao articleDao();
}