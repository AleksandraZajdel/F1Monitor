package F1Monitoring;

public class User implements Observer {

	private final Channel channel;
    private String newestChannelInfo;
    private String name;
    private String phone;

    public User(Channel channel, String name, String phone) {
    	
        this.channel = channel;
        this.name = name;
        this.phone = phone;
        newestChannelInfo = channel.getNewestChannelInfo();
    }

	@Override
    public void update() {
        newestChannelInfo = channel.getNewestChannelInfo();
        System.out.println(String.format("Zosta³a wys³ana mowa wiadomoœæ!",  newestChannelInfo));
    }

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
}