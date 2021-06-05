package com.amazon.data;

import org.testng.annotations.DataProvider;

public class DataProvidersForTest {

    @DataProvider(name ="getDataForSearchTest")
    public static Object [][] getSearchData(){
        return new Object[][]{
                {"Java Books"},
                {"Selenium Books"}
        };
    }

    @DataProvider(name="getDataForNameField")
    public static Object [][] getName(){
        return new Object[][]{
                {"Meron Asgedom"},
                {"Bethel Asgedom"},
                {"Makda Asgedom"}
        };
    }

    @DataProvider(name="getDataForEmailField")
    public static Object [][] getEmail(){
        return new Object[][]{
                {"meronasg1@gmail.com"},
                {"meronasg@gmail.com"},
                {"meronasg@yahoo.com"}
        };
    }

    @DataProvider(name ="getDataForPasswordField")
    public static Object [][] getPassword(){
        return new Object[][]{
                {"abc123"},
                {"abcd1234"},
                {"abcde12345"}
        };
    }

    @DataProvider(name ="getDataForReenterPasswordField")
    public static Object [][] getreenterpasspassword (){
        return new Object[][]{
                {"abc123"},
                {"abcd1234"},
                {"abcde12345"}
        };
    }

    @DataProvider(name="dataForLoginTest")
    public static Object [][] getDataForLoginTest(){
        return new Object [][]{
                {"TestUser001", "TestUser001@gmail.com", "abc123"},
                {"TestUser002", "TestUser002@gmail.com", "abcd1234"},
                {"TestUser003", "TestUser003@gmail.com", "abcde12345"}
        };
    }






}
