package Clock;

import java.util.Arrays;

public class AlarmClock extends Clock {

	private int[] alarmClock = new int[2];

	public int[] getAlarmClock() {
		return alarmClock;
	}

	public void setAlarmClock(int hour, int minute) {
		this.alarmClock[0] = hour;
		this.alarmClock[1] = hour;
	}

	public void alarm() {
		System.out.println("ALARM!!!");
	}

	@Override
	public String toString() {
		return "AlarmClock [alarmClock=" + Arrays.toString(alarmClock) + "]";
	}
}