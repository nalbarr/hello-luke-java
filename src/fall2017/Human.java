package fall2017;

import java.util.Random;

public class Human extends BaseItem implements IWalk, ISwim {
	public Human(String name, int value) {
		super(name, value);
	}
	public int walk() {
		return new Random().nextInt(20);
	}
	public int swim() {
		return new Random().nextInt(25);
	}
}
