package com.tight.coupling;

public class UserMg {
    private UserDb user = new UserDb();
    public String getUserInfo(){

        return user.getUserDetails();
    }
}
