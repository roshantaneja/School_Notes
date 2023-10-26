---
tags:
  - math
---

## Derivatives

#### Derivative Definition

$\frac{d}{dx}(f(x)) = f'(x) = \lim_{ h \to 0 }\frac{f(x+h)-f(x)}{h}$

#### Basic Properties

$(cf(x))' = c(f'(x))$

$(f(x)\pm g(x))' = f'(x)g(x) \pm f(x)g'(x)$

$\frac{d}{dx}(c) = 0$

#### Mean Value Theorem
If f is differentiable on the interval (a, b) and continuous at the endpoints, there exists a c in (a, b) s.t.

$f'(c) = \frac{f(b)-f(a)}{b-a}$

#### Product Rule
The derivative of the product of two functions is given by:
$(f(x)g(x))' = f'(x)g(x) + f(x)g'(x)$

#### Quotient Rule
The derivative of the quotient of two functions is given by:
$\left( \frac{f(x)}{g(x)} \right)' = \frac{g(x)f'(x) - f(x)g'(x)}{(g(x))^2}$

#### Power Rule
The power rule simplifies finding the derivative when the function is a power of \( x \):
$\frac{d}{dx}(x^n) = nx^{n-1}$

#### Chain Rule
The chain rule is used when dealing with composite functions:
$\frac{d}{dx}(f(g(x))) = f'(g(x)) \cdot g'(x)$

#### Common Derivatives
1. Constant Function: $\frac{d}{dx}(c) = 0$
2. Power of $x$ : $\frac{d}{dx}(x^n) = nx^{n-1}$
3. Exponential Function: $\frac{d}{dx}(e^x) = e^x$
4. Logarithmic Function: $\frac{d}{dx}(\ln(x)) = \frac{1}{x}$
5. Trigonometric Functions:
   - $\frac{d}{dx}(\sin(x)) = \cos(x)$ 
   - $\frac{d}{dx}(\cos(x)) = -\sin(x)$
   - $\frac{d}{dx}(\tan(x)) = \sec^2(x)$
   - $\frac{d}{dx}(\sec(x)) = \sec(x)\tan(x)$
   - $\frac{d}{dx}(\csc(x)) = -\csc(x)\cot(x)$
   - $\frac{d}{dx}(\cot(x)) = -\csc^2(x)$
6. Inverse Trigonometric Functions:
   - $\frac{d}{dx}(\arcsin(x)) = \frac{1}{\sqrt{1 - x^2}}$
   - $\frac{d}{dx}(\arccos(x)) = \frac{-1}{\sqrt{1 - x^2}}$
   - $\frac{d}{dx}(\arctan(x)) = \frac{1}{1 + x^2}$
7. Exponential/Logarithmic Functions
   -  $\frac{d}{dx}(a^{x)}= a^x\ln a$
   - $\frac{d}{dx}(e^{x})= e^x$
   - $\frac{d}{dx}(\ln x) = \frac{1}{x}, x>0$
   - $\frac{d}{dx}(\ln(|x|)) = \frac{1}{x}$
   - $\frac{d}{dx}(\log_{a}(x)) = \frac{1}{x\ln a}$


## Integration

#### Integral Definiton

$\int_{a}^{b} \,f(x) dx = \lim_{ n \to \infty } \Sigma^{n}_{i =1}f(x_{i}^{*}) \Delta x$

#### Fundamental Theorem of Calculus Pt. 1

If $f$ continuous on $[a, b]$ then

$g(x) = \int^{x}_{a}\,f(t)dt$ is also continuous on $[a, b]$ and

$g'(x) = \frac{d}{dx}\int ^{x}_{a}\,f(t)dt$.

#### Fundamental Theorem of Calculus Pt. 2

$f$ is continuous on $[a, b]$, $F(x)$ is an anti-derivative of $f(x)$ i.e. $F(x) = \int  \,f(x) dx$, then 

$\int^{b}_{a} \,f(x)dx = F(b) - F(a)$


#### Properties

