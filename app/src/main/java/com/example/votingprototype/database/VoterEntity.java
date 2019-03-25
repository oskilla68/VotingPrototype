package com.example.votingprototype.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "voters")
public class VoterEntity {
    @PrimaryKey
    @NonNull
    private String loginID;
    private String password;
    private String fullName;
    private String address;
    private Long dateOfBirth;

    public VoterEntity(@NonNull  String loginID, String password) {
        this.loginID = loginID;
        this.password = password;
    }

    @NonNull
    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(@NonNull String loginID) {
        this.loginID = loginID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void updateDetails(String fullName, String address, Long dateOfBirth) {
        this.fullName = fullName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
}
