---
tags:
  - math
  - ATMH
  - homework
---
# 13
Are the vectors $(4, 5, -2)$ and $(3,-1, 5)$ orthogonal, parallel, or neither?

if dot product is zero, then vectors are perpendicular b/c $\frac{u \cdot v}{||u||*||v||} = \cos(\theta)$

$$ \begin{aligned}
&(4, 5, -2) \cdot (3,-1, 5) \\
\\
&= (4 * 3) + (5 * -1) + (-2 * 5) \\
&= 12 - 5 - 10 \\
&= -3
\end{aligned}$$
Therefore the vectors are *Not* orthogonal


# 15
Find the acute angle between the lines $2𝑥 − 𝑦 = 3$ and $3𝑥 + 𝑦 = 7$.

Get the slopes of the lines in question

$$\begin{aligned}

2x - y &= 3 \\
y &= 2x - 3 \\
m_{1} &= 2 \\
\\

3x + y &= 7 \\
y &= 7 - 3x \\
m_{2} &= -3
\end{aligned}$$

turn those slopes into vectors

$$\begin{aligned}

m_{1} &= 2 \implies \vec{u} = <1, 2> \\
m_{2} &= -3 \implies \vec{v} = <1, -3> \\
\\
\cos(\theta) &= \frac{u \cdot v}{||u||*||v||} \\
\cos(\theta) &= \frac{(1*1) + (2*-3)}{\sqrt{1 + 4}*\sqrt{1 + 9}}\\
\cos(\theta) &= \frac{-5}{5\sqrt{2}} \\
\cos(\theta) &= \frac{-1}{\sqrt{2}} \\
\cos(\theta) &= \frac{-\sqrt{2}}{2} \\
\theta &= \frac{3\pi}{4} \\
\text{is not acute } & \text{so we need }180 - \theta \\
\theta_{real} &= \pi - \frac{3\pi}{4} \\ = \frac{\pi}{4}
\end{aligned}$$

# 18a
Find the distances between the following pairs of points:

a. $(−3,1,2)$ and $(4,−1,1)$

$$\begin{aligned}
\text{if } \vec{u} &= (−3,1,2) \\
\text{and } \vec{v} &= (4, -1, 1) \\
\text{then } \vec{u} - \vec{v} &= (-7, 2, 1) \\
||\vec{u} - \vec{v}|| &= \sqrt{49 + 4 + 1} \\
&= \sqrt{54} = 3\sqrt{6}
\end{aligned}$$

# 20
Let $\vec{u}$, $\vec{v}$, and $\vec{w}$ be vectors in a given Euclidean space and let 𝑐 and 𝑑 be nonzero scalars. Tell
whether each of the following expressions is a scalar, a vector, or is not a valid expression.

a. $(\vec{u} \cdot \vec{v})\vec{w}$ is a vector

b. $(\vec{u} \cdot \vec{v}) \cdot \vec{w}$ is a scalar? I think?

c. $\vec{u} \cdot \vec{v} + c \vec{w}$ is not valid

d. $\vec{u} \cdot \vec{v} + c$ is a scalar

e. $c(\vec{u} \cdot \vec{v}) + d\vec{w}$ is not valid

f. $||\vec{u} \cdot c\vec{v}|| + d$ is not valid

g. $c\vec{u} \cdot d\vec{v} + ||\vec{w}||\vec{v}$ is not valid

h. $||\vec{u} \cdot \vec{v}||$ is not valid

# 22
Show that if $u + v$ and $u - v$ are orthogonal, then the vectors $u$ and $v$ must have the same length.

$$\begin{aligned}

(\vec{u} + \vec{v}) \cdot (\vec{u} - \vec{v}) =& 0\\
=& (u_{1} + v_{1}, u_{2} + v_{2},\dots u_{n} + v_{n}) \cdot(u_{1} - v_{1}, u_{2} -v_{2}, \dots u_{n} - v_{n}) \\
=& ((u_{1}+v_{1}) * (u_{1}-v_{1})) + ((u_{2}+v_{2}) * (u_{2}-v_{2})) + \dots + ((u_{n}+v_{n}) * (u_{n}-v_{n})) \\
=& (u_{1}^2-v_{1}^2) + (u_{2}^2-v_{2}^2) + \dots + (u_{n}^2-v_{n}^2) = 0 \\
=& \vec{u} \cdot \vec{u} - \vec{v} \cdot \vec{v} \\
\vec{u} \cdot \vec{u} =& \vec{v} \cdot \vec{v} \\
||\vec{u}||^2 =& ||\vec{v}||^2\\
||\vec{u}|| =& ||\vec{v}||

\end{aligned}$$

# 23b
If $𝒖 = 2𝒊 + 3𝒋 + 𝒌$, $𝒗 = −𝒊 + 2𝒋 + 4𝒌$, and $𝒘 = 3𝒊 − 7𝒌$, compute the following cross products.

