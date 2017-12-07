package fall2017;

public abstract class BaseItem implements IItem {
	private String _name;
	private int _value;
	private BaseItem() {
	}
	public BaseItem(String name, int value) {
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