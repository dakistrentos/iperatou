/* takes an array or a pattern, 
	and plays it sequentially once, inserting the following elements: 
	
	\start before the beginning of the pattern
	\end at the end of the pattern
	\beat n before each other event in the pattern. 

For use inside Psend


p = PbeatList(Pseq([1, 5, 7], 2)).asStream;

p.nextN(10);
*/


PbeatList : Pattern {
	var <>pattern, <>name;
	*new { | pattern, name |
		^super.newCopyArgs(pattern, name);
	}
	embedInStream { arg inval;
		var stream, outval, beats = 0;
		stream = pattern.asStream;
		loop {
			outval = stream.next(inval);
			if (outval.isNil) { ^inval };
			inval = [beats = beats + 1, outval].yield;
		}
	}

}