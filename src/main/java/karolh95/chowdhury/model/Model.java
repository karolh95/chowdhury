package karolh95.chowdhury.model;

import java.util.List;
import karolh95.chowdhury.model.designer.VehiclesDesigner;
import karolh95.chowdhury.model.designer.VehiclesPositionDesigner;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Model {

	protected final VehicleDescriptorValidator validator;
	protected final VehiclesDesigner vehiclesDesigner;
	protected final VehiclesPositionDesigner positionDesigner;
	protected final Road road;

	protected List<Vehicle> vehicles;

	public abstract void update();

	public abstract void reset();

	public void create() {

		road.createRoad();
		vehicles = vehiclesDesigner.createVehicles();
		positionDesigner.placeVehicles(vehicles);
	}
}
