package humiMeasure;

public class EntryEntity {
	public Integer time;
	public Integer temperature;
	public Integer humidity;
	
	public String keyTime;
	public String dayTime;
	
	public EntryEntity(int time, int temp, int hum) {
		this.time = time;
		this.temperature = temp;
		this.humidity = hum;
		
		this.format();
	}
	
	protected void format()
	{
		this.keyTime = Helper.formatDateFromTimestamp(this.time, "yyyy-MM-dd");
		this.dayTime = Helper.formatDateFromTimestamp(this.time, "yyyy-MM-dd HH:mm");
	}

	public String toString() {
		return String.valueOf(this.time);
	}
}
