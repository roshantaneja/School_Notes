# MDP Practice – Waterslide

You’ve decided to take a trip with your friends to the grid-world water park. Yay! The grid-world water park is not the most exciting thing in the world - there is a single waterslide that is composed of two ladder squares and two slide squares (marked with vertical bars and squiggly lines respectively). In this water park, you can move from any square to any neighboring square, unless the current square is a slide in which case it must move forward one square along the slide. The actions are denoted by arrows between squares on the map and all deterministically move the agent in the given direction. The agent cannot stand still: it must move on each time step. Rewards are also shown below: it’s super fun to go down the water slide (+2), kind of hard to climb the rungs of the ladder (-1), and neutral (+0) otherwise. The time horizon is infinite; this MDP goes on forever.

```
+--------+--------+--------+--------+--------+--------+
|        | Ladder | Ladder | Slide  | Slide  |        |
|      0<->-1   0<->-1     ->+2     ->+2     ->0      |
| [C]0   | [D]    | [E]    | [F]    | [G]    |    0   |
+----↕---+-----------------------------------+----↕---+
|    0   |                                   |    0   |
|        |                                   |        |
| [B]0   |                                   |    0   |
+----↕---+-----------------------------------+----↕---+
|    0   |        |        |        |        |    0   |
|      0<->0    0<->0    0<->0    0<->0    0<->0      |
| [A]    |        |        |        |        |        |
+--------+--------+--------+--------+--------+--------+

```

(a) How many (deterministic) policies 𝜋 are possible for this MDP? (think of how many actions
can be taken from each state and how many states there are).




(b) Fill in the blank cells of this table with values that are correct for the corresponding
function, discount, and state. Hint: You should not need to do substantial calculation here.
(Note: Vt(s) is the time-limited value of state s, if our MDP were to terminate after t
timesteps.)

|                   | $\gamma$ | $s = A$ | $s = E$ |
| ----------------- | -------- | ------- | ------- |
| $V_{3}(s)$        | 1.0      |         |         |
| $V_{10}(s)$       | 1.0      |         |         |
| $V_{10}(s)$       | 0.1      |         |         |
| $Q_{1}(s, west)$  | 1.0      |         |         |
| $Q_{10}(s, west)$ | 1.0      |         |         |
| $V^{*}(s)$        | 1.0      |         |         |
| $V^{*}(s)$        | 0.1      |         |         |


