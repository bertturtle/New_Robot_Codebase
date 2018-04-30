package org.usfirst.frc.team5940.pantry.wpilib;

public class EncoderConversion {

	double conversionFactor;

	public EncoderConversion(double encoderPulsesPerRotation, double outputShaftRadius) {
		if (encoderPulsesPerRotation == 0) {
			conversionFactor = 0;
		} else {
			this.conversionFactor = (1 / encoderPulsesPerRotation) * Math.PI * Math.pow(outputShaftRadius, 2);
		}
	}

	public double convert(double encoderPulses) {
		return encoderPulses * this.conversionFactor;
	}
}
