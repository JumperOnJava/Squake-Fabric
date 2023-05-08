package org.zeith.comm12.squake;

import io.github.javajump3r.autocfg.Configurable;

public class ModConfig
{
	public static boolean isEnabled()
	{
		return COMMON.ENABLED;
	}

	public static void setEnabled(boolean enabled)
	{
		COMMON.ENABLED = enabled;
	}

	public static boolean sharkingEnabled()
	{
		return COMMON.SHARKING_ENABLED;
	}

	public static boolean trimpingEnabled()
	{
		return COMMON.TRIMPING_ENABLED;
	}

	public static boolean uncappedBunnyhopEnabled()
	{
		return COMMON.UNCAPPED_BUNNYHOP_ENABLED;
	}

	public static double accelerate()
	{
		return COMMON.ACCELERATE;
	}

	public static double airAccelerate()
	{
		return COMMON.AIR_ACCELERATE;
	}

	public static double sharkingSurfTension()
	{
		return 1.0D - COMMON.SHARKING_SURFACE_TENSION;
	}

	public static double trimpMult()
	{
		return COMMON.TRIMP_MULTIPLIER;
	}

	public static double sharkingWaterFriction()
	{
		return 1.0D - COMMON.SHARKING_WATER_FRICTION * 0.05D;
	}

	public static double maxAirAccelPerTick()
	{
		return COMMON.MAX_AIR_ACCEL_PER_TICK;
	}

	public static float softCap()
	{
		return (float) (COMMON.SOFT_CAP * 0.125F);
	}

	public static float hardCap()
	{
		return (float) (COMMON.HARD_CAP * 0.125F);
	}

	public static float softCapDegen()
	{
		return (float) COMMON.SOFT_CAP_DEGEN;
	}

	public static float increasedFallDistance()
	{
		return (float) COMMON.INCREASED_FALL_DISTANCE;
	}

	public static class Common
	{
		@Configurable(defaultValue = "true")
		public static boolean ENABLED = true;
		@Configurable(defaultValue = "true")
		public static boolean UNCAPPED_BUNNYHOP_ENABLED = true;
		@Configurable(defaultValue = "true")
		public static boolean SHARKING_ENABLED = true;
		@Configurable(defaultValue = "true")
		public static boolean TRIMPING_ENABLED = true;
		@Configurable(defaultValue = "14")
		public static double AIR_ACCELERATE = 14;
		@Configurable(defaultValue = "0.045")
		public static double MAX_AIR_ACCEL_PER_TICK = 0.045;
		@Configurable(defaultValue = "10")
		public static double ACCELERATE = 10;
		@Configurable(defaultValue = "2")
		public static double HARD_CAP = 2;
		@Configurable(defaultValue = "1.4")
		public static double SOFT_CAP = 1.4;
		@Configurable(defaultValue = "0.65")
		public static double SOFT_CAP_DEGEN = .65;
		@Configurable(defaultValue = "0.1")
		public static double SHARKING_WATER_FRICTION = .1;
		@Configurable(defaultValue = "0.2")
		public static double SHARKING_SURFACE_TENSION = .2;
		@Configurable(defaultValue = "1.4")
		public static double TRIMP_MULTIPLIER = 1.4;
		@Configurable(defaultValue = "0")
		public static double INCREASED_FALL_DISTANCE = 0;

		/*Common(ForgeConfigSpec.Builder builder)
		{
			builder.comment("Movement configurations")
					.push("movement");

			// boolean values

			ENABLED = builder
					.comment("turns off/on the quake-style movement for the client (essentially the saved value of the ingame toggle keybind)")
					.define("enabled", true);

			UNCAPPED_BUNNYHOP_ENABLED = builder
					.comment("if enabled, the soft and hard caps will not be applied at all")
					.define("uncappedBunnyhopEnabled", true);

			SHARKING_ENABLED = builder
					.comment("if enabled, holding jump while swimming at the surface of water allows you to glide")
					.define("sharkingEnabled", true);

			TRIMPING_ENABLED = builder
					.comment("if enabled, holding sneak while jumping will convert your horizontal speed into vertical speed")
					.define("trimpEnabled", true);

			// double values

			AIR_ACCELERATE = builder
					.comment("a higher value means you can turn more sharply in the air without losing speed")
					.defineInRange("airAccelerate", 14.0D, 0D, Double.MAX_VALUE);

			MAX_AIR_ACCEL_PER_TICK = builder
					.comment("a higher value means faster air acceleration")
					.defineInRange("maxAirAccelerationPerTick", 0.045D, 0D, Double.MAX_VALUE);

			ACCELERATE = builder
					.comment("a higher value means you accelerate faster on the ground")
					.defineInRange("groundAccelerate", 10D, 0D, Double.MAX_VALUE);

			HARD_CAP = builder
					.comment("see uncappedBunnyhopEnabled; if you ever jump while above the hard cap speed (moveSpeed*hardCapThreshold), your speed is set to the hard cap speed")
					.defineInRange("hardCapThreshold", 2D, 0D, Double.MAX_VALUE);

			SOFT_CAP = builder
					.comment("see uncappedBunnyhopEnabled and softCapDegen; soft cap speed = (moveSpeed*softCapThreshold)")
					.defineInRange("softCapThreshold", 1.4D, 0D, Double.MAX_VALUE);

			SOFT_CAP_DEGEN = builder
					.comment("the modifier used to calculate speed lost when jumping above the soft cap")
					.defineInRange("softCapDegen", 0.65D, 0D, Double.MAX_VALUE);

			SHARKING_WATER_FRICTION = builder
					.comment("amount of friction while sharking (between 0 and 1)")
					.defineInRange("sharkingWaterFriction", 0.1D, 0D, 1D);

			SHARKING_SURFACE_TENSION = builder
					.comment("amount of downward momentum you lose while entering water, a higher value means that you are able to shark after hitting the water from higher up")
					.defineInRange("sharkingSurfaceTension", 0.2D, 0D, Double.MAX_VALUE);

			TRIMP_MULTIPLIER = builder
					.comment("a lower value means less horizontal speed converted to vertical speed and vice versa")
					.defineInRange("trimpMultiplier", 1.4D, 0D, Double.MAX_VALUE);

			INCREASED_FALL_DISTANCE = builder
					.comment("increases the distance needed to fall in order to take fall damage; this is a server-side setting")
					.defineInRange("fallDistanceThresholdIncrease", 0D, 0D, Double.MAX_VALUE);

			builder.pop();
		}*/
	}

	public static final ModConfig.Common COMMON = new Common();


}