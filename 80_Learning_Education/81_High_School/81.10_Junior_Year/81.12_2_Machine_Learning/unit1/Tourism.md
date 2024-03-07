---
tags:
  - CS
  - MachineLearning
---
# Search Formulation: San Francisco Tour


**Part A:** You’re showing a friend around San Francisco and your goal is to visit N different landmarks ${ L1, L2, … , LN }$. You start your day at L1, which can be considered to be visited, and it takes $t_{ij}$ minutes to travel between $Li$ and $Lj$.

Ideally you would like to optimize your time spent in the city so you can spend more time seeing all the sights, so your goal is to find a route that visits all the landmarks
while minimizing total travel time.

(i) What is a good (minimal) state space representation for this problem?

```python 
State = (int: current_landmark, set(): visited, int: total_time)
```

(ii) What is the size of the state space?
### $N*2^{N}$

**Part B:** Oh no! Sea lions have taken to the streets of the city. Sea lions are notoriously aggressive, so you want to plan your path to encounter fewer of them. If you travel from $L_{i}$ to $L_{j}$, you’ll encounter $s_{ij}$ sea lions on the way. Your goal is still to find a route that minimizes the total travel time while keeping your number of sea lion encounters under $S_{max}$.


(i) What is a good (minimal) state space representation for this problem?

```python
State = (int: current_landmark, set(): visited, int: sealions_encountered)
```

(ii) What is the size of the state space?

### $N*2^{N}$


**Part C:** Good news! The sea lions have now cleared out, but now you’re trying to guide a group of k of your friends around the city. They’ve decided they don’t actually care about every person in the group seeing all of the locations – as long as one friend sees each location and gets a picture of it, they’re happy.

(i) What is a good (minimal) state space representation for this problem?

```python
State = ((int: friend_curr_location, int[]: path)[k]: friends_list)
```

(ii) What is the size of the state space?

### $N^k*2^{N}$