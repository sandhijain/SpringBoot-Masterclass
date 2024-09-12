package com.setter.loose.coupling;


public class UserManager {

    private UserDataProvider userDataProvider;

    public UserManager() {
    }

    public UserManager(UserDataProvider userDataProvider) {
         this.userDataProvider = userDataProvider;
     }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }
}
