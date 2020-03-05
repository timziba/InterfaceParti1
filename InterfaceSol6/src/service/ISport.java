package service;

public interface ISport {
	public void nager();
	public default String pedaler() {
		return "tttyyy";
	}
}
