package com.bridgelabz;


// interface

   interface AddressBookInfo {
     public void add();

     public void edit(String firstName);

     public void delete(String firstName);

     void sortAlphabetically();

     public void sortAlphabetically(String firstName);

     public void searchPersonInState(String firstName);

     public void searchPersonInCity(String firstName);

     void viewByCity(String city);

     void viewByState(String state);

 }
