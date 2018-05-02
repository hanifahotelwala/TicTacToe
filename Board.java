
/**
 * Sets up the board/ makes changes based on user inputs/ checks for wins
 * 
 * @Hanifa Hotelwala
 * @version 1.0
 */
public class Board
{

    private int dimensions; 
    public char[][] board; 
    Pieces pieces = new Pieces(); 

    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        dimensions = 3; 
        board = new char[dimensions][dimensions]; 
    }

   
    public char[][] getboard()
    {
        return board; 
    }

    /**
     * Draws board 
     */

    public void drawboard()
    { int count = 0; 
        for(int x=0; x< dimensions; x++)
        {
            for(int y=0; y<dimensions; y++)
            {
                board[x][y] = '/';
                System.out.print("_");  
                System.out.print(board[x][y]); 
                System.out.print("_|"); 
                count++; 
                if (count%3 ==0)
                    System.out.println(); 

            }
        }
    }

 
    public void playBoard(int xaxis, int yaxis, char piece)
    {
        int count =0;

        if(checkBoard(xaxis, yaxis) == true)
        {
            board[xaxis][yaxis] = piece; 

            for(int x=0; x<dimensions; x++)
            {
                for(int y=0; y<dimensions; y++)
                {
                    System.out.print("_");  
                    System.out.print(board[x][y]); 
                    System.out.print("_|"); 
                    count++; 
                    if (count%3 ==0)
                        System.out.println(); 
                }
            }
        }

    }

    public boolean checkBoard(int xaxis, int yaxis)
    {
        
        return (board[xaxis][yaxis] == '/');
    }

    /*
     * checks for win
     */
    public boolean checkWin(String p1, String p2)
    {
        int count=0; 
        int count1=0; 
        int check=0; 
        for(int x=0; x<dimensions; x++)
        { 
            
            for(int y=0; y<dimensions; y++)
            {
                if(board[x][y] == pieces.getx())
                {
                    count++; 
                }
                if(board[x][y] == pieces.geto())
                {
                    count1++; 
                }
            }
            
            if (count ==3)
            {
                System.out.println("\n"+p1+" WINS!");
                return true; 
               
            }
            if (count1 == 3)
            {
                System.out.println("\n"+p2+" WINS!" );
                return true; 
               
            }
            
            count =0; 
            count1 =0;

        }
        for(int y =0; y<dimensions; y++)
        {
        for (int x=0; x< dimensions; x++)
        {
            if (board[x][y] == pieces.getx())
            {
                count++;
            }
            if (board[x][y] == pieces.geto())
            {
                count1++; 
            }
        
          
        }
          
            if (count == 3)
             {System.out.println("\n"+p1+" WINS!"); 
                return true; 
            }
            if (count1==3)
            {System.out.println("\n"+p2+" WINS!"); 
                return true; 
            }
            
            
            count=0; 
            count1=0; 
        }
        
        if (board[0][0]== pieces.getx() && board[1][1] == pieces.getx() && board[2][2]== pieces.getx() ) 
            {System.out.println("\n"+p1+" WINS!"); 
                return true; }
        if (board[0][0] == pieces.geto() && board[1][1] == pieces.geto() && board[2][2] == pieces.geto() ) 
            { System.out.println("\n"+p2+" WINS!"); 
                return true; }
        if (board[0][2] == pieces.getx() && board[1][1] == pieces.getx() && board[2][0]== pieces.getx())
           { System.out.println("\n"+p1+" WINS!"); 
               return true; }
        if (board[0][2] == pieces.geto() && board[1][1] == pieces.geto() && board[2][0] == pieces.geto()) 
          {  System.out.println("\n"+p2+" WINS!"); 
              return true; }
            
            
              
              
         for(int x=0; x<dimensions; x++)
         {
             for(int y=0; y<dimensions; y++)
             {
                 if(board[x][y] !='/')
                 check++; 
                }
            }
            
            if (check == 9)
            { System.out.println("\n Board is FULL! No win"); 
                return true; 
            }
               
           return false;  
            
    }

}
