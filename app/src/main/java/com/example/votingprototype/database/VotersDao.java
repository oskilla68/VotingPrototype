package com.example.votingprototype.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface VotersDao {

    @Insert
    void insertVoter(VoterEntity voterEntity);

    @Query("SELECT * FROM voters " +
            "WHERE loginID = :loginID")
    VoterEntity findVoterByLogin(String loginID);
}
