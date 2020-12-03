package io.openems.edge.goodwe.charger;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import io.openems.edge.goodwe.GoodWeConstants;

@ObjectClassDefinition(//
		name = "GoodWe ET Charger PV1", //
		description = "Goodwe ET PV-Charger 1")

public @interface ConfigPV1 {
	@AttributeDefinition(name = "Component-ID", description = "Unique ID of this Component")
	String id() default "charger0";

	@AttributeDefinition(name = "Alias", description = "Human-readable name of this Component; defaults to Component-ID")
	String alias() default "";

	@AttributeDefinition(name = "Is enabled?", description = "Is this Component enabled?")
	boolean enabled() default true;

	@AttributeDefinition(name = "GoodWe ESS or Battery-Inverter", description = "ID of GoodWe Energy Storage System or Battery-Inverter.")
	String essOrBatteryInverter_id() default "batteryInverter0";

	@AttributeDefinition(name = "GoodWe ESS or Battery-Inverter target filter", description = "This is auto-generated by 'GoodWe ESS or Battery-Inverter'.")
	String essOrBatteryInverter_target() default "";

	@AttributeDefinition(name = "Modbus Unit-id", description = "Unit-id")
	int unit_id() default GoodWeConstants.DEFAULT_UNIT_ID;

	@AttributeDefinition(name = "Modbus-ID", description = "ID of Modbus bridge.")
	String modbus_id() default "modbus0";

	@AttributeDefinition(name = "Modbus target filter", description = "This is auto-generated by 'Modbus-ID'.")
	String Modbus_target() default "";

	String webconsole_configurationFactory_nameHint() default "GoodWe ET Charger PV1 [{id}]";
}