---
tags:
  - MachineLearning
  - notes
  - CS
---


### Markov Decision Process
*Stochastic Search, Random Element of Search*
*Opposite of a deterministic Search*

Markov Decision Processes (MDPs) are foundational in the study of decision-making under uncertainty, utilized in various fields such as robotics, automated control, economics, and artificial intelligence. An MDP provides a mathematical framework for modeling decision-making in situations where outcomes are partly random and partly under the control of a decision maker. Here's an expanded explanation of the notes you've provided:

### Overview of Markov Decision Processes

An MDP models the environment for reinforcement learning where an agent makes decisions in a stochastic or uncertain environment. The process is "Markov" because it satisfies the Markov property: the future state depends only on the current state and the action taken, not on the sequence of events that preceded it.

#### Components of an MDP:

1. **States**: These represent the different configurations or conditions that the environment or system can be in. In the context of the provided notes, the grid in a Gridworld can be thought of as the environment, with each cell representing a different state.

2. **Actions**: Actions are the set of decisions or moves the agent can make. Each action taken by the agent leads it from one state to another. In Gridworld, actions could be moving up, down, left, or right.

3. **Transition Function**: Also known as the successor function, it defines the probabilities of reaching a particular successor state (S') from the current state (S) by taking an action (A). This function embodies the stochastic nature of the environment. The notation `T(S, A, S')` represents the probability of transitioning to state `S'` from state `S` upon taking action `A`.

   ```python
   # Transition function
   def T(S, a, S_prime):
       # Implementation depends on the environment
       pass
   ```

4. **Reward Function**: This function assigns a numerical reward to each transition between states. The reward could be immediate or long-term, encapsulating the goal of the agent. The function `R(S, A, S')` denotes the reward received when moving from state `S` to state `S'` by action `A`.

   ```python
   # Reward function
   def R(S, a, S_prime):
       # Implementation depends on the specific goals and penalties
       pass
   ```

5. **Policy**: A policy is a strategy or a rule that the agent follows in deciding the next action based on the current state. It represents the agent's behavior or decision-making strategy, aimed at maximizing some measure of long-term reward. The policy is essentially a mapping from states to the best possible actions to take from those states.

#### Example with Gridworld

The notes also mention a Gridworld example, illustrating an MDP scenario where an agent navigates through a grid by taking specific actions in states. Obstacles (represented as 'XXXX') and goal states (with rewards +1 or -1) are present. The table displays a policy, indicating the recommended action in each state to achieve the highest reward, akin to navigating through a maze with strategic moves. However, the comparison to a vector field is noted as incorrect by Theo, suggesting that while visually similar, a vector field's mathematical and theoretical underpinnings differ from those of a policy in an MDP context

``` python
+------+------+------+------+
|  >>  |  >>  |  >>  |  +1  |
+------+------+------+------+
|  ^^  | XXXX |  ^^  |  -1  |
+------+------+------+------+
|  ^^  |  >>  |  ^^  |  <<  |
+------+------+------+------+
```

*its like a vector field, but Theo says it isn't and that its a stupid idea*

In summary, Markov Decision Processes provide a comprehensive framework for modeling decision-making in environments with stochastic dynamics. By defining states, actions, transition and reward functions, and policies, MDPs enable the formulation of strategies that can navigate uncertainties to achieve specified objectives.


Q- State and Chance node: Same thing, where the T and R function are decided to move from an action to a state. 


# How to solve the issue of infinite loops?
we need to decay the rewards so that the agent doesn't just run forever to collect points.

$\gamma$ = discount

$\gamma$ needs to be less than 1 so that the reward decays and so the reward converges


for example

```python
moves = [<<, >>, ext]

"""
																  v Start
+------+------+------+------+------+------+------+------+------+------+
|  10  |   9  |   8  |   7  |   6  |   5  |   4  |   3  |   2  |   1` |
+------+------+------+------+------+------+------+------+------+------+
"""


gamma = 0.1
```


Formula Time!

### How value iteration works

If i take zero steps, the values are all zeros.
For each iteration, the compute one step out.
For each passthrough of the formula, take the value of the action that gets the largest reward.

$v^*(S) \to$ start in $S$, act optimally (return quantity)

$Q^*(S, a) \to$ States, take $a$ acting optimally, how much reward? (return quantity)

$\pi^*(S) \to$ optimal action from state $S$ (return state)

for gridworld, after running 100 iterations:

``` python
+--------+--------+--------+--------+
|  0.64  |  0.74  |  0.85  |   +1   |
+--------+--------+--------+--------+
|  0.57  |  XXXX  |  0.57  |   -1   |
+--------+--------+--------+--------+
|  0.49  |  0.43  |  0.48  |  0.28  |
+--------+--------+--------+--------+
```

Each state has its own value

$v^*(S)=max(Q^*(S, a))$ is the value of my state

$Q^*(S, a) = \Sigma_{S'}^{a\text{ (ctions from S')}}T_{\text{ransition}}(S, a, S') * (R_{\text{eward}}(S, a, S') + \gamma_{\text{Discount}} * v^*_{\text{alue}}(S'))$


so $v^*(S)$ is recursive, infinitely, so when does it end?

what happens if I run the iteration for one time step, what about two?

So we keep running iteratively, as time goes on till the value of each state converges.

# Policy evaluation

How do i go from a policy -> values

$$V^{\pi}(S)=\Sigma_{S'}^{a} T(S, a, S')[R(S, a, S') + \gamma V^{pi}(S')]$$

since policy only has one action, no need to pick the max anymore.

can we go backward?


# Policy Iteration
Does basically the same thing as Value iteration, but is faster than considering all actions.

0. Policy Evaluation
1. Policy Extraction
2. Done!