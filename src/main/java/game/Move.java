package game;

public class Move {
    Player player;
    Cell cell;

    public Move(Player player, Cell cell){
        this.cell = cell;
    }
    public Cell getCell(){
        return cell;
    }

    public void setCell(int rowIndex, int colIndex){
        setCell(rowIndex, colIndex);
    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }


}


