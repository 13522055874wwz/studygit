package com.wangweizheng.common.utils;

import java.util.Random;
/**
 * 
* 项目名称：wangweizhengcommon   
* 类名称：RandomUtil   
* 类描述：   字符工具类
* 创建人：王伟征   
* 创建时间：2019年6月17日 上午9:14:45   
* @version
 */
public class RandomUtil {
	
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random r = new Random();
		return r.nextInt(max-min+1) + min;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	/*public static int[] subRandom (int min, int max, int subs){
		
		}*/
}
