package taiji.com.cn.JavaBasePractice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
<<<<<<< HEAD
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

import org.junit.Test;

public class LocalDateTimeTset {

	@Test
	public void getTime() {
		LocalDateTime dateTime = LocalDateTime.now();
		int day = dateTime.getDayOfMonth();  //一个月中的第几天/号
		int year = dateTime.getDayOfYear();  //一年中的第几天
		DayOfWeek week = dateTime.getDayOfWeek();//英文的星期几，返回的是DayOfWeek
		int hour = dateTime.getHour();      //一天中的小时(24时制，)

		System.out.println(String.format("%s,%s,%s,%s,%s", day,year,week,String.valueOf(hour)));
	}
	
	/**
	 * 处理时间minus方法和plus方法
	 * minus：在此时间基础上减去指定时间量
	 * 		minusDays：减去指定的天数
	 * 		minusHours：减去指定的小时数
	 * 		minusMinutes：减去指定的分钟数
	 * 		minusMonths，minusSeconds，minusWeeks，minusYears，
	 * plus：在此时间基础上加上指定时间量
	 * 
	 * 
	 */
	@Test 
	public void testLocalDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now(); //当前时间
		LocalDateTime local = LocalDateTime.parse("2019-12-30T14:50:00");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		//此方法时在当前时间的天 -2，比如当前是26号，.minusDays(2)结果就是24 
		LocalDateTime localDate = local.minusDays(2); 
		//Period.ofDays在当前时间的基础上天数加2，今天28号，结果就是30号；还有一种情况,如果加的天数已经超过本月，则自动到一个月，
		//比如2019-12-30，加2天，自动到2020-01-01
		LocalDateTime localDate1 = local.plus(Period.ofDays(2));
		String dateString = df.format(localDate);  //格式化时间为yyyy-MM-dd HH:mm:ss形式
		String dateString1 = df.format(localDate1);
		System.out.println(String.format("%s\n%s", dateString,dateString1));
	}
	/**
	 * LocalDate：只会获取年月日
	 */
	@Test 
	public void testLocalDate() {
		LocalDate localDate = LocalDate.now();
		int year = localDate.getYear();				//获取当前年份
		int year1 = localDate.get(ChronoField.YEAR); //获取当前年份
		Month month = localDate.getMonth();
		int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(String.format("%s\n%s\n%s\n%s\n%s", localDate,year,year1,month,month1));
		LocalTime localTime = LocalTime.now();

		System.out.println(String.format("%s", localTime));
	}

	@Test
	public void testLocalTime() {
		LocalTime localTime = LocalTime.now();

		System.out.println(String.format("%s", localTime));
	}
	
	
	
	
=======
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.Test;

public class LocalDateTimeTset {

	@Test
	public void getTime() {
		LocalDateTime dateTime = LocalDateTime.now();
		int day = dateTime.getDayOfMonth();  //一个月中的第几天/号
		int year = dateTime.getDayOfYear();  //一年中的第几天
		DayOfWeek week = dateTime.getDayOfWeek();//英文的星期几，返回的是DayOfWeek
		int hour = dateTime.getHour();      //一天中的小时(24时制，)

		System.out.println(String.format("%s,%s,%s,%s,%s", day,year,week,String.valueOf(hour)));
	}
>>>>>>> branch 'master' of https://github.com/cuiqiqi/JavaBasePractice.git
	//LocalDateTime转Date
	@Test
	public void LocalDateTimeToDate() {
		Instant instant = Instant.now();					 //获取当前时间点，基于世界标准时间 从 1970/01/01 00:00:00.000 到 某一个时间点 经历的时长（秒 + 纳秒）
		LocalDateTime nowTime = LocalDateTime.now();         //获取当前时间
		ZoneId zoneId = ZoneId.systemDefault();				 //获取当前系统所在时区
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);//获取当前系统默认时区的默认时间，与LocalDateTime.now()方法一样
		ZoneId beijingId = ZoneId.of("+08:00");				 //获取指定时区
		ZonedDateTime zonedDateTime = nowTime.atZone(zoneId);//获取该时间点在该时区上的时间日期信息
		Date  nowDate = Date.from(zonedDateTime.toInstant());//转为Date
		System.out.println(String.format("%s,\n%s,\n%s,\n%s,\n%s,\n%s", nowTime,zoneId,localDateTime,beijingId,zonedDateTime,nowDate));
		
		DateFormat dateFormat = new SimpleDateFormat("z");   //"Z"时为+0800；"z"时为CST
		System.out.println(String.format("%s", dateFormat.format(new Date())));
	}
	//Date转LocalDateTime
	@Test
	public void DateToLocalDateTime() {
		Date date = new Date();
		Instant instant = Instant.now();       //本地时间(默认-8)
		Instant instant2 = date.toInstant();   //本地时间(默认-8)
		ZoneId zoneId = ZoneId.systemDefault();//系统默认时区
		System.out.println(String.format("%s,\n%s,\n%s,\n%s",date, instant,instant2,zoneId));
	}
	//LocalDateTime格式化
	@Test
	public void LocalDateTimeOfFormat() {
		LocalDateTime now = LocalDateTime.now();//2019-12-26T10:54:25.058
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:ss:mm");
		DateTimeFormatter timestamp = DateTimeFormatter.ofPattern("yyyyMMddHHssmm");
		String format = df.format(now);			//2019-12-26 10:25:54
		String format1 = timestamp.format(now); //20191226102554
		System.out.println(String.format("%s,\n%s,\n%s",now, format,format1));
		
		//字符串解析
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:ss:mm");
		LocalDateTime localDateTime = LocalDateTime.from(df1.parse("2019-12-26 10:25:54")); //2019-12-26T10:54:25
		System.out.println(String.format("%s",localDateTime));
		
		//SpringMVC中对于时间默认对JSR310提供支持，只需在日期字段上加注解@DateTimeFormat(pattern = "yyyy-MM-dd HH:ss:mm")
		
		//mybatis中数据库字段对应的实体类时间也是默认使用Date类型不做改变，而是提供了针对jsr310的一个插件
//		<dependency>
//			<groupId>org.mybatis</groupId>
//			<artifactId>mybatis-typehandlers-jsr310</artifactId>
//			<version>xxx</version>
//		</dependency>
		//引入包之后不需要做任何改变，实体类为LocalDateTime等的字段就可以识别
		
		//SpringDataJPA
		//Spring的做法跟Mybatis的类似，使用一个Jsr310JpaConverters类来做转换，SpringBoot中只要在启动类上加注解即可：
		//@EntityScan(basePackageClasses = {Application.class,Jsr310JpaConverters.class})
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
