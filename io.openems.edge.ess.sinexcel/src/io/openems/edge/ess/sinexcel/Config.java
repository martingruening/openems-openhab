package io.openems.edge.ess.sinexcel;

import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import org.osgi.service.metatype.annotations.AttributeDefinition;

@ObjectClassDefinition( //
		name = "ESS Sinexcel", //
		description = "Implements the Sinexcel battery inverter.")
@interface Config {

	@AttributeDefinition(name = "Component-ID", description = "Unique ID of this Component")
	String id() default "ess0";

	@AttributeDefinition(name = "Alias", description = "Human-readable name of this Component; defaults to Component-ID")
	String alias() default "";

	@AttributeDefinition(name = "Is enabled?", description = "Is this Component enabled?")
	boolean enabled() default true;

	@AttributeDefinition(name = "Modbus-ID", description = "ID of Modbus bridge.")
	String modbus_id();

	@AttributeDefinition(name = "Modbus target filter", description = "This is auto-generated by 'Modbus-ID'.")
	String Modbus_target() default "";

	@AttributeDefinition(name = "Battery-ID", description = "ID of Battery.")
	String battery_id();

	@AttributeDefinition(name = "Battery target filter", description = "This is auto-generated by 'Battery-ID'.")
	String Battery_target() default "";
	
	@AttributeDefinition(name = "Topping charge", description = "The topping charge voltage is the voltage that the battery supposed to finally reach in the charging procedure")
    int toppingCharge() default 4370;
	
 	@AttributeDefinition(name = "Start and stop", description = "Turn ON and turn OFF the Inverter")
	InverterState InverterState() default InverterState.ON;
 	
 	@AttributeDefinition(name = "Ems timeout", description = "Setting the ems timeout, 0 = disabled")
	int Ems_timeout() default 60;
 	
 	@AttributeDefinition(name = "Bms timeout", description = "Setting the Bms timeout, Enable ONLY when remote BMS-inverter connection is needed. 0 = disabled")
	int Bms_timeout() default 0;

	String webconsole_configurationFactory_nameHint() default "ESS Sinexcel [{id}]";
}