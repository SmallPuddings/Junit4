package com.tju.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
	
	Calculate c_cla=new Calculate();
	
	@Test
	public void testF_add() {
		int i_actual=c_cla.f_add(3, 4);
		int i_expect=7;
        assertEquals(i_expect, i_actual);
	}

}
