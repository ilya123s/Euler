package excercises.trains;

import java.util.List;

public interface TrainStation {

	public String getStationName();

	public List<Route> getRoutes();
	
	public void addRoute(Route route);

}
