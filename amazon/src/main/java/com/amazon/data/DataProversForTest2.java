package com.amazon.data;

import org.testng.annotations.DataProvider;

public class DataProversForTest2 {

    @DataProvider(name="searchData")
    public static Object [][]getSearchData(){
        return new Object [][]{
                {"iphone"},
                {"android"},
                {"ipad"}
        };

    }

}
