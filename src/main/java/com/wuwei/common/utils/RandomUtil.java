package com.wuwei.common.utils;

import java.util.Random;

/** 
 * @ClassName: RandomUtil 
 * @Description: 随机工具类
 * @author: TheOne
 * @date: 2020年1月3日 下午7:18:03  
 */
public class RandomUtil {
	
	/** 
	 * @Title: random 
	 * @Description: 获得最小数和最大数之间的随机数
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min,int max) {
		Random random = new Random();
		return min+random.nextInt(max-min+1);
	}
	
	public static int[] random(int min,int max,int num) {
		int[] intArray = new int[num];
		for (int i = 0; i < num; i++) {
			intArray[i] = random(min, max);
		}
		return intArray;
	}
	
}
