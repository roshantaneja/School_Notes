---
tags:
  - MachineLearning
  - AI
  - homework
---

# mancalaPlayers.py

```python
from mancala import **

def roshan_player(p1side, p2side, player):
	maxDepth = 11 # adjust this as needed!
	
	alpha = -float('inf')
	beta = float('inf')
	_, bestMove = roshan_maximizer(p1side, p2side, player, maxDepth, alpha, beta)

	return bestMove



def roshan_minimizer(p1side, p2side, player, depth, alpha, beta):

	if isVictory(p1side, p2side) != "ongoing" or depth == 0:
		return roshan_evaluator(p1side, p2side, player), None
	
	all_moves = getAllPossibleMoves(p1side, p2side, player)
	
	best_score = float('inf')
	best_move = None

	for move in all_moves:
		p1sideNext = copySide(p1side)
		p2sideNext = copySide(p2side)
		makeMove(p1sideNext, p2sideNext, player, move)

		score, _ = maximizer(p1sideNext, p2sideNext, swapPlayer(player), depth-1, alpha, beta)

		if score < best_score:
			best_score = score
			best_move = move
		if score < beta:
			beta = score
		if beta <= alpha:
			break
	
	return best_score, best_move

def roshan_maximizer(p1side, p2side, player, depth, alpha, beta):

	if isVictory(p1side, p2side) != "ongoing" or depth == 0:
		return roshan_evaluator(p1side, p2side, player), None
	
	all_moves = getAllPossibleMoves(p1side, p2side, player)
	
	best_score = -float('inf')
	best_move = None

	for move in all_moves:
		p1sideNext = copySide(p1side)
		p2sideNext = copySide(p2side)
		makeMove(p1sideNext, p2sideNext, player, move)

		score, _ = minimizer(p1sideNext, p2sideNext, swapPlayer(player), depth-1, alpha, beta)

		if score > best_score:
			best_score = score
			best_move = move
		if score > alpha:
			alpha = score
		if beta <= alpha:
			break
	
	return best_score, best_move

def roshan_evaluator(p1side, p2side, player):
	if player == 1:
		my_side = p1side
		other_side = p2side
	else:
		my_side = p2side
		other_side = p1side
	
	# scale stones closer to the "end" of the board higher
	# and scale stones in the Mancala higher
	
	if isVictory(my_side, other_side) == player:
		return float('inf')
	if isVictory(my_side, other_side) == swapPlayer(player):
		return -float('inf')

	
	score = 0
	for i in range(6):
		score += my_side[i]*(i)
		score -= other_side[i]*(i)
	score += my_side[6]*10
	score -= other_side[6]*10

	return score
```