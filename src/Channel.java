import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
	private List<Observer> observers = new ArrayList<Observer>();
	private String channelName;
	private String status;
	
	public Channel(String channelName, String status) {
		this.channelName = channelName;
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getChannel() {
		return this.channelName;
	}
	
	public void setChannel(String channelName) {
		this.channelName = channelName;
	}
	
	public void setStatus(String status) {
		this.status = status;
		notifyObserver();
	}
	
	public void notifyObserver() {
		for(Observer o : observers) {
			o.update(status);
		}
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}


}