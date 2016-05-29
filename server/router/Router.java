package router;

import http.Request;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import view.AbstractView;

public class Router {
	private static final Router INSTANCE = new Router();
	public List<Route> list = new LinkedList<Route>();

	
	public static Router getInstance() {
		return INSTANCE;
	}
	public int size() {
		return list.size();
	}
	public boolean add(Route e) {
		return list.add(e);
	}
	public boolean addAll(Collection<? extends Route> c) {
		return list.addAll(c);
	}
	
	public AbstractView find(Request request){
		for(Route r: list){
			if(r.match(request) == true){
				return r.getView();
			}
		}
		return null;
	}
}
