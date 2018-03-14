package com.imooc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class SellApplicationTests {

	@Test
	public void contextLoads() throws ParseException {

		String szBeginTime = "2017-12-08 00:00:00";
		Date date1 = new Date();

		//把string转化为date
		DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");

		Date date = fmt.parse(szBeginTime);

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date1);
		calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
		Date date2 =calendar.getTime();
		int i = this.getDaysBetween(date,date1);
		System.out.println(i);
	}

	public static int getDaysBetween(Date smdate, Date bdate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			smdate = sdf.parse(sdf.format(smdate));
			bdate = sdf.parse(sdf.format(bdate));
		} catch (ParseException var10) {
			var10.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / 86400000L;
		return Integer.parseInt(String.valueOf(between_days));
	}

}