$$
\begin{aligned}
& \vec{u} = 2\hat{i} + 3\hat{j} + \hat{k}, \quad \vec{v} = -\hat{i} + 2\hat{j} + 4\hat{k}, \quad \vec{w} = 3\hat{i} - 7\hat{k}.
\\
\\
\vec{w} \times \vec{u} &= 
\begin{vmatrix}
\hat{i} & \hat{j} & \hat{k} \\
3 & 0 & -7 \\
2 & 3 & 1
\end{vmatrix} \\
&= \hat{i} \begin{vmatrix} 0 & -7 \\ 3 & 1 \end{vmatrix}
- \hat{j} \begin{vmatrix} 3 & -7 \\ 2 & 1 \end{vmatrix}
+ \hat{k} \begin{vmatrix} 3 & 0 \\ 2 & 3 \end{vmatrix} \\
&= \hat{i}((0)(1) - (3)(-7)) 
- \hat{j}((3)(1) - (2)(-7)) 
+ \hat{k}((3)(3) - (2)(0)) \\
&= \hat{i}(0 + 21) 
- \hat{j}(3 + 14) 
+ \hat{k}(9 + 0) \\
&= 21\hat{i} - 17\hat{j} + 9\hat{k}.
\\
\\
(\vec{w} \times \vec{u}) \times \vec{v} &= 
\begin{vmatrix}
\hat{i} & \hat{j} & \hat{k} \\
21 & -17 & 9 \\
-1 & 2 & 4
\end{vmatrix} \\
&= \hat{i} \begin{vmatrix} -17 & 9 \\ 2 & 4 \end{vmatrix}
- \hat{j} \begin{vmatrix} 21 & 9 \\ -1 & 4 \end{vmatrix}
+ \hat{k} \begin{vmatrix} 21 & -17 \\ -1 & 2 \end{vmatrix} \\
&= \hat{i}((-17)(4) - (9)(2)) 
- \hat{j}((21)(4) - (9)(-1)) 
+ \hat{k}((21)(2) - (-17)(-1)) \\
&= \hat{i}(-68 - 18) 
- \hat{j}(84 + 9) 
+ \hat{k}(42 - 17) \\
&= \hat{i}(-86) 
- \hat{j}(93) 
+ \hat{k}(25) \\
&= -86\hat{i} - 93\hat{j} + 25\hat{k}.
\\
\\
& (\vec{w} \times \vec{u}) \times \vec{v} = -86\hat{i} - 93\hat{j} + 25\hat{k}.
\end{aligned}
$$


# 25
Find two unit vectors that are nonzero and orthogonal to both of the vectors (3, 2, 1) and (-1, 1, 0).

$$
\begin{aligned}
& \vec{u} = (3, 2, 1), \quad \vec{v} = (-1, 1, 0).
\\
\\
& \vec{u} \times \vec{v}\\
\vec{u} \times \vec{v} &= 
\begin{vmatrix}
\hat{i} & \hat{j} & \hat{k} \\
3 & 2 & 1 \\
-1 & 1 & 0
\end{vmatrix} \\
&= \hat{i} \begin{vmatrix} 2 & 1 \\ 1 & 0 \end{vmatrix}
- \hat{j} \begin{vmatrix} 3 & 1 \\ -1 & 0 \end{vmatrix}
+ \hat{k} \begin{vmatrix} 3 & 2 \\ -1 & 1 \end{vmatrix} \\
&= \hat{i}((2)(0) - (1)(1)) 
- \hat{j}((3)(0) - (-1)(1)) 
+ \hat{k}((3)(1) - (-1)(2)) \\
&= \hat{i}(-1) 
- \hat{j}(1) 
+ \hat{k}(3 + 2) \\
&= -\hat{i} - \hat{j} + 5\hat{k} \\
&= (-1, -1, 5).
\\
\\
& \vec{u} \times \vec{v} \text{ to find the unit vector:} \\
||\vec{u} \times \vec{v}|| &= \sqrt{(-1)^2 + (-1)^2 + (5)^2} = \sqrt{1 + 1 + 25} = \sqrt{27} = 3\sqrt{3}. \\
\vec{w}_1 &= \frac{\vec{u} \times \vec{v}}{||\vec{u} \times \vec{v}||} = \frac{(-1, -1, 5)}{3\sqrt{3}} = \left(-\frac{1}{3\sqrt{3}}, -\frac{1}{3\sqrt{3}}, \frac{5}{3\sqrt{3}}\right).
\\
\\
& \text{by reversing the direction of } \vec{w}_1: \\
\vec{w}_2 &= \left(\frac{1}{3\sqrt{3}}, \frac{1}{3\sqrt{3}}, -\frac{5}{3\sqrt{3}}\right).
\\
\\
& (3, 2, 1) \text{ and } (-1, 1, 0) \text{ are:} \\
\vec{w}_1 &= \left(-\frac{1}{3\sqrt{3}}, -\frac{1}{3\sqrt{3}}, \frac{5}{3\sqrt{3}}\right), \\
\vec{w}_2 &= \left(\frac{1}{3\sqrt{3}}, \frac{1}{3\sqrt{3}}, -\frac{5}{3\sqrt{3}}\right).
\end{aligned}
$$



# 28

