package jewelry;

public class Necklace extends Jewelry {
	public Necklace(int carate) 
	{
		carats=carate;
	}
	int price() {
		return carats *4500;
	}

}
