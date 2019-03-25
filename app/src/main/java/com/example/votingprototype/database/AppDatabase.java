package com.example.votingprototype.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {VoterEntity.class, ElectionEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "ElectionsDatabase.db";
    private static volatile AppDatabase singletonDatabaseInstance;
    private static final Object Lock = new Object();
    public abstract VotersDao votersDao();
    public abstract ElectionDao electionDao();

    public static AppDatabase getDatabaseInstance(Context context){
        if(singletonDatabaseInstance == null) {
            synchronized (Lock) {
                if(singletonDatabaseInstance == null) {
                    singletonDatabaseInstance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, DATABASE_NAME).build();
                }
            }
        }
        return singletonDatabaseInstance;
    }
}
