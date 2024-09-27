package aula25_factory2;

public class NotificationFactory {
	public Notification createNotification(String typeNotification) {
		if (typeNotification == null || typeNotification.isEmpty()) {
			return null;
		}
		
		switch(typeNotification) {
		case "SMS":
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "PUSH":
			return new PushNotification();
		default:
			throw new IllegalArgumentException();
		}
	}
}
