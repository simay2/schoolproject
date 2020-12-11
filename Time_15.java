package lessons.fifteen.seventeen;

public class Time_15 {
	private int hour, minute, second;

	public Time_15() {
		// TODO Auto-generated constructor stub
		setTime(System.currentTimeMillis());
	}
	
	public Time_15( long millisec ) {
		setTime (millisec);
		}
	
	public Time_15( int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}
	
	private void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	private void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	private void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime( long milliseconds) {
		long millisecondsToday = milliseconds % (1000l * 60 * 60 * 24);
		this.hour = (int)(millisecondsToday / (1000 * 60 * 60));
		this.minute = (int)(millisecondsToday % (1000 * 60 * 60)) / (1000 * 60);
		this.second = (int)(millisecondsToday % (1000 * 60 * 60)) % (1000 * 60) / 1000;
		
	}
	
	public String toString() {
		return "Hour: " + hour + " , minutes: " + minute + " , seconds: " + second;
				}
	

}
