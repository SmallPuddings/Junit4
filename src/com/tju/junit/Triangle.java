package com.tju.junit;

public class Triangle {
	
	/**
	 * 给定三条边a、b、c
	 * 判断是否可以构成一个三角形
	 * 若可以构成一个三角形，输出三角形的类型 
	 **/
	public int f_triangle(int i_a, int i_b, int i_c){
		if(i_a+i_b>i_c&&i_b+i_c>i_a&&i_c+i_a>i_b){
			if(i_a==i_b&&i_b==i_c){
				System.out.println("这是一个等边三角形！");
				return 1;
			}else if(i_a==i_b||i_b==i_c||i_c==i_a){
				System.out.println("这是一个等腰三角形！");
				return 2;
			}else{
				System.out.println("这是一个三角形！");
				return 3;
			}
		}else{
			System.out.println("这不是一个三角形！");
			return 0;
		}
	}
}
