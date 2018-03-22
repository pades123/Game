package Clock;

public class Main {
	public static void main(String[] args) {

//		Clock c = new Clock();
//		c.setTime(13, 25);
//		System.out.println(c);
//
//		// blank line
//		System.out.println();

		AlarmClock al = new AlarmClock();
		al.setAlarmClock(14, 00);
		if (al.getAlarmClock() == al.getTime()) {
			al.alarm();
		}
	}
}