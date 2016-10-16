package humi;

public class EntryEntity {
	public Integer time;
	public Integer temperature;
	public Integer humidity;
	
	public String keyTime;
	
	public EntryEntity(int time, int temp, int hum) {
		this.time = time;
		this.temperature = temp;
		this.humidity = hum;
		
		this.format();
	}
	
	protected void format()
	{
		keyTime = Helper.formatDateFromTimestamp(this.time);
	}
}
