

StilFant1DakisSetup {
	
	classvar <olokliro;
	
	*load {
		StilFant1DakisSynthDefs.load;
		StilFant1DakisBuffers.load;
		StilFant1DakisBusses.load;
		StilFant1DakisPatterns.load;	
	
	}
	
	*makeOlokliro {
		olokliro = StilFant1DakisOlokliro.make;	
	}
	
	*start {
		
	}
	
	*stop {
		
	}
	
}