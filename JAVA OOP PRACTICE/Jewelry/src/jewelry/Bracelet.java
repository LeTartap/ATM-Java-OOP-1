package jewelry;

public class Bracelet extends Jewelry{

	
	public Bracelet(int carate) {
		carats= carate;
	}
	@Override
	int price() {
		return carats * 4500;
	}

}
