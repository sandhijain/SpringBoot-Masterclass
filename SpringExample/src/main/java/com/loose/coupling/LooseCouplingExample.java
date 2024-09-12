package com.loose.coupling;


public class LooseCouplingExample {
    public static void main(String[] args) {
       UserDataProvider databaseProvider = new UserDatabaseProvider();
       UserManager userManager = new UserManager(databaseProvider);
        System.out.println(userManager.getUserInfo());

       UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
       UserManager webServiceUserManager = new UserManager(webServiceDataProvider);
        System.out.println(webServiceUserManager.getUserInfo());
    }

}
