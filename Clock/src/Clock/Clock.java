package Clock;

import java.util.Arrays;

public class Clock {

	private int[] time = new int[2];

	public int[] getTime() {
		return time;
	}

	public void setTime(int hour, int minute) {
		this.time[0] = hour;
		this.time[1] = minute;
	}

	@Override
	public String toString() {
		return "Clock [time=" + Arrays.toString(time) + "]";
	}
}