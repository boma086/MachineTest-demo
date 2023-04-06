
public 	class equalsHashcode {
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof equalsHashcode)) return false;
		return this == other;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}
