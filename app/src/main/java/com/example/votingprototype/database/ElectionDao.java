package com.example.votingprototype.database;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ElectionDao {

    @Insert
    void insertElection(ElectionEntity electionEntity);

    @Query("SELECT * FROM election " +
            "WHERE region = :region")
    List<ElectionEntity> getAllFromRegion(String region);
}
