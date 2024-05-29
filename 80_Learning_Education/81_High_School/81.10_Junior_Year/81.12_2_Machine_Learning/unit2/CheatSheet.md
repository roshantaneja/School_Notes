---
tags:
  - CS
  - MachineLearning
---


### Markov Decision Process
*Stochastic Search, Random Element of Search*

*Opposite of a deterministic Search*

Markov Decision Processes (MDPs) are foundational in the study of decision-making under uncertainty, utilized in various fields such as robotics, automated control, economics, and artificial intelligence. An MDP provides a mathematical framework for modeling decision-making in situations where outcomes are partly random and partly under the control of a decision maker. Here's an expanded explanation of the notes you've provided:


#### Example with Gridworld

The notes also mention a Gridworld example, illustrating an MDP scenario where an agent navigates through a grid by taking specific actions in states. Obstacles (represented as 'XXXX') and goal states (with rewards +1 or -1) are present. The table displays a policy, indicating the recommended action in each state to achieve the highest reward, akin to navigating through a maze with strategic moves. However, the comparison to a vector field is noted as incorrect by Theo, suggesting that while visually similar, a vector field's mathematical and theoretical underpinnings differ from those of a policy in an MDP context

```
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

Formula Time!

### How value iteration works

If i take zero steps, the values are all zeros.
For each iteration, the compute one step out.
For each passthrough of the formula, take the value of the action that gets the largest reward.

$V^*(S) \to$ start in $S$, act optimally (return quantity)

$Q^*(S, a) \to$ States, take $a$ acting optimally, how much reward? (return quantity)

$\pi^*(S) \to$ optimal action from state $S$ (return state)

for gridworld, after running 100 iterations:

```
+--------+--------+--------+--------+
|  0.64  |  0.74  |  0.85  |   +1   |
+--------+--------+--------+--------+
|  0.57  |  XXXX  |  0.57  |   -1   |
+--------+--------+--------+--------+
|  0.49  |  0.43  |  0.48  |  0.28  |
+--------+--------+--------+--------+
```

Each state has its own value

$V^*(S)=max(Q^*(S, a))$ is the value of my state

$Q^*(S, a) = \Sigma_{S'}^{a\text{ (ctions from S')}}T_{\text{ransition}}(S, a, S') * (R_{\text{eward}}(S, a, S') + \gamma_{\text{Discount}} * v^*_{\text{alue}}(S'))$


so $V^*(S)$ is recursive, infinitely, so when does it end?

what happens if I run the iteration for one time step, what about two?

So we keep running iteratively, as time goes on till the value of each state converges.

# Policy evaluation

How do i go from a policy -> values

$V^{\pi}_{k+1}(S)=\Sigma_{S'} T(S, \pi(S), S')[R(S, \pi(S), S') + \gamma*V^{\pi}_{k}(S')]$

since policy only has one action, no need to pick the max anymore.

can we go backward?



# Policy Iteration
Does basically the same thing as Value iteration, but is faster than considering all actions.

0. Policy Evaluation
1. Policy Extraction
2. Done!

---

# Final Formula Sheet

### Value Iteration

==Value Iteration==
$$V^{*}(S) = ^{\text{max}}_{a}\Sigma _{S'}T(S, a, S') \times [R(S, a, S') + \gamma \times V^{*}(S')]$$

==Value Iteration Update Formula==
$$V_{k+1}(S) = ^{\text{max}}_{a}\Sigma _{S'}T(S, a, S') \times [R(S, a, S') + \gamma \times V_{k}(S')]$$

### Policy Evaluation

==Policy Evaluation==
$$V^{\pi}(S) = ^{\text{max}}_{a}\Sigma _{S'}T(S, a, S') \times [R(S, a, S') + \gamma \times V^{\pi}(S')]$$

==Policy Iteration Update Formula==
$$V^{\pi}_{k+1}(S) = ^{\text{max}}_{a}\Sigma _{S'}T(S, a, S') \times [R(S, a, S') + \gamma \times V^{\pi}_{k}(S')]$$

==Policy Extraction==
$$\pi^{\pi}(S) = ^{\text{argmax}}_{a}\Sigma _{S'}T(S, a, S') \times [R(S, a, S') + \gamma \times V(S')]$$

### Temporal Learning

==Temporal Difference Learning==
$$V(S) = (1-\alpha) \times V(S) + \alpha \times \text{sample}$$

==Q-Learning (Fun Function)==

$$Q(S, a) = (1-\alpha) \times Q(S, a) + \alpha \times \text{sample}$$

$$\text{sample value} = R(S, a, S') + \gamma \times ^{\text{max}}_{a'}Q(S', a')$$