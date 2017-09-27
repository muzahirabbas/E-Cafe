/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lsb2.cafe.staticstuff;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mushaf Ali
 */
public class tests {
    @Test
    public void testresult()
    {
        staticstuff.cookt[0]= 0;
       staticstuff.cookt[1]= 0;
       staticstuff.cookt[2]= 3;
       staticstuff.cookt[3]= 0;
       assertEquals(2,staticstuff.maxcook());
    }
  
}
