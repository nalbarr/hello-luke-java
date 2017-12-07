package fall2017;

import java.util.Random;

public class KillerWhale extends BaseItem {
	public KillerWhale(String name, int value) {
		super(name, value);
	}
	public int swim() {
		return new Random().nextInt(100);
	}
}
