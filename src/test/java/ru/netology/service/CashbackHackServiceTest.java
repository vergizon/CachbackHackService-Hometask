package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void CalcNeedSpendElseForCashback (){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1080);
        int expected = 920;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void CalcNeedIfSpendZeroForCashback (){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void CalcNeedIfSpendNegativeForCashback (){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(-999);
        int expected = 1999;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void CalcNeedIfSpendThousandForCashback (){
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }


}