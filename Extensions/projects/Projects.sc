
/* Draft of simple class for buffers for a project 


Iperatou1DakisBuffers.load;

Iperatou1DakisBuffers.at(\buffer1);
Iperatou1DakisBuffers.at(\buffer1, \buffer2);


*/

Projects {
	classvar <iperatouProjects, <stilFantProjects;
	*load {
		
		iperatouProjects = IdentityDictionary.new;
		stilFantProjects = IdentityDictionary.new;
		
		iperatouProjects[\1] = [["date: 101112"], ["type: livePerformance"], ["place: newFortress"]];
		stilFantProjects[\1] = [];

	}
	
	*atIperatou { | name |
		
		^iperatouProjects.at(name.asSymbol);

	}
	
	*atStilFant { | name |
		
		^stilFantProjects.at(name.asSymbol);

	}
	
	*atNIperatou { | ... names |
		
		^names collect: { | name | iperatouProjects.at(name.asSymbol); };

	}
	
	*atNStilFant { | ... names |
		
		^names collect: { | name | stilFantProjects.at(name.asSymbol); };

	}
	
	
}