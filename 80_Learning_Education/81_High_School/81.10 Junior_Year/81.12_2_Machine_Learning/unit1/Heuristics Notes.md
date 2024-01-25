---
tags:
  - MachineLearning
  - AI
  - notes
---


# Types Of Heuristics

## Euclidean Distance
not great if there are obstacles, cant walk through walls

## Manhattan Distance
Not actual "Distance" but based in how many east-west vs how many north-south

# Pancake Heuristic

imagine a pancake stack

```
      _ _
    _ _ _ _
  _ _ _ _ _ _
_ _ _ _ _ _ _ _
```

imagine you flip from the 2nd pancake

```
    _ _ _ _
      _ _
  _ _ _ _ _ _
_ _ _ _ _ _ _ _
```


The heuristic would be the "biggest pancake" out of place (in this case, pancake #2)

## Greedy Search

takes the thing that "looks the best"

fast, but not always an optimal path



### How much do you care about being fast vs being accurate?


