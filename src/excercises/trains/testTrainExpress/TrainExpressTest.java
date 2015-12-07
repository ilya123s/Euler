package excercises.trains.testTrainExpress;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import excercises.trains.TrainsExpress;
import excercises.trains.data.Route;
import excercises.trains.data.trainStation.TrainStation;

public class TrainExpressTest {
	
	TrainsExpress classUnderTest;
	
	List<TrainStation> stations;
	
	@Before
	public void setup(){
		
		classUnderTest = new TrainsExpress();
		stations = classUnderTest.initialiseStationsAndRoutes();
	}

	
	@Test
	public void testAtoB(){
	    System.out.println("--- A to B");
		List<Route> result = classUnderTest.getFastestRroute(stations.get(0), stations.get(1));
		System.out.println("--- A to B");
		for (Route route : result) {
			System.out.println(route.getDestination().getStationName() + " " + route.getDuration());
		}
		
		assertEquals(3, TrainsExpress.calculateRouteDuration(result));
	}

	@Test
	public void testAtoC(){
	    System.out.println("--- A to C");
		List<Route> result = classUnderTest.getFastestRroute(stations.get(0), stations.get(2));
		System.out.println("--- A to C");
		for (Route route : result) {
			System.out.println(route.getDestination().getStationName() + " " + route.getDuration());
		}
		
		assertEquals(10, TrainsExpress.calculateRouteDuration(result));
	}

	@Test
	public void testAtoD(){
	    System.out.println("--- A to D");
		List<Route> result = classUnderTest.getFastestRroute(stations.get(0), stations.get(3));
		System.out.println("--- A to D");
		for (Route route : result) {
			System.out.println(route.getDestination().getStationName() + " " + route.getDuration());
		}
		
		assertEquals(6, TrainsExpress.calculateRouteDuration(result));
	}

	@Test
	public void testAtoE(){
	    System.out.println("--- A to E");
		List<Route> result = classUnderTest.getFastestRroute(stations.get(0), stations.get(4));
		System.out.println("--- A to E");
		for (Route route : result) {
			System.out.println(route.getDestination().getStationName() + " " + route.getDuration());
		}
		
		assertEquals(13, TrainsExpress.calculateRouteDuration(result));
	}

}
