
/* Draft of simple class for buffers for a project 


Iperatou1DakisBuffers.load;

Iperatou1DakisBuffers.at(\buffer1);
Iperatou1DakisBuffers.at(\buffer1, \buffer2);


*/

StilFant1DakisBusses {
	classvar <busses;
	*load {
		var s;
		
		busses = IdentityDictionary.new;

		s = Server.default;
		
		busses[\reverbBus] = Bus.new(\audio, 20, 2);
		busses[\grainBus] = Bus.new(\audio, 22, 2);

	}
	
	*at { | name |
		
		^busses.at(name.asSymbol);
	}
	
	*atN { | ... names |
		^names collect: { | name | busses.at(name.asSymbol); };
	}
	
	
}