package aula25_factory2;

public class NotificationService {
	public static void main(String[] args) {
		try {
			NotificationFactory factory = new NotificationFactory();
			Notification notify1 = factory.createNotification("SMS");
			System.out.println(notify1);
			Notification notify2 = factory.createNotification("EMAIL");
			System.out.println(notify2);
			Notification notify3 = factory.createNotification("PUSH");
			System.out.println(notify3);
			Notification notify4 = factory.createNotification("dasdasdas");
			System.out.println(notify4);
		} catch (Exception e) {
			System.err.println("Meio de notificação inválido: " + e.getMessage());
		}
	}
}
