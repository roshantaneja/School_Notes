---
tags:
  - MachineLearning
  - AI
  - notes
  - CS
---


```python
theta = [0, 0, 0, 0, 0] #N-dimensions large vector of zeros

theta_naught

while True:
	changed = False
	for i in range(N):
		if y[i] (theta.transpose() * X[i] + theta_naught):
			theta = theta + y[i] * X[i]
			theta_naught = theta_naught 
			changed = True
	
	if not changed:
		break

```