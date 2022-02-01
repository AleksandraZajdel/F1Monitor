package F1Monitoring;

import java.util.HashSet;
import java.util.Set;

public class Channel implements Observable {

	public Channel() {
	}

	private Set<Observer> observers = new HashSet<>();
	private String newestChannelInfo;

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
		System.out.println(observer.getName() + " zosta³ dodany");
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
		System.out.println(observer.getName() + " zosta³ dodany");
	}

	@Override
	public void notifyObservers() {
		observers.forEach(Observer::update);
	}

	public String getNewestChannelInfo() {
		return newestChannelInfo;
	}

	public void publishChanelInfo(String newInfo) {
		newestChannelInfo = newInfo;
		notifyObservers();
	}

}