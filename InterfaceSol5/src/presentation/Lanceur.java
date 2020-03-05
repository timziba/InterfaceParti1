package presentation;

import service.Cedric;
import service.Fatimata;
import service.ServiceSport;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fatimata fati = new Fatimata();
		Cedric ced = new Cedric();
		ServiceSport sport = new ServiceSport();
		sport.participerTriahlon(fati);
		//sport.participerTriahlon(ced);
		

	}

}
