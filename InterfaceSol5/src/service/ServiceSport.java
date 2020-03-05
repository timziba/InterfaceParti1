package service;

public class ServiceSport {

	public void participerTriahlon(ITriathlon itriatlon) {
		itriatlon.courir();
		itriatlon.nager();
		itriatlon.pedaler();
	}
}
