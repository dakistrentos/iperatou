
/* Draft of simple class for buffers for a project 


Iperatou1DakisBuffers.load;

Iperatou1DakisBuffers.at(\buffer1);
Iperatou1DakisBuffers.at(\buffer1, \buffer2);


*/

Iperatou1DakisPatterns {
	classvar <patterns;
	*load {
		var s;

		patterns = IdentityDictionary.new;

		s = Server.default;
		
		patterns[\1] = Pdef(\miden, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7), ], inf), 
			\amp, Pseq([Pseq([0.5], 1), Pseq([0.5], 1), Pseq([0.5], 2), Pseq([0.0], 5)] * 0.5, inf),
			\freq, Pseq([110, 82.41, 130.82, 110, 130.82, 220, 146.83, 110, 146.83], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 0,
			\sin2, 0,
			\attime, 0.15,
			\rlstime, Pseq([Pseq([0.25], 5), Pseq([4], 1), Pseq([0.25], 3)], inf),
			\out, 0
			)
		);
		
		patterns[\2] = Pdef(\miden2, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)], inf), 
			\amp, Pseq([Pseq([0.5], 1), Pseq([0.5], 1), Pseq([0.5], 4), Pseq([0.0], 3)] * 0.5, inf),
			\freq, Pseq([110, 82.41, 130.82, 110, 130.82, 220, 146.83, 110, 146.83], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 0,
			\sin2, 0,
			\attime, 0.15,
			\rlstime, Pseq([Pseq([0.25], 5), Pseq([4], 1), Pseq([0.25], 3)], inf),
			\out, 0
			)
		);

		patterns[\3] = Pdef(\miden3, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)], inf), 
			\amp, Pseq([Pseq([0.45], 1), Pseq([0.45], 1), Pseq([0.45], 4), Pseq([0.0], 3)] * 0.75, inf),
			\freq, Pseq([110, 82.41,  130.82, 110, 130.82, 220, 146.83, 110, 146.83], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 0,
			\sin2, 0,
			\attime, 0.15,
			\rlstime, Pseq([Pseq([0.35], 5), Pseq([4], 1), Pseq([0.35], 3)], inf),
			\out, 0
			)
		);
		
		patterns[\4] = Pdef(\tria, Pbind(
			\instrument, \task1,
			\dur, Pseq([1], inf), 
			\amp, Pseq([0.25] * 0.25 , inf),
			\freq, Pseq([~a2], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 0,
			\sin2, 0,
			\attime, 0.15,
			\rlstime, Pseq([1], inf),
			\out, 0
			)
		);
		
		patterns[\5] = Pdef(\triaa1, Pbind(
			\instrument, \task1,
			\dur, Pseq([1], inf), 
			\amp, Pseq([0.25] * 0.25 , inf),
			\freq, Pseq([~a2], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 1,
			\sin2, Pseq([1, 2, 3, 4, 5, 6, 7, 8], inf),
			\attime, 0.15,
			\rlstime, Pseq([1], inf),
			\out, 0
			)
		);
	
		patterns[\6] = Pdef(\triaa2, Pbind(
			\instrument, \task1,
			\dur, Pseq([1], inf), 
			\amp, Pseq([0.25] * 0.25 , inf),
			\freq, Pseq([~a2], inf),
			\brown, Pseq([1],inf),
			\saw, 1,
			\sin1, 1,
			\sin2, Pseq([1, 2, 3, 4, 5, 6, 7, 8], inf),
			\attime, 0.15,
			\rlstime, Pseq([1], inf),
			\out, 0
			)
		);
		
		patterns[\7] = Pdef(\triaa3, Pbind(
			\instrument, \task1,
			\dur, Pseq([1], inf), 
			\amp, Pseq([0.25] * 0.25 , inf),
			\freq, Pseq([~a2], inf),
			\brown, Pseq([1],inf),
			\saw, 2,
			\sin1, 1,
			\sin2, Pseq([1, 2, 3, 4, 5, 6, 7, 8], inf),
			\attime, 0.15,
			\rlstime, Pseq([1], inf),
			\out, 0
			)
		);
	
		patterns[\8] = Pdef(\tria2, Pbind(
			\instrument, \task1,
			\dur, Pseq([1], inf), 
			\amp, Pseq([0.25] * 0.5 , inf),
			\freq, Pseq([110], inf),
			\brown, Pseq([1],inf),
			\saw, 3,
			\sin1, 4,
			\sin2, Pseq([1, 2, 3, 4, 5, 6, 7, 8], inf),
			\rlstime, Pseq([0.25], inf),
			\out, 0
			)
		);
		
		patterns[\9] = Pdef(\tria3, Pbind(
			\instrument, \task1,
			\dur, Pseq([1], inf), 
			\amp, Pseq([0.25] * 0.75 , inf),
			\freq, Pseq([110], inf),
			\brown, Pseq([1],inf),
			\saw, 3,
			\sin1, 6,
			\sin2, Pseq([1, 2, 3, 4, 5, 6, 7, 8], inf),
			\attime, 0.15,
			\rlstime, Pseq([0.25], inf),
			\out, 0
			)
		);
		
		//tria4Controller
		patterns[\10] = PatternController(
			(
				amp: PatternProxy(0.25), 
				dur: PatternProxy(1),
				freq: PatternProxy(82),
				brown: PatternProxy(1),
				saw: PatternProxy(Pwhite(1, 1)),
				sin1: PatternProxy(Pwhite(1, 1)),
				sin2: PatternProxy(Pwhite(1, 1)),
				attime: PatternProxy(0.15),
				rlstime: PatternProxy(0.25),
				pan: PatternProxy(0),
				out: PatternProxy(0)
			),
			{
				Pbind(
					\instrument, \task1,
					\amp, ~amp,
					\dur, ~dur,
					\freq, ~freq,
					\brown, ~brown,
					\saw, ~saw,
					\sin1, ~sin1,
					\sin2, ~sin2,
					\attime, ~attime,
					\rlstime, ~rlstime,
					\pan, ~pan,
					\out, ~out
					).play;
			}
		);
		
		patterns[\11] = Pdef(\ena, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)]/4, inf), 
			\amp, Pseq([Pseq([0.5], 1), Pseq([0.5], 1), Pseq([0.0], 4), Pseq([0.5], 3)] * 1.5 , inf),
			\freq, Pseq([110, 82.41,  130.82, 110, 130.82, 220, 146.83, 110, 146.83], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 2,
			\sin2, 3,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([0.25], 5), Pseq([0.5], 1), Pseq([0.25], 3)], inf),
			\out, 0
			)
		);
	
		patterns[\12] = Pdef(\ena1, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7), Pseq([0.25], 1), Pseq([0.25], 1),  Pseq([0.5], 7)]/4, inf), 
			\amp, Pseq([Pseq([0.5], 1), Pseq([0.2], 1), Pseq([0.0], 2),Pseq([0.2], 1), Pseq([0.3], 1), Pseq([0.25], 1),  Pseq([0.0], 1),  Pseq([0.25], 1)] * 1.5 , inf),
			\freq, Pseq([~a2, 82.41,  130.82, 110, 130.82, 220, 146.83, ~e2, 146.83], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 2,
			\sin2, 3,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([0.45], 5), Pseq([0.25], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([0.25], 1), Pseq([0.25], 1),Pseq([0.35], 1),Pseq([0.25], 1),  Pseq([0.25], 5), Pseq([0.3], 1), Pseq([0.25], 1),Pseq([0.25], 1),Pseq([0.35], 1), Pseq([0.25], 5), Pseq([0.3], 1), Pseq([0.35], 1),Pseq([0.45], 1),Pseq([0.35], 1)], inf),
			\out, 0
			)
		);
	
		patterns[\13] = Pdef(\ena2, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)]/4, inf), 
			\amp, Pseq([Pseq([0.5], 1), Pseq([0.2], 1), Pseq([0.0], 2),Pseq([0.2], 1), Pseq([0.3], 1), Pseq([0.25], 3)] * 1.5 , inf),
			\freq, Pseq([110, 82.41,  130.82, 110, 130.82, 220, 146.83, 110, 146.83, 110, 82.41,  130.82, 110, 130.82, 220, 146.83, 110, 146.83, 110, 82.41,  130.82, 110, 130.82, 220, 146.83, 110, 146.83, 110, 82.41,  130.82, 110, 130.82, ~e3, 146.83, ~a4, 146.83], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 2,
			\sin2, 3,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([0.25], 5), Pseq([1], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([1], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([1], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([1], 1), Pseq([0.25], 1), Pseq([0.5], 1), Pseq([0.25], 1), Pseq([0.25], 5), Pseq([1], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([1], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([1], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([1], 1), Pseq([0.25], 1), Pseq([0.5], 1), Pseq([0.5], 1) ], inf),
			\out, 0
			)
		);
	
	
		patterns[\14] = Pdef(\ena3, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)]/4, inf), 
			\amp, Pseq([Pseq([0.5], 1), Pseq([0.5], 1), Pseq([0.5], 4), Pseq([0.5], 3)] * 2 , inf),
			\freq, Pseq([110, 82.41,  130.82, 110, 130.82, 220, 146.83, 110, 146.83], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 2,
			\sin2, 3,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([0.25], 5), Pseq([1.5], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([1.5], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([1.5], 1), Pseq([0.25], 3), Pseq([0.75], 5), Pseq([1.5], 1), Pseq([0.25], 3)], inf),
			\out, 0
			)
		);
		
		
		patterns[\15] = Pdef(\ena4, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)]/4, inf), 
			\amp, Pseq([Pseq([0.5], 1), Pseq([0.5], 4), Pseq([0.5], 1), Pseq([0.5], 1), Pseq([0.5], 2)] * 3 , inf),
			\freq, Pseq([110, 82.41,  130.82, 110, 130.82, 110, 146.83, 110, 55], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 2,
			\sin2, 3,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([0.25], 5), Pseq([1.5], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([1.5], 1), Pseq([0.25], 3), Pseq([0.25], 5), Pseq([1.5], 1), Pseq([0.25], 3), Pseq([0.75], 1), Pseq([0.75], 1), Pseq([0.0], 1), Pseq([1.0], 1), Pseq([0.25], 1), Pseq([1.5], 1), Pseq([0.25], 1),Pseq([0.25], 1), Pseq([1.25], 1)], inf),
			\out, 0
			)
		); 
		
		patterns[\16] = Pdef(\ena5, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7),
				Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)]/4, inf), 
			\amp, Pseq([Pseq([0.75], 1), Pseq([0.5], 4), Pseq([0.5], 1), Pseq([0.5], 1), Pseq([0.5], 2)] * 3 , inf),
			\freq, Pseq([55, 82.41,  130.82, 110, 130.82, 220, 146.83, 110, 55, 
				55, 82.41,  130.82, 110, 130.82, 220, 146.83, 110, 55], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 2,
			\sin2, 3,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([5], 1), Pseq([0.25], 4), Pseq([1.3], 1), Pseq([0.25], 2), Pseq([2], 1),
				Pseq([2], 1), Pseq([0.25], 4), Pseq([0.25], 1), Pseq([0.25], 2), Pseq([2], 1)], inf),
			\out, 0
			)
		);
		
		patterns[\17] = Pdef(\ena6, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7),
				Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)]/4, inf), 
			\amp, Pseq([Pseq([1], 1), Pseq([0.5], 4), Pseq([0.5], 1), Pseq([0.5], 1), Pseq([0.5], 2)], inf),
			\freq, Pseq([55, 82.41,  130.82, 110, 130.82, 220, 146.83, 110, 55, 
				55, 82.41,  130.82, 110, 130.82, 220, 146.83, 110, 55], inf),
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 2,
			\sin2, 3,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([5], 1), Pseq([0.25], 4), Pseq([1.3], 1), Pseq([0.25], 2), Pseq([2], 1),
				Pseq([2], 1), Pseq([0.25], 4), Pseq([0.25], 1), Pseq([0.25], 2), Pseq([2], 1)], inf),
			\out, 20
			)
		);
		
		//ena17Controller
		patterns[\18] = PatternController(
			(
				amp: PatternProxy(Pseq([Pseq([1.8], 1), Pseq([0.25], 4), Pseq([0.25], 1), Pseq([0.25], 2)], inf)), 
				dur: PatternProxy(0.25/2),
				freq: PatternProxy(Pseq([110, 55, 220, ~a4, ~g3, ~c4, 110, 55, 220, ~a4, ~g3, ~c4, 110, 55, 220, ~a4, ~g3, ~c4, 110, 55, 220, ~aS4, ~g3, ~c4].scramble, inf)),
				brown: PatternProxy(Pseq([0],inf)),
				saw: PatternProxy(0),
				sin1: PatternProxy(0),
				sin2: PatternProxy(0),
				attime: PatternProxy(Pseq([Pseq([0.02], 1), Pseq([0.25], 3), Pseq([1], 1), Pseq([1], 1), Pseq([1], 2),
						Pseq([1.5], 1), Pseq([0.2], 4), Pseq([0.2], 1), Pseq([1], 1), Pseq([1.2], 1)]*0.8, inf)),
				rlstime: PatternProxy( Pseq([Pseq([1], 1), Pseq([0.25], 4), Pseq([0.2], 1), Pseq([0.25], 2),
						Pseq([0.7], 1), Pseq([0.25], 4), Pseq([0.25], 1), Pseq([0.25], 2)]*0.8, inf)),
				pan: PatternProxy(0),
				out: PatternProxy(Pseq([20, 0, 0, 0, 20, 0, 20, 0, 0, 20, 20, 0, 20, 0, 20, 0], inf))
			),
			{
				Pbind(
					\instrument, \task1,
					\amp, ~amp,
					\dur, ~dur,
					\freq, ~freq,
					\brown, ~brown,
					\saw, ~saw,
					\sin1, ~sin1,
					\sin2, ~sin2,
					\attime, ~attime,
					\rlstime, ~rlstime,
					\pan, ~pan,
					\out, ~out
					).play;
			}
		);

		//ena18Controller
		patterns[\19] = PatternController(
			(
				amp: PatternProxy(Pseq([Pseq([0.75], 1), Pseq([0.25], 4), Pseq([0.25], 1), Pseq([0.25], 2)], inf)), 
				dur: PatternProxy(0.25/2),
				freq: PatternProxy(Pseq([55, 82.41, 110, ~a2, 220, 146.83, 110, 55, 
						55, 130.82, 110, 130.82, 220, ~b3, ~a4, ~dS4], inf)),
				brown: PatternProxy(Pseq([1],inf)),
				saw: PatternProxy(0),
				sin1: PatternProxy(0),
				sin2: PatternProxy(0),
				attime: PatternProxy(Pseq([Pseq([5.5], 1), Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.25], 1), Pseq([3], 1), Pseq([0.25], 1), Pseq([1], 2),
						Pseq([0.5], 1), Pseq([0.2], 4), Pseq([0.2], 1), Pseq([1], 1), Pseq([1], 1)]*0.8, inf)),
				rlstime: PatternProxy(Pseq([Pseq([0.2], 1), Pseq([0.25], 4), Pseq([0.2], 1), Pseq([0.25], 2),
						Pseq([0.7], 1), Pseq([0.25], 4), Pseq([0.25], 1), Pseq([0.25], 2)]*0.8, inf)),
				pan: PatternProxy(0),
				out: PatternProxy(Pseq([20, 0, 0, 20, 20, 0, 0, 0, 20, 20, 20, 0, 20, 0, 20, 0], inf))
			),
			{
				Pbind(
					\instrument, \task1,
					\amp, ~amp,
					\dur, ~dur,
					\freq, ~freq,
					\brown, ~brown,
					\saw, ~saw,
					\sin1, ~sin1,
					\sin2, ~sin2,
					\attime, ~attime,
					\rlstime, ~rlstime,
					\pan, ~pan,
					\out, ~out
					).play;
			}
		);
		
		//pente1Controller
		patterns[\20] = PatternController(
			(
				amp: PatternProxy(Pseq([0.3], inf)), 
				vol: PatternProxy(1),
				dur: PatternProxy(0.25),
				freq: PatternProxy(Pseq([77, 67, 57, 47, 90, 40].scramble*1.2, inf)),
				freq1: PatternProxy(Pseq([1, 1, 1, 1], inf)),
				freq2: PatternProxy(Pseq([8, 7, 6, 5, 4, 3, 2, 1], inf)),
				rqq: PatternProxy(0.1),
				att: PatternProxy(0.02),
				rls: PatternProxy(0.2),
				out: PatternProxy(0)
			),
			{
				Pbind(
					\instrument, \moogbot2,
					\amp, ~amp,
					\dur, ~dur,
					\freq, ~freq,
					\freq1, ~freq1,
					\freq2, ~freq2,
					\rqq, ~rqq,
					\att, ~att,
					\rls, ~rls,
					\out, ~out
					).play;
			}
		);
		
		patterns[\21] = Pdef(\dio, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)], inf),  
			\amp, Pseq([Pseq([0.0], 1), Pseq([0.0], 4), Pseq([0.1], 1), Pseq([0.0], 3)] * 1.5 , inf),
			\freq, Pseq([~e4, ~d4, ~c4, ~b4, ~a4], inf), 
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 0,
			\sin2, 0,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([0.25], 5), Pseq([0.2], 1), Pseq([0.25], 3)], inf),
			\out, 0
			)
		); 
		
		patterns[\22] = Pdef(\dio2, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)]/2, inf),  
			\amp, Pseq([Pseq([0.0], 1), Pseq([0.0], 4), Pseq([0.1], 1), Pseq([0.0], 3)] * 2 , inf),
			\freq, Pseq([~e4, ~d4, ~c4, ~b4, ~a4], inf), 
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 0,
			\sin2, 0,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([0.25], 5), Pseq([1], 1), Pseq([0.25], 3)], inf),
			\out, 0
			)
		);
		
		patterns[\23] = Pdef(\dio3, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)]/4, inf),  
			\amp, Pseq([Pseq([0.0], 1), Pseq([0.0], 4), Pseq([0.1], 1), Pseq([0.0], 3)] * 2.5 , inf),
			\freq, Pseq([~e4, ~d4, ~c4, ~b4, ~a4], inf), 
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 0,
			\sin2, 0,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([0.25], 5), Pseq([2], 1), Pseq([0.25], 3)], inf),
				\out, 20
			)
		);
		
		patterns[\24] = Pdef(\dio4, Pbind(
			\instrument, \task1,
			\dur, Pseq([Pseq([0.25], 1), Pseq([0.25], 1), Pseq([0.5], 7)] / 8, inf),  
			\amp, Pseq([Pseq([0.0], 1), Pseq([0.0], 4), Pseq([0.1], 1), Pseq([0.0], 3)] * 4 , inf),
			\freq, Pseq([~e4, ~d4, ~c4, ~b4, ~a4], inf),  
			\brown, Pseq([1],inf),
			\saw, 0,
			\sin1, 0,
			\sin2, 0,
			\attime, 0.2,
			\rlstime, Pseq([Pseq([0.25], 5), Pseq([2], 1), Pseq([0.25], 3)], inf),
			\out, 20
			)
		);
		
	}
	
	*at { | name |
		
		^patterns.at(name.asSymbol);
	}
	
	*atN { | ... names |
		^names collect: { | name | patterns.at(name.asSymbol); };
	}
	
	
}