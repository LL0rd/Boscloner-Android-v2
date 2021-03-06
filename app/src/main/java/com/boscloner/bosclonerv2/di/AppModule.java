package com.boscloner.bosclonerv2.di;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import com.boscloner.bosclonerv2.room.BosclonerDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = ViewModelModule.class)
class AppModule {
    public Application application;
    public AppModule(Application application) { this.application = application; }

    @Provides
    @Singleton
    BosclonerDatabase providesDatabase(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(), BosclonerDatabase.class, "boscloner_db")
                .fallbackToDestructiveMigration()
                .build();
    }

    @Singleton
    @Provides
    Context provideApplication() {
        return application;
    }
}