---
Tags:
- Machine Learning
- AI
- Notes
---

# Types of Heuristics in AI and Machine Learning

Heuristics play a crucial role in decision-making processes in artificial intelligence and machine learning. They are used to make efficient decisions by simplifying complex problems. Here, we explore different types of heuristics, each with its unique applications and limitations.

## 1. Euclidean Distance

### Overview
The Euclidean distance is a measure of the "straight line" distance between two points in Euclidean space. This heuristic is often used in pathfinding and clustering algorithms.

### Limitations
- **Obstacle Consideration:** Euclidean distance does not account for obstacles in the path. In real-world scenarios, where one cannot 'walk through walls,' this heuristic might not provide the most practical route.

### Example
Imagine a grid where you need to find the shortest path from point A to point B. The Euclidean distance calculates the direct line distance irrespective of any obstacles like walls or barriers.

## 2. Manhattan Distance

### Overview
Manhattan distance, also known as Taxicab geometry or L1 distance, measures the distance between two points in a grid based system. It is the sum of the absolute differences of their Cartesian coordinates.

### Characteristics
- **Directional Movement:** It is based on how many moves east-west versus how many moves north-south are needed to reach the destination.
- **Grid-Based Utility:** Ideal for grid-based maps where movement is only allowed in orthogonal directions (like the streets of Manhattan).

### Example
In a city grid, where you can only move along streets (vertically or horizontally), the Manhattan distance would be the total number of blocks you have to traverse to reach the destination.

# Pancake Sorting Heuristic

## Concept
The Pancake Sorting problem is a playful yet complex problem in algorithm theory. Imagine you have a stack of pancakes of different sizes and the objective is to sort them in ascending order of size using the least number of flips.

## Heuristic Approach
- **Flip Technique:** You can only 'flip' the pancakes from any position, reversing the order from that position to the top.
- **Heuristic Measure:** The heuristic can be determined by the position of the "largest pancake" that is out of place. In your example, flipping from the 2nd pancake reorders the top two.

### Example
```
Initial State:
  _ _
_ _ _ _
_ _ _ _ _ _
_ _ _ _ _ _ _ _

After Flip from 2nd Pancake:
_ _ _ _
  _ _
_ _ _ _ _ _
_ _ _ _ _ _ _ _
```
The largest pancake out of place (pancake #2) determines the next flip.

## 3. Greedy Search

### Concept
Greedy search is a heuristic that makes the locally optimal choice at each step, with the hope of finding the global optimum.

### Characteristics
- **Speed:** It is fast and easy to implement.
- **Optimality:** Does not always guarantee the most optimal solution.

### Decision Factor
- **Speed vs. Accuracy:** When using greedy search, one must weigh the importance of finding a quick solution versus the most accurate or optimal solution.

### Example
In a maze-solving algorithm, the greedy approach would always take the path that appears to lead most directly towards the goal, without considering longer paths that might ultimately be faster.