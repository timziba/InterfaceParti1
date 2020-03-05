package metier;

import service.IManga;
import service.ISport;

public class Fatimata implements ISport , IManga {

	@Override
	public void liremanga() {
		System.out.println("j'adore regarder le MANGA");
	}

	@Override
	public void courir() {
		System.out.println("je sais courrir");
	}

	@Override
	public void nager() {
		System.out.println("je sais pas nager" );
	}
	

}
