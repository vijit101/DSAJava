package TicTacToeJavaproj;

public class PlayerData {
    public String Name;
    public char PlayerSymbol;
    private int winCount = 0;
    private int lostCount = 0;
    
    PlayerData(String name, char symbl){
        this.Name = name;
        this.PlayerSymbol = symbl;
    }
    PlayerData(){
        
    }

    public void IncreaseWinCount(){
        this.winCount++;
    }

    public void IncreaseLostCount(){
        this.lostCount++;
    }

    public int GetWinCount(){
        return this.winCount;
    }

    public int GetLostCount(){
        return this.lostCount;
    }
}
