package com.androidand.calculatoruiui;

import com.androidand.calculatoruiui.business.Calcul;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Calcul calcul;
    @Before
    public void calcul() throws Exception {
      calcul = new Calcul();
    }

    @Test
    public void shouldReturnSommeOfTwoNumbers() throws Exception {
        Calcul calcul = new Calcul();
        Assert.assertEquals(calcul.add(1,1),2d, 0.0001d);
    }
}