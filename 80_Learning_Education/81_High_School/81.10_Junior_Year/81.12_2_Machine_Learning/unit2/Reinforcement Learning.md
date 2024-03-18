---
tags:
  - MachineLearning
  - CS
---
# Reinforcement Learning

## Model-Based Learning

Counting the Outcomes that happen, and learning from the model.

$S, a, \to ?$

Normalize these values (take an average)  -> $T(S, a, S')$

$R(S, a, S')$

This is the "Learned MDP" from finite samples.


5 States, 4 rounds.

Round 1

A + East = B, -1

B + East = C, -1

C + Exit = Done, +10

Round 2

A + East = B, -1

B + East = C, -1

C + Exit = Done, +10

Round 3

D + North = B, -1

B + East = C, -1

C + Exit = Done, +10

Round 4

D + North = B, -1

B + East = E, -1

E + Exit = Done, -10



T(A , east, B) = 1.0

Refrence: 

Round 1, Step 1

Round 2 Step 1


T(B, east, C) = 0.75

Refrence:

Round 1, Step 2
Round 2, Step 2
Round 3, Step 2
Round 4, Step 2

so 

T(B, east, E) = 0.25

R(C, Exit, Done) = +10

R(E, Exit, Done) = -10

Now that I have values for T and R, I can solve the "MDP" with value iteration or Policy Iteration

### Example

What is the average age of everyone in this classroom every year?

$P(\text{age}) = \frac{\text{ages}}{\text{total responses}}$

or 

$\frac{1}{N}\Sigma {\text{ ages}}$


### Policy Evaluation

Some $\pi(S)$

Learn $V(S)$

so for our previous example





