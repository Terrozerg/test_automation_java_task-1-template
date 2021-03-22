package com.epam.test.automation.java.practice1;
import org.testng.Assert;
import org.testng.annotations.*;

public class MainTest {

    @Test
    public void task1TestAll(){
        System.out.println("Task1 all test");
        Assert.assertEquals(81,Main.task1(9));
        Assert.assertEquals(25,Main.task1(5));
        Assert.assertEquals(779,Main.task1(-779));
        Assert.assertEquals(5,Main.task1(-5));
        Assert.assertEquals(0,Main.task1(0));
    }

    @Test
    public void task2TestPass(){
        System.out.println("Task2 pass test");
        Assert.assertEquals(110,Main.task2(101));
        Assert.assertEquals(321,Main.task2(213));
        Assert.assertEquals(951,Main.task2(195));
        Assert.assertEquals(910,Main.task2(109));
        Assert.assertEquals(651,Main.task2(615));

        Assert.assertEquals(999,Main.task2(999));
        Assert.assertEquals(100,Main.task2(100));
    }

    @Test
    public void task2TestFail(){
        System.out.println("Task2 error test");
        Assert.assertEquals(-1,Main.task2(9));
        Assert.assertEquals(-1,Main.task2(12666));
        Assert.assertEquals(-1,Main.task2(-634));
    }

}