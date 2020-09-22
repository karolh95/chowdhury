package karolh95.chowdhury.model.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import karolh95.chowdhury.model.Model;
import karolh95.chowdhury.model.ModelFactory;
import karolh95.chowdhury.model.descriptor.VehicleDescriptor;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class NagelSchreckenbergModelFactory implements ModelFactory {

	private static final int DEFAULT_LANES_NUMBER = 2;
	private static final int DEFAULT_LANES_LENGTH = 20;

	private static final int DEFAULT_SLOW_VEHICLES_NUMBER = 5;
	private static final int DEFAULT_FAST_VEHICLES_NUMBER = 5;

	private final NagelSchreckenberg model;

	@Override
	public Model getModel() {

		return model;
	}

	@Override
	public int getDefaultLanesNumber() {

		return DEFAULT_LANES_NUMBER;
	}

	@Override
	public int getDefaultLanesLength() {

		return DEFAULT_LANES_LENGTH;
	}

	@Override
	public List<VehicleDescriptor> getDefaultVehiclesDescriptors() {

		VehicleDescriptor slowVehiclesDescriptor = new VehicleDescriptor(NagelSchreckenberg.SLOW_VEHICLE_MAX_VELOCITY,
				DEFAULT_SLOW_VEHICLES_NUMBER);

		VehicleDescriptor fastVehiclesDescriptor = new VehicleDescriptor(NagelSchreckenberg.FAST_VEHICLE_MAX_VELOCITY,
				DEFAULT_FAST_VEHICLES_NUMBER);

		return Arrays.asList(slowVehiclesDescriptor, fastVehiclesDescriptor);
	}
}
