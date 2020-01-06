package taiji.com.cn.JavaBasePractice;

import java.time.LocalDateTime;
import java.util.Date;

public class stringFormat{
	/**
	 * 格式化字符串：日期和时间格式化
	 * 日期格式化：
	 * %te：一个月中的某一天（1-31），%tb：月份简称，%tB：月份全称，%ta：星期几简称，
	 * %tA：星期几全称，%tc：全部日期时间格式，%tY：四位年份，%ty：两位年份，
	 * %tj：一年中的第几天（001-366），%tm：月份，，%td：一个月中的第几天（01-31），
	 * 时间格式化：
	 * %tH：2位24时制（00-23），%tI：2位12时制（01-12）
	 * %tk：2位24时制（0-23），%t1：2位12时制（1-12）
	 * %tM：2位分钟数（00-59）， %tS：2位秒数（00-60）
	 * %tp：上午或下午标记（中文：下午，英文：pm）
	 * 时间日期组合格式化：
	 * %tF：“年-月-日”格式（4位年份），%tD：“月/日/年”格式（2位年份），
	 * %tT：“时:分:秒”格式（24时制）
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		String timeAndDate= String.format("%tc", date);
		String Mday = String.format("%te", date);//一个月中的某一天
		String Yday = String.format("%tj", date);//一年中的第几天
		String week = String.format("%tA", date);//星期全称
		String time= String.format("%tF", date);		//年-月-日
		String dateTime = String.format("%tT", date);	//时:分:秒
		System.out.println(String.format("一个月中的某一天(%s)", Mday));//一个月中的某一天(25)
		System.out.println(String.format("一年中的第(%s)天", Yday));//一年中的第(359)天
		System.out.println(String.format("今天是星期：(%s)", week));//今天是星期：(星期三)
		System.out.println("全部时间日期格式："+timeAndDate);//全部时间日期格式：星期三 十二月 25 10:23:30 CST 2019
		System.out.println(String.format("年-月-日：(%s)", time));//年-月-日：(2019-12-25)
		System.out.println(String.format("时:分:秒: (%s)", dateTime));//时:分:秒: (10:23:30)
		System.out.println(String.format("年-月-日 时-分-秒：(%s %s)",time, dateTime));//年-月-日 时-分-秒：(2019-12-25 10:23:30)
		
		System.out.println(String.format(":::::::%tY-%tm", date,date));//:::::::2019-12
		
		/**
		 * 常规类型格式化
		 * %b、%B：格式化为布尔类型；%s、%S：格式化为字符串类型；%c、%C：格式化为字符类型；
		 * %d：格式化为十进制整数；
		 */
//		int a = 400/2;
//		String str = String.format("%d", a);
		System.out.println(String.format("a的值为：(%s)", String.format("%d", 400/2)));//a的值为：(200)
//		String boolen = String.format("%b", 3>5);
		System.out.println(String.format("boolen的值为：(%s)",String.format("%b", 3>5)));//boolen的值为：(false)
		System.out.println(String.format("数字的散列码为：(%s)", String.format("%h", 5)));//数字的散列码为：(5)
		
		
		/**
		 * 正则表达式：
		 * \d：0-9任意一个数字；\D：任何一个非数字字符；\s：空白字符，如：'\t','\n';
		 * \S:非空白字符；\w：可用作标识符的字符，但不包括'$';
		 * 注：‘.’在正则中代表任何一个字符，如果想使用普通意义的'.',则使用转义符‘\’;
		 */
		
		/**
		 * 字符串生成器
		 * 方法：StringBuilder
		 * 注：使用StringBuilder方法拼接字符串不会创建对象，不会增加系统开销，效率会很高，
		 * 	而使用‘+’字符拼接字符串，会时刻创建字符串新的对象，所以尽量少用‘+’拼接。
		 * StringBuilder有添加append(),删除delete(int start,int end)和插入insert(int offset arg)方法
		 */
		String str = "";
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			str = str + i;
		}
		long endTime = System.currentTimeMillis();
		long startAndEnd = endTime - startTime;
		System.out.println(String.format("startAndEnd消耗时间：(%s),str为(%s),str得长度为：(%s)", startAndEnd,str.substring(0,str.length() > 100 ? 100 : str.length()),str.length()));		
		long start = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder(); //创建StringBuilder对象
		for (int j = 0; j < 10000; j++) {
			//添加方法.append()
			builder.append(j);                       //调用.append()方法
		}
		long end = System.currentTimeMillis();
		long dTime = end - start;
		System.out.println(String.format("builder消耗时间：(%s),str为(%s)", dTime,str.substring(0,str.length() > 100 ? 100 : str.length()).toString()));
		
		/**
		 * 插入方法 .insert(int offset arg)
		 */
		StringBuilder  builder2 = new StringBuilder("cui");
		builder2.insert(3, "qiqi");    //如果添加的位置上有字符，则胡添加的字符会替换到原字符
		System.out.println(String.format("添加后为(%s)", builder2.toString()));//添加后为(cuiqiqi)
		
		/**
		 * delete(int start,int end)
		 * 从start开始，到end-1处字符结束
		 */
		StringBuilder sBuilder = new StringBuilder("cuihahaqiqi");
		sBuilder.delete(3, 7);
		System.out.println(String.format("删除后的字符为：(%s)", sBuilder.toString()));//删除后的字符为：(cuiqiqi)
	}
}
