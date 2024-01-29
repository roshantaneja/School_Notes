---
tags:
  - math
  - Calculus
---


AP® Calculus BC 2023 Free-Response Questions

| $t$ (seconds)       | 0   | 60  | 90   | 120 | 135  | 150 |
| ----------------- | --- | --- | ---- | --- | ---- | --- |
| $f(t)$ (gal/second) | 0   | 0.1 | 0.15 | 0.1 | 0.05 | 0   | 

1. A customer at a gas station is pumping gasoline into a gas tank. The rate of flow of gasoline is modeled by a differentiable function $f$, where $f (t)$ is measured in gallons per second and t is measured in seconds since pumping began. Selected values of $f (t)$ are given in the table.

(a) Using correct units, interpret the meaning of $\int_{60}^{135} f(t)\, dt$  in the context of the problem. Use a right Riemann sum with the three subintervals $[60, 90]$, $[90, 120]$, and $[120, 135]$ to approximate the value of $\int_{60}^{135} f(t)\, dt$


$\int _{60}^{135} f(t)\, dt$ is the total gas (in gallons) that the customer receives between 60 and 135 seconds.

$\sum_{n=1}^{\infty} (f_{n} - t_{n-1}) * f(t)$

```math
a = (90-60) * 0.15
b = (120 - 90) * 0.1
c = (135 - 120) * 0.05
a + b + c
```

**8.25 gallons**


(b) Must there exist a value of $c$, for $60 < c < 120$, such that $f'(c) = 0$ ? Justify your answer.




(c) The rate of flow of gasoline, in gallons per second, can also be modeled by $g(t) = (\frac{t}{500}) \cos( ( \frac{t}{120})^2)$ for $0 < t < 150$. Using this model, find the average rate of flow of gasoline over the time interval $0 < t < 150$. Show the setup for your calculations.

(d) Using the model g defined in part (c), find the value of $g'(140)$. Interpret the meaning of your answer in the context of the problem.



