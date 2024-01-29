---
tags:
  - math
  - Calculus
---

## Derivatives

#### Derivative Definition

$\frac{d}{dx}(f(x)) = f'(x) = \lim_{ h \to 0 }\frac{f(x+h)-f(x)}{h}$

$(cf(x))' = c(f'(x))$

$(f(x)\pm g(x))' = f'(x)g(x) \pm f(x)g'(x)$

$\frac{d}{dx}(c) = 0$
#### Mean Value Theorem
If f is differentiable on the interval (a, b) and continuous at the endpoints, there exists a c in (a, b) s.t.

$f'(c) = \frac{f(b)-f(a)}{b-a}$

#### Product Rule

$(f(x)g(x))' = f'(x)g(x) + f(x)g'(x)$

#### Quotient Rule

$\left( \frac{f(x)}{g(x)} \right)' = \frac{g(x)f'(x) - f(x)g'(x)}{(g(x))^2}$

#### Power Rule

$\frac{d}{dx}(x^n) = nx^{n-1}$

#### Chain Rule

$\frac{d}{dx}(f(g(x))) = f'(g(x)) \cdot g'(x)$

#### Common Derivatives
1. Constant Function: $\frac{d}{dx}(c) = 0$
2. Power of $x$ : $\frac{d}{dx}(x^n) = nx^{n-1}$
3. Trigonometric Functions:
   - $\frac{d}{dx}(\sin(x)) = \cos(x)$ 
   - $\frac{d}{dx}(\cos(x)) = -\sin(x)$
   - $\frac{d}{dx}(\tan(x)) = \sec^2(x)$
   - $\frac{d}{dx}(\sec(x)) = \sec(x)\tan(x)$
   - $\frac{d}{dx}(\csc(x)) = -\csc(x)\cot(x)$
   - $\frac{d}{dx}(\cot(x)) = -\csc^2(x)$
4. Inverse Trigonometric Functions:
   - $\frac{d}{dx}(\arcsin(x)) = \frac{1}{\sqrt{1 - x^2}}$
   - $\frac{d}{dx}(\arccos(x)) = \frac{-1}{\sqrt{1 - x^2}}$
   - $\frac{d}{dx}(\arctan(x)) = \frac{1}{1 + x^2}$
5. Exponential/Logarithmic Functions
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

Certainly! Below is a section on the properties of integrals:

#### Properties of Integrals

1. **Linearity**: 
   - Scalar Multiplication: $\int_a^b c \cdot f(x) \, dx = c \cdot \int_a^b f(x) \, dx$
   - Addition/Subtraction: $\int_a^b (f(x) \pm g(x)) \, dx = \int_a^b f(x) \, dx \pm \int_a^b g(x) \, dx$

2. **Interval Properties**:
   - Reversal of Limits: $\int_a^b f(x) \, dx = -\int_b^a f(x) \, dx$
   - Zero Width: $\int_a^a f(x) \, dx = 0$
   - Additivity: $\int_a^b f(x) \, dx + \int_b^c f(x) \, dx = \int_a^c f(x) \, dx$

3. **Comparison**: If $f(x) \geq g(x)$ for all $x$ in $[a, b]$, then $\int_a^b f(x) \, dx \geq \int_a^b g(x) \, dx$.

4. **Absolute Values**: $\left| \int_a^b f(x) \, dx \right| \leq \int_a^b |f(x)| \, dx$

5. **Mean Value Theorem for Integrals**: If $f$ is continuous on $[a, b]$, then there exists some $c$ in $(a, b)$ such that $\int_a^b f(x) \, dx = f(c)(b - a)$.


Certainly! Here's a list of common integrals:

#### Common Integrals

1. **Power Rule (for $n \neq -1$)**: 

$\int x^n \, dx = \frac{x^{n+1}}{n+1} + C$

2. **Exponential Function**: 

$\int e^x \, dx = e^x + C$

3. **Natural Logarithm**: 

$\int \frac{1}{x} \, dx = \ln|x| + C$

4. **Trigonometric Functions**: 
   - $\int \sin(x) \, dx = -\cos(x) + C$
   - $\int \cos(x) \, dx = \sin(x) + C$
   - $\int \tan(x) \, dx = -\ln|\cos(x)| + C$ or $-\ln|\sec(x)| + C$
   - $\int \sec^2(x) \, dx = \tan(x) + C$
   - $\int \sec(x)\tan(x) \, dx = \sec(x) + C$
   - $\int \csc^2(x) \, dx = -\cot(x) + C$
   - $\int \csc(x)\cot(x) \, dx = -\csc(x) + C$

5. **Inverse Trigonometric Functions**: 
   - $\int \arcsin(x) \, dx = x \arcsin(x) + \sqrt{1-x^2} + C$
   - $\int \arccos(x) \, dx = x \arccos(x) - \sqrt{1-x^2} + C$
   - $\int \arctan(x) \, dx = x \arctan(x) - \frac{1}{2} \ln |1+x^2| + C$

6. **Exponential Growth/Decay**: 

$\int a \cdot e^{kx} \, dx = \frac{a}{k} \cdot e^{kx} + C$

7. **Logarithmic Functions (for $a > 0$, $a \neq 1$)**: 

$\int \log_a(x) \, dx = x (\ln(x) \log_a(e) - \ln(a) \log_a(e)) + C$

In all of the above, $C$ represents the constant of integration. Remember, Indefinite Integrals are all ==sets of functions== not specific functions.