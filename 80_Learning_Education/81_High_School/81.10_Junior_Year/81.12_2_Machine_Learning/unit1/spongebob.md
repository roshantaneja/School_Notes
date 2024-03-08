---
tags:
  - MachineLearning
  - AI
  - homework
  - CS
---


# Search Formulation Practice: Spongebob

Spongebob is taking his drivers license exam with Mrs. Puff and it goes a bit haywire! Now he’s being chased down by the Bikini Bottom police. Instead of pullingover, Spongebob speeds away and is now hiding somewhere in the city.
    
Let’s say the city of Bikini Bottom is represented as an `m x n` grid. In this problem, *Spongebob is staying stationary* in his hiding place, and it’s up to the police to find him. Every police car has two distinct integer controls: **Throttle** and **Steering**.


**Throttle** can be `{-1, 0, 1}` which represents Brake, Coast, or Gas. If a police car is traveling at *2 blocks/s* and chooses Gas (1), the next turn it will be at *3 blocks/s*.

**Steering** can be {Right, Left, Forwards, Backwards} – the Bikini Bottom police department invested in some cool omni-directional cars! This controls the **direction** the car is traveling in.

All police cars can travel at a speed of up to *3 blocks/s*, so there are **4 possible speeds** a car can be going! That means the **speed** of the car is in `{0, 1, 2, 3}`.

Suppose you only control **one police car**. Remember, that since Spongebob is hiding and the police don’t know where he is, they need to check **every location in the city** to find him.

(a) What information do you need to encode the state?

```python
State = (int: x, int: y, int: speed, int[]: visited)

x = m
y = n
speed = 4
visited = 2**(m*n)
```


(b) What’s the size of the state space? (think: how many possible locations can the car be in? How do we keep track of locations the car has already been? Do we need to take into account speed?)

```python
positions = m * n
speeds = 4
visited = 2**(m*n)
state_space = positions * speeds #4 * mn * 2^(mn)
```


(c) What is the maximum branching factor of the tree? (think: what are all the possible actions you can take in a move?)

```python
Throttle = [-1, 0, 1]
Steering = [Right, Left, Forwards, Backwards]

actions = len(Throttle) * (len(Steering))

max_branching_factor = actions #12
```

(d) Is Breadth First Search guaranteed to return the shortest path?

```md
> Yes, because the cost of each action is the same. It is optimal.
```

(e) Is Depth First Search guaranteed to return the shortest path?

```md
> No, because it may not pick the fastest path, but it may find "a" path *faster*. It is not optimal.
```

---

Now, let’s assume you’re controlling a fleet of **P** police cars. Each one has a distinct location in the city, and they all have the same behavior described above. Now, all the cars together can
communicate and collectively check each location.

(f) What is the new size of the state space?

```python
positions = (m * n)**P
speeds = 4**P
P = number of police cars

state_space = positions * speeds * P #4^(P) * (mn)^(P) * 2^(mn)
```

(g) What is the new maximum branching factor?

```python
Throttle = [-1, 0, 1]
Steering = [Right, Left, Forwards, Backwards]

actions = len(Throttle) * (len(Steering)) * P  #12^(P)
```