package es.com.manpower.notas.util;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateUtilTest {
	Date fecha;

	@Before
	public void setUp() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.set(1972, Calendar.NOVEMBER, 17);
		fecha = cal.getTime();
	}

	@After
	public void tearDown() throws Exception {
		fecha = null;
	}


	@Test
	public void testGetAnio() {
		assertEquals(1972,DateUtil.getAnio(fecha));
		// aqui abajo como se ve al imprimirlo
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		System.out.println("fecha " +fecha);
		System.out.println("calendar " +cal);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-EEEEEEE");
		System.out.println("fecha formateada=" + sdf.format(fecha));
	}

}
