

Iperatou1DakisSetup {
	
	classvar <olokliro;
	
	*load {
		Iperatou1DakisSynthDefs.load;
		Iperatou1DakisBuffers.load;
		Iperatou1DakisBusses.load;
		Iperatou1DakisPatterns.load;	
	
	}
	
	*makeOlokliro {
		olokliro = IperatouDakisOlokliro.make;	
	}
	
	*start {
		
	}
	
	*stop {
		
	}
	
}