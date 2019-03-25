package com.example.votingprototype.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "election")
public class ElectionEntity {

    @PrimaryKey
    @NonNull
    private String name;
    private String party;
    private String region;

    public ElectionEntity(@NonNull String name, String party, String region) {
        this.name = name;
        this.party = party;
        this.region = region;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
