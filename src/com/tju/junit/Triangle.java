package com.tju.junit;

public class Triangle {
	
	/**
	 * ����������a��b��c
	 * �ж��Ƿ���Թ���һ��������
	 * �����Թ���һ�������Σ���������ε����� 
	 **/
	public int f_triangle(int i_a, int i_b, int i_c){
		if(i_a+i_b>i_c&&i_b+i_c>i_a&&i_c+i_a>i_b){
			if(i_a==i_b&&i_b==i_c){
				System.out.println("����һ���ȱ������Σ�");
				return 1;
			}else if(i_a==i_b||i_b==i_c||i_c==i_a){
				System.out.println("����һ�����������Σ�");
				return 2;
			}else{
				System.out.println("����һ�������Σ�");
				return 3;
			}
		}else{
			System.out.println("�ⲻ��һ�������Σ�");
			return 0;
		}
	}
}
