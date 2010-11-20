// Example starting in middle of phrase]

(
SynthDef( \aut05, { | amp = 1, sustain = 1.1, freq = 60, freqlp, 
	sin1 = 0, sin2 = 0.1, brown = 0.1, saw = 400, 
	attime = 0.01, rlstime = 0.5 |
	var in, osc, env, ses;
	env =  EnvGen.ar(Env.perc(attime, rlstime), doneAction: 2, levelScale: 0.8, timeScale: sustain);
	in = SinOsc.ar(FSinOsc.ar(freq, 0, brown), 0.4);
	ses = SinOsc.ar(0, in, 0.01) ;
	ses = RLPF.ar(ses, freqlp, 1.4, 1.6, 0.4 );
	ses = ses.sin/4 + SinOsc.ar(freqlp, Decay.ar(SinOsc.ar(sin1, sin2), 4.2.abs, Saw.ar(saw)));
	ses = Limiter.ar(ses, 0.9, 0.01);
	ses = DelayN.ar( ses, 4.5, 0.01, 1.5, 0.0, 2.1, ses);
	
	Out.ar(0, ses   *amp *env !2);
}).memStore;


PatternController.put(\clock, TempoClock.new);


~aut01 = PatternController(
	// here the parameters of the pbind that you want to use initially!
	(
		amplitude: PatternProxy( Pseq([
							1, 
							Prand([1, 0.25, 0.25, 0.0, 1, 0.7, 0.5, 0.4, 0.6, 0.2, 0.5, 1, 0.2, 0, 0.5, 0, 0.2, 0, 0.1] , 1)
						]/6 , inf) ),
		dur: PatternProxy( Pseq( [1, 1/4, 1/4, 1/2, 1/4, 1/4, 1, 1/2, 1/2, 1, 1/4, 1/4, 1/2, 1, 1/4, 1/4, 1/2, 1, 1/2, 1]/4 , inf) ),
		freqlp: PatternProxy( Pseq([
							Pseq( [ #[49, 29], 20], 1), 
							Pbrown(130, 135, 1, 1),
							Pbrown(99, 101, 0.1, 1),
							Prand(#[[98, 196], [99, 199], [49, 16]], 1),
							Pbrown(100, 110, 1, 1),
							Pseq( [ #[49, 29], 20], 1),
							Pbrown(49, 44, 2, 1),
							Pbrown(42, 40, 1, 1),
							Prand(#[[98, 196], [65, 82], [49, 29]], 1),
							Pbrown(50, 30, 7, 1),
							Pbrown(100, 130, 10, 1),
							Prand(#[[98, 196], [82, 98], [49, 65]], 1) 
						], inf) ),
		brown: PatternProxy( Pseq([
							Pbrown(4, 10, 0.2, inf),
							Pbrown(130, 135, 10, 0.1),
							16,
							49,
							4,
							41,
							261,
							Pbrown(400, 100, 0.2, inf),
							1,
							Pbrown(49, 42, 3, 1),
							Pbrown(120, 130, 0.2, 1),
							Pbrown(65, 65, 0.2, 1)
						],inf) ),
		saw: PatternProxy( Pseq([
							Pbrown(4, 10, 0.2, inf),
							Pbrown(130, 135, 10, 0.1),
							16,
							49,
							4,
							41,
							261,
							Pbrown(400, 100, 0.2, inf),
							1,
							Pbrown(49, 42, 3, 1),
							Pbrown(120, 130, 0.2, 1),
							Pbrown(65, 65, 0.2, 1)
						],inf) ),
							
		sawSpec: ControlSpec( 4, 800, \lin, 1 ),
		brownSpec: ControlSpec( 4, 400, \lin, 1 ),
		sin1: PatternProxy ( 0 ),
		sin1Spec: ControlSpec( 0, 100, \lin, 1 ),
		sin2: PatternProxy ( 0 ),
		sin2Spec: ControlSpec( 0, 100, \lin, 1 )
	),
	
	// Here the pattern that uses the above parameters
	{
		Pbind(
			\instrument, \aut05,
			\dur, ~dur,
			\amp, ~amplitude,
			\freqlp, ~freqlp,
			\brown, ~brown,
			\saw, ~saw,
			\sin1, ~sin1,
			\sin2, ~sin2			
		).play(~clock ?? { TempoClock.new }, quant: [1, 0, 0]);
	},

	// here the controllers: 
	[13, 31, \toggle],
	
	[13, 95, { ~amp.source = Pseq([
							1, 
							Prand([1, 0.25, 0.25, 0.8, 1, 0.7, 0.5, 0.4, 0.6, 0.2, 0.5, 1, 0.2, 0.5, 0.5, 0, 0.2, 0, 0.1] , 1)
						] , inf)  
			},
			{ 
			~freqlp.source = Pseq([
					Pseq(#[[40, 329], 91, 63, 95, 67, 93], 1),
					Pshuf(#[[72, 196], 75, 79, 87, 89,], 3),
					Prand(#[[48, 43, 55, 58],[482, 53, 55, 58]], 2)
					], inf ) 
			},
			{ ~dur.source = Pseq( [1, 1/2, 1/2, 1, 1/2, 1/2, 1, 1/4, 1/4, 1/2, 1/4, 1/4, 1, 1/4, 1/4, 1/2, 1, 1/2, 1]/8 , inf) }, 
			{ ~brown.source = Pbrown(4, 18, 2, inf) }
	],
	
	[14, 31, { ~amplitude.source = Pseq([
							1, 
							Prand([1, 0.25, 0.25, 0.0, 1, 0.7, 0.5, 0.4, 0.6, 0.2, 0.5, 1, 0.2, 0, 0.5, 0, 0.2, 0, 0.1] , 1),
							0.8
						] , inf)  },
			{ ~dur.source = Pseq( [1, 1/4, 1/4, 1/2, 1/2, 1, 1/2, 1/2, 1, 1/4, 1/4, 1/2, 1, 1/4, 1/4, 1/2, 1, 1/2, 1]/4 , inf)  },
			{ ~freqlp.source = Pseq([
					Pseq(#[[40, 400], 91, 63, 95, 67, 293], 4)/4,
					Pseq(#[[72, 196], 75, 79, 87, 89,], 6),
					Prand(#[[48, 43, 55, 58],[482, 53, 55, 58]], 12)
					], inf ) 
			}
	],
	[15, 31, { | value, pattern |
		~brown.source = ~brownSpec.map(value / 127)
	}],
	[15, 30, { | value, pattern |
		~sin1.source = ~sin1Spec.map(value / 127)
	}],
	[15, 29, { | value, pattern |
		~sin2.source = ~sin2Spec.map(value / 127)
	}],
	[15, 28, { | value, pattern |
		~saw.source = ~sawSpec.map(value / 127)
	}]	
).addSyncActions([
	\l_start_A, \start,
	\l_end_AAABB, \stop,
//	\beats, { | ... args | "BEATS".postln; args.postln }
]);
)

Stasis.start(local: true);



/// ------
(
q = PatternController(
	// here the parameters of the pbind that you want to use initially!
	(
		amplitude: PatternProxy(
			Pseq([ 
				Pseq([0.6, 0.0, 0.0, 0.7,		0.06, Pseq([0.03, 0.3, 0.08, 0.1], 1), 0.0, Pseq([0.4, 0.5],1)], 1), 
				Pseq([0.6, 0.0, 0.0, 0.0], 1), 
				Pseq([0.6, 0.0, 0.0, 0.0], 1), 
				Pseq([0.6, 0.0, 0.0, 0.6], 1) 
			], inf)	
		),
		legato: PatternProxy(0.4),
		duration: PatternProxy(1.0),
		volume: PatternProxy(0.0),
		volumeSpec: ControlSpec(0, 1, \cos),
		freq1: PatternProxy(10),
		freq2: PatternProxy(65)
	),
	
	// Here the pattern that uses the above parameters
	{
		Pbind(
			\instrument, \baxx,
			\dur, ~duration,
			\amp, ~amplitude,
			\vol, ~volume,
			\freq1, ~freq1,
			\freq2, ~freq2,
			\legato, ~legato
		).play(~clock ?? { TempoClock.new }, quant: [4, 0, 0]);
	},

	// here the controllers: 
	[13, 15, \toggle],
	[13, 79, { ~amplitude.source = Pseq([1, 0, 0, 0, 0.8, 0, 0, 0], inf) }, 
			{ ~duration.source = 0.5 },  
			{ ~freq2.source = Pseq([280, 30, 180, 220], inf) }
	],
	[14, 15, { ~amplitude.source = Pseq([1, Pseq([0.1, 0.2, 0.3]), 0.0, 0.3, 0.0, 0.5, 0, 0], inf) },  
			{ ~legato.source = Plprand(0.4, 2, inf) }
	],
	[15, 15, { | value, pattern |
		~volume.source = ~volumeSpec.map(value / 127)
	}]	
).addSyncActions([
	\l_start_A, \start,
	\l_end_AAABB, \stop
]);
)

q.start;
q.stop;

t = { c = TempoClock(2); };
a = SyncSender(clockFunc: t);
a.pattern = Pfib(Fib.ascending(10), "AB").asPbind(a);
a.start;

Stasis.start(local: true);


SyncAction(\l_start_A, { "test".postln; });