package taiji.com.cn.JavaBasePractice.basePractice;

public class WhileAndBreak {
	/**
	 * while语句和break的结合使用
	 * 
	 * 需求：小芳的妈妈每天给他2.5元，她都会存起来，但是每当这一天是存钱的第五天或者是5的倍数
	 * 她都会花去6元，请问：经过多少天，小芳才可以存到100元钱？
	 */
	/**
	 * 分析：
	 * A：小芳的妈妈每天给他2.5元  double dayMoney = 2.5；
	 * B：她都会存起来  double daySum = 0；
	 * C：从第一天开始存   int dayCount = 1；
	 * D：经过多少天才可以存到100元 double resule = 100；
	 * E：这一天是存钱的第五天或者事5的倍数，她都会花去6元
	 * 	   说明要判断dayCount的值，如果对5整除就减去6  daySum -= 6；
	 *    由此还隐含了一个问题，如果不是5的倍数天的话，钱要累加  daySum += dayMoney；
	 * F：因为不知道是多少天，所以先考虑使用死循环，一旦超过100元就break退出循环；  
	 */
	
	public static void main(String[] arge) {
		//小芳的妈妈每天给他2.5元
		double dayMoney = 2.5;
		//她都会存起来
		double daySum = 0;
		//从第一天开始存   
		int dayCount = 1;
		//经过多少天才可以存到100元 
		double resule = 100;
		//因为不知道是多少天，所以先考虑使用死循环
		while(true) {
			daySum += dayMoney;
			if (daySum >= resule) {
				System.out.println(String.format("一共使用%s天存够了100元", dayCount));
				break;
			}
			if (dayCount % 5 == 0 ) {
				System.out.println(String.format("第%s天花了6元", dayCount));
				daySum -= 6;
			}
			dayCount++;
		}
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
