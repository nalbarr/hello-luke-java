package fall2017;

public class Item implements IItem {
	private String _name;
	private int _value;
	private Item() {
	}
	public Item(String name, int value) {
		_name = name;
		_value = value;
	}
	public int getValue() {
		return _value;
	}
	public String getName() {
		return _name;
	}
}