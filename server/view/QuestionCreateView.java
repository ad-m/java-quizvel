package view;

import http.Request;
import model.User;
import storage.QuestionStorage;

import org.json.JSONException;
import org.json.JSONObject;

import model.Question;


public class QuestionCreateView extends AbstractAdminJSONView {

	@Override
	public JSONObject getJSON(Request request, User user) throws JSONException {
		QuestionStorage qs = QuestionStorage.getInstance();
		qs.add(new Question().fromJSON(request.getJSON()));

		JSONObject response = new JSONObject();
		response.put("status", "OK");
		response.put("id", qs.size());
		return response;
	}

}