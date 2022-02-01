package F1Monitoring;

public class ObserverDemo {

	public static void main(String[] args) {		
		Channel channel = new Channel();
		User LewisH = new User(channel, "Lewis Hamilton", "1");
		User ValtteriB = new User(channel, "Valtteri Bottas", "2");
		channel.attach(LewisH);
		channel.attach(ValtteriB);
		channel.publishChanelInfo("nowe informacje w dziale F1");
		channel.detach(LewisH);
	}

}