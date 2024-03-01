---
tags:
  - MachineLearning
  - notes
---


### Markov Decision Process - Stochastic Search, Random element of search

Indiana Jones Stochastic bad at walking.

Gridworld

States
Actions - take us to our next state
Transition Function - Same as successor function.
`Transition Function: if im in state S and i take action A, i end up in state S'`

``` python
S:state
s_prime:next_state
a:action

T(S, a, S_prime) # transition for action

R(S, a, S_prime) # reward for action
```

Policy is the best possible action u can take from every state

``` python
+------+------+------+------+
|  >>  |  >>  |  >>  |  +1  |
+------+------+------+------+
|  ^^  | XXXX |  ^^  |  -1  |
+------+------+------+------+
|  ^^  |  >>  |  ^^  |  <<  |
+------+------+------+------+
```

*its like a vector field, but theo says it isnt and that its a stupid idea*



