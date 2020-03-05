package metier;

import service.IJeu;
import service.ISport;

public class Benjamin  implements ISport , IJeu{

	@Override
	public void jouer() {
		System.out.println("jouer au console");
	}

	@Override
	public void courir() {
		System.out.println("je cours bien");
	}

	@Override
	public void nager() {
		System.out.println("je sais nager");
	}

}
