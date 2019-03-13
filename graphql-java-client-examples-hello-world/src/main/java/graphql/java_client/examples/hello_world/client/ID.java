package graphql.java_client.examples.hello_world.client;

public class ID {

	/** The id String. May not be null */
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id == null) {
			throw new NullPointerException("id may not be null");
		}
		this.id = id;
	}

	@Override
	public String toString() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		// id may not be null
		if (o == null)
			return false;
		else if (!(o instanceof ID))
			return false;
		else
			return id.equals(((ID) o).getId());
	}
}
