package aula25_factory2;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Notificação por E-mail");
	}

}
