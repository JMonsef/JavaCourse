package modulo6.Parte2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	static Calendar calendario;
	static Date fecha;
	static String fechaMod;
	static SimpleDateFormat formato;

	public static void main(String[] args) {

		calendario = Calendar.getInstance();
		fecha = calendario.getTime();
		formato = (SimpleDateFormat) DateFormat.getDateInstance(DateFormat.MEDIUM);
		
		calendario.set(2000, Calendar.OCTOBER, 9);
		fechaMod = formato.format(fecha);
		
		System.out.println("Fecha: " + fecha);
		System.out.println("Año: " + anio(fecha));
		System.out.println("Mes: " + mes(fecha));
		System.out.println("Dia" + dia(fecha));

		if (comprobarFinde(fecha))
			System.out.println("es fin de semana");
		else
			System.out.println("no es fin de semana");

		String modelo = "yyyy-MM-dd";
		Calendar cal = asCalendar(modelo, "2000-10-09");
		String calendarioFecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR);

		System.out.println("dia de la semana: " + diaSemana(fecha));
		System.out.println("metodo asDate: " + asData(modelo, "2000-10-09"));
		System.out.println("metodo asCalendar: " + calendarioFecha);
		System.out.println("metodo asDate: " + asString(modelo, fecha));
	}

	public static int anio(Date fecha) {

		calendario.setTime(fecha);
		return calendario.get(Calendar.YEAR);

	}

	public static int mes(Date fecha) {

		calendario.setTime(fecha);
		return calendario.get(Calendar.MONTH) + 1;

	}

	public static int dia(Date fecha) {

		calendario.setTime(fecha);
		return calendario.get(Calendar.DAY_OF_MONTH);

	}

	public static boolean comprobarFinde(Date fecha) {

		calendario.setTime(fecha);
		if ((calendario.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || calendario.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)

			return true;
		else 
			return false;

	}

	public static int diaSemana(Date fecha) {

		calendario.setTime(fecha);
		return calendario.get(Calendar.DAY_OF_WEEK);

	}

	public static Date asData(String modelo, String Fecha) {

		SimpleDateFormat formato = new SimpleDateFormat(modelo);
		Date fechaDate = null;

		try {
			fechaDate = formato.parse(Fecha);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return fechaDate;

	}

	public static Calendar asCalendar(String modelo, String Fecha) {

		SimpleDateFormat formato = new SimpleDateFormat(modelo);
		Date fechaDate;

		try {
			fechaDate = formato.parse(Fecha);
			Calendar cal = Calendar.getInstance();
			cal.setTime(fechaDate);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return calendario;

	}

	public static String asString(String modelo, Date Fecha) {

		SimpleDateFormat formato = new SimpleDateFormat(modelo);
		String resultado = "";

		try {
			resultado = formato.format(Fecha);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return resultado;

	}

}
