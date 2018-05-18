package com.boscloner.bosclonerv2.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Event.class}, version = 1, exportSchema = false)
public abstract class BosclonerDatabase extends RoomDatabase {
    public abstract EventDao eventDao();
}