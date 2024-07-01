package com.briansea.ai;

import com.briansea.gamecabinet.game.Game;
import com.briansea.gamecabinet.game.Move;
import com.briansea.gamecabinet.game.Player;
import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoshanCheckers extends Player {
    private MMNode node;
    public RoshanCheckers(){
        this.nameProperty().set("RoshanCheckers");
    }
    @Override
    public void makeMove(Game gamestate, List<Move> move){
        node = new MMNode(gamestate, move, true);
        List<List<Move>> validMoves = gamestate.getValidMoves();
        int alpha = Integer.MIN_VALUE;
        int beta = Integer.MAX_VALUE;
        alpha = node.alphaBeta(alpha, beta, 5);
        for (List<Move> m: validMoves){
            move.add(m);
        }



//        Random r = new Random();
//        int pick = r.nextInt(validMoves.size());
//        for( Move m : validMoves.get(pick)) {
//            move.add(m);
//        }
    }
    private class MMNode{
        private static int INFINITY = Integer.MAX_VALUE;
        private boolean maximize;
        private Game state;
        private List<Move> move;
        private ArrayList<MMNode> children;
        private int value;
        Random rand;
        public MMNode(Game state, List<Move> move, boolean maximize){
            this.state = state;
            this.children = new ArrayList<MMNode>();
            this.move = move;
            this.rand = new Random();

        }

        private int score() {
            return rand.nextInt(100) * state.getScore(state.getPlayer(state.whoseTurn()));

        }

        public int alphaBeta(int alpha, int beta, int depth){
            if (depth == 0){
                value = score();
                return value;
            }
            depth--;
            //create children from all available moves
            List<List<Move>> validMoves = state.getValidMoves();
            for (List<Move> move : validMoves){
                Game childState = state.deepCopy();
                childState.makeMove(move);
                children.add(new MMNode(childState, move, !maximize));
            }
            if (maximize){
                int bestScore = -INFINITY;
                for (MMNode child : children){
                    int score = child.alphaBeta(alpha, beta, depth);
                    bestScore = Math.max(bestScore, score);
                    alpha = Math.max(alpha, bestScore);
                    if (beta <= alpha){
                        break;
                    }
                }
                return bestScore;
            } else {
                int bestScore = INFINITY;
                for (MMNode child : children){
                    int score = child.alphaBeta(alpha, beta, depth);
                    bestScore = Math.min(bestScore, score);
                    beta = Math.min(beta, bestScore);
                    if (beta <= alpha){
                        break;
                    }
                }
                return bestScore;
            }
        }
    }
}
