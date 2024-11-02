public class interfaces {
    public static void main(String[] args) {
        Queen obj =new Queen();
        obj.moves();
        
    }
    
}

interface chessplayer{
    void moves();
}

class Queen implements chessplayer{
    public void moves(){
        System.out.println("up down left right diagonal");
    }
}

class rook implements chessplayer{
    public void moves(){
        System.out.println("up down left right ");
    }
}
