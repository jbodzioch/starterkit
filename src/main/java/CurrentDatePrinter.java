
import java.util.Date;

import org.joda.time.DateTime;

public class CurrentDatePrinter {

	public CurrentDatePrinter() {
		java.util.Date juDate = new Date();
		DateTime dt = new DateTime(juDate);

		System.out.println(dt.getYear() + "." + dt.getMonthOfYear() + "." + dt.getDayOfMonth());
	}
}
