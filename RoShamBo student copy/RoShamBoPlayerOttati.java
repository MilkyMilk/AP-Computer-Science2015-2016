import java.util.*;
public class RoShamBoPlayerOttati extends RoShamBoPlayer
{
    
  double rock = 0; double scissors = 0;double paper = 0; double valueRock;double valuePaper;double valueScissors; int wins=0; int losses=0; 
    
  public RoShamBoPlayerOttati(String name)
    {
        super(name);
    }
    
    @Override
    public String makeMove()
    {
   List<String> moves = getOpponentMoves();
 int move = moves.size()%3;
 if (move == 2){
   if(moves.size()>1){
 if (moves.get(moves.size()-1).equals("scissors"))
 move++;
}
if (move == 1){
 if (moves.get(moves.size()-1).equals("paper")) 
 move++;

}
if (move == 0){
 if (moves.get(moves.size()-1).equals("rock"))
 move++;

}
move=move%3;
if (move == 0){
return "rock";
}
if (move == 1){
return "paper";
}
if (move == 2){
return "scissors";
}}
    return "paper"; 
    }
    
}
