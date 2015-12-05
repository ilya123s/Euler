package excercises.trains;

import java.util.List;

/**
 * Simple train station implementation
 * 
 * @author Ilya
 *
 */
public class SimpleTrainStation implements TrainStation {

	private String stationName;

	private List<Route> routes;

	public SimpleTrainStation(String stationName, List<Route> routes) {
		this.stationName = stationName;
		this.routes = routes;
	}

	@Override
	public String getStationName() {
		return this.stationName;
	}

	@Override
	public List<Route> getRoutes() {
		return this.routes;
	}

	@Override
	public void addRoute(Route route) {
		if (null != route) {
			routes.add(route);
		}
	}

}
