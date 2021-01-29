package org.launchcode.java.technology.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.launchcode.java.technology.main.Computer;

//@RunWith(SpringJUnit4ClassRunner.class)
public class TechnologyTests {

    @Before
    public void initializeObjects() {
        //Computer macbookPro = new Computer("Apple", "Macbook Pro", "iOS");
    }

    @Test
    public void computerTest_brandName_returnApple(){
        Computer macbookPro = new Computer("Apple", "Macbook Pro", "iOS");
        Assert.assertEquals("Apple", macbookPro.getBrand());
    }
}
