package com.wangwizheng.test;

import org.junit.Test;

import com.wangweizheng.common.utils.RandomUtil;

public class RandomUtilTest {
	
	//方法1获取min-max之间的随机整数
	@Test
	public void getrandom(){
		for(int i = 0; i <10; i++){
			System.out.print(RandomUtil.random(1, 3));
		}
		
		
		
	}

}
