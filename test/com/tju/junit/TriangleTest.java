package com.tju.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	
	Triangle c_t=new Triangle();;
	
	@Test
	public void testF_triangle_one() {
		assertEquals(0, c_t.f_triangle(1, 2, 3));
	}
	
	@Test
	public void testF_triangle_one_01() {
		assertEquals(0, c_t.f_triangle(1, 3, 2));
	}
	
	@Test
	public void testF_triangle_one_02() {
		assertEquals(0, c_t.f_triangle(2, 1, 3));
	}
	
	@Test
	public void testF_triangle_one_03() {
		assertEquals(0, c_t.f_triangle(2, 3, 1));
	}
	
	@Test
	public void testF_triangle_one_04() {
		assertEquals(0, c_t.f_triangle(3, 1, 2));
	}
	
	@Test
	public void testF_triangle_one_05() {
		assertEquals(0, c_t.f_triangle(3, 2, 1));
	}
	
	@Test
	public void testF_triangle_two() {
		assertEquals(1, c_t.f_triangle(3, 3, 3));
	}
	
	@Test
	public void testF_triangle_three() {
		assertEquals(2, c_t.f_triangle(2, 3, 3));
	}
	
	@Test
	public void testF_triangle_three_01() {
		assertEquals(2, c_t.f_triangle(2, 2, 3));
	}
	
	@Test
	public void testF_triangle_three_02() {
		assertEquals(2, c_t.f_triangle(3, 2, 3));
	}
	
	@Test
	public void testF_triangle_four() {
		assertEquals(3, c_t.f_triangle(3, 4, 5));
	}
	
	@Test
	public void testF_triangle_four_01() {
		assertEquals(3, c_t.f_triangle(3, 5, 4));
	}
	
	@Test
	public void testF_triangle_four_02() {
		assertEquals(3, c_t.f_triangle(4, 3, 5));
	}
	
	@Test
	public void testF_triangle_four_03() {
		assertEquals(3, c_t.f_triangle(4, 5, 3));
	}
}
