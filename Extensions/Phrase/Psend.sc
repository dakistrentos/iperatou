/*

p = Posc(\msg, Pseq([['alpha', 100], [['beta', 200], [\gamma, 300]]], inf)).play;


p = Psend(Pseq([['alpha', 100], [['beta', 200], [\gamma, 300]]], inf)).play;

*/
Psend : Posc {	
	*new { | beatList ... pairs |
		^super.new(*(pairs addAll: [\msg, this.processBeatList(beatList)]));
	}
	
	*processBeatList { | beatList |
		^beatList;
	}
}

