package com.chengzhi.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 * ���ڲ����� jdk>=1.8
 * 
 * @author ruanchengzhi LocalDate ���������յ����� LocalTime ����ʱ���� LocalDateTime
 *         ����������ʱ���� DateTimeFormatter ���ڸ�ʽ��
 *
 */
public class DateUtils {
	public static final String YEARMONTHDAYHHMMSS = "yyyyMMddHHmmss";
	public static final String YEAR_MONTH_DAY_HHMMSS = "yyyy-MM-dd HH:mm:ss";
	public static final String YEAR_MONTH_DAY = "yyyy-MM-dd";
	public static final String YEAR_MONTH = "yyyy-MM";

	public static void main(String[] args) {
		LocalDateTime stringToLocalDateTime = DateUtils.stringToLocalDateTime(
				"2011-12-12", YEAR_MONTH_DAY);
		System.out.println(stringToLocalDateTime);
	}


	/**
	 * ��ȡ��ǰʱ�� yy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getCurrentTime() {
		try {
			return DateTimeFormatter.ofPattern(YEAR_MONTH_DAY_HHMMSS).format(LocalDateTime.now());
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		} finally {
		}
		return null;
	}

	/**
	 * ���ڸ�ʽ��
	 * 
	 * @param data
	 * @param format
	 * @return
	 */
	public static String localDateTimeFormatToString(LocalDateTime data,String format) {
		try {
			return data.format(DateTimeFormatter.ofPattern(format));
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * string ת LocalDateTime
	 * 
	 * @param dateStr
	 *            ����"2017-08-11 01:00:00"
	 * @param format
	 *            ����"yyyy-MM-dd HH:mm:ss"
	 * @return
	 */
	public static LocalDateTime stringToLocalDateTime(String time,String format) {
		try {
			return LocalDateTime.parse(time, DateTimeFormatter.ofPattern(format));
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
