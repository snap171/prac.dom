package domain;

public abstract class Entity {

	private int id;
	
	EntityState status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public EntityState getState() {
		return status;
	}

	public void setState(EntityState state) {
		this.status = status;
	}
	
	
}