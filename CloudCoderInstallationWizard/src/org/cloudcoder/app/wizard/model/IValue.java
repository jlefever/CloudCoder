package org.cloudcoder.app.wizard.model;

public interface IValue extends Cloneable {
	public String getName();
	public String getLabel();
	
	public ValueType getValueType();
	
	public void setString(String value);
	public<T extends Enum<T>> void setEnum(T value);
	public void setBoolean(boolean value);
	public void setPropertyValue(String propValue);
	public void update(IValue otherValue);
	
	public String getString();
	public<T extends Enum<T>> T getEnum(Class<T> cls);
	public boolean getBoolean();
	public String getPropertyValue();
//	public Object getObject();
	
	public IValue clone();

	public void addDisplayOption(DisplayOption opt);
	public boolean hasDisplayOption(DisplayOption opt);
	public boolean isEnum(Enum<?> enumVal);
}
