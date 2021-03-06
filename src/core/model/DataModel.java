package core.model;

import java.io.Serializable;

import org.json.JSONObject;

public abstract class DataModel implements Serializable, Cloneable {
	private static final long serialVersionUID = -4428851261642289836L;

	public abstract JSONObject toJSON();
}
