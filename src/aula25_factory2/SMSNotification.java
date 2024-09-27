package aula25_factory2;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Notificação por SMS");
	}

}
