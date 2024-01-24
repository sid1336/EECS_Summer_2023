package lab5;

/**
 * 
 * <p>Computational thinking for a software developer/computer programmer 
 * is a critical skill that is consistently applied. This lab requires you 
 * to develop a solution using Java object-oriented programming 
 * that simulates a basketball shootout game. </p>
 * <p>Two players agree to limit the number of ball throw attempts to 3 throws each. 
 * The first player will make all three throw attempts 
 * (keep track of the successful baskets made where the ball goes into the basket). </p>
 * <p> After the first player completes all three shots, 
 * the second player will make all three throw attempts. 
 * The player who makes the most baskets (gets the ball in the hoop) will be declared the winner. 
 * In the case of a tie, the tie counter is incremented by one. 
 * Then, the game is repeated until a winner can be determined. 
 * Note that the game can be repeated many times.</p>
 * <p> The losing player of the shootout game will have to give the winning player a move ticket(s). 
 * The number of movie tickets is determined by the total number of baskets made by the winner, 
 * less the total number of baskets made by the losing player. </p>
 * <p> The losing player gives half of a movie ticket for every tied game (if there were any tied games). </p>
 * <p> If the final calculated number of movie tickets has a decimal value, it should be rounded to 
 * the nearest whole number since you can't purchase half a ticket!</p>
 * <p> Example: If the player1 made a total of 3 baskets, and player2 made a total of 2, 
 * and they had three tied games, the number of movie tickets would initially be {@code 3-2=1}, 
 * but increased by {@code 3 x 0.5=1.5}, making the owed number of tickets {@code 2.5} which must be 
 * rounded up to 3 movie tickets.</p>

 * 
 * <p> Requirements: - Any use of Java library classes or methods (e.g., ArrayList,
 * System.arraycopy) is forbidden. (That is, there must not be an import
 * statement in the beginning of this class.) Violating this requirement will
 * result in a 70% penalty of your marks.</p>
 * <p>
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g.,
 * int[], String[]).
 * </p>
 */

public class Game {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	/**
	 * Two players agree to limit the number of ball throw attempts to 3 throws
	 * each. Constant value
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private final static int NUMOFATTEMPT = 3;

	/**
	 * The player1name is used to store the player name. The default value will be
	 * used if the name is not given to the player
	 * <p>
	 * The default value is <strong> <code>Unknown</code></strong>
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private String player1Name;

	/**
	 * The player2name is used to store the player name. The default value will be
	 * used if the name is not given to the player
	 * <p>
	 * The default value is <strong> <code>Unknown</code></strong>
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private String player2Name;

	/**
	 * The player1Attempt array is dynamically allocated at run time to store the
	 * result from player1 attempts
	 * <p>
	 * The default value is <strong> <code>false</code></strong> for each attempt
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private boolean[] player1Attempt;
	/**
	 * The player2Attempt array is dynamically allocated at run time to store the
	 * result from player2 attempts
	 * <p>
	 * The default value is <strong> <code>false</code></strong> for each attempt
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private boolean[] player2Attempt;

	/**
	 * The numberofTie is a counter to keep track of the number of tie games.
	 * <p>
	 * The default value is <strong> <code>zero</code></strong> before starting the
	 * game
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private int numberofTie;

	/**
	 * String Status keeps track of the current situation or status of the game.
	 * <p>
	 * This string changes during the game to reflect the game status.
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private String status;

	// 
	
	// 
		/*  Your implementation starts here
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */

	

public Game()
	{
		this.player1Attempt = new boolean[3];
		this.player2Attempt = new boolean[3];
		this.numberofTie = 0;
		this.player1Name = "Unknown";
		this.player2Name = "Unknown";
		this.status = "The game was initialized with unknown players";
		
	}
	
	public Game(String player1, String player2)
	{
		this.player1Name = player1;
		this.player2Name = player2;
		
		if(this.player1Name.equals(""))
		{
			this.player1Name = "Unknown";
		}
		
		if(this.player2Name.equals(""))
		{
			this.player2Name = "Unknown";
		}
		this.player1Attempt = new boolean[3];
		this.player2Attempt = new boolean[3];
		this.numberofTie = 0;
		
		this.status = String.format("The game was initialized with player1(%s) and player2(%s)", this.player1Name, this.player2Name);
	}
	
	public String getPlayer1Name()
	{
		return this.player1Name;
	}
	
	public String getPlayer2Name()
	{
		return this.player2Name;
	}
	
	public boolean[] getPlayer1Attempt()
	{
		return this.player1Attempt;
	}
	public boolean[] getPlayer2Attempt()
	{
		return this.player2Attempt;
	}

	public String getGameStatus()
	{
		return this.status;
	}
	
	public void setPlayer1Name(String player1)
	{
		this.status = "Player1 name is set";
		this.player1Name = player1;
		
		
	}
	
	public void setPlayer2Name(String player2)
	{
		this.status = "Player2 name is set";
		this.player2Name = player2;
	}
	
	public void setPlayer1AttempttoSucess(int attempt)
	{
		if (0<= attempt && attempt <=2)
		{
			this.player1Attempt[attempt] = true;
			this.status = String.format("Player1 score attempt number (%d)", attempt);
		}
	}
	
	public void setPlayer1AttempttoFail(int attempt)
	{
		if (0<= attempt && attempt <=2)
		{
			this.player1Attempt[attempt] = false;
			this.status = String.format("Player1 fail to score attempt number (%d)", attempt);
		}
	}
	
	public void setPlayer2AttempttoSucess(int attempt)
	{
		if (0<= attempt && attempt <=2)
		{
			this.player2Attempt[attempt] = true;
			this.status = String.format("Player2 score attempt number (%d)", attempt);
		}
	}
	
	public void setPlayer2AttempttoFail(int attempt)
	{
		if (0<= attempt && attempt <=2)
		{
			this.player2Attempt[attempt] = false;
			this.status = String.format("Player2 fail to score attempt number (%d)", attempt);
		}
	}
	
	public int getNoofMovieTicket()
	{
		int goalsPlayer1= 0;
		int goalsPlayer2 =0;
		double Tickets;
		
		for (int i = 0; i < Game.NUMOFATTEMPT; i++)
		{
			if(this.player1Attempt[i])
			{
				goalsPlayer1++;
			}
			if(this.player2Attempt[i])
			{
				goalsPlayer2++;
			}
		}
		
		if(goalsPlayer1 == goalsPlayer2)
		{
			this.numberofTie++;
			this.status = String.format("The game is tied with no winner. Player1(%d)==Pleyer2(%d). Reset the game.", goalsPlayer1, goalsPlayer2);
			return 0;
		}
		else
		{
			Tickets = Math.abs(goalsPlayer1-goalsPlayer2);
			if(this.numberofTie > 0)
			{
				Tickets += this.numberofTie*0.5;
				Tickets = Math.ceil(Tickets);
			}
			if (goalsPlayer1 > goalsPlayer2)
			{
				this.status = String.format("Player1 won the game. Player2 should pay (%d) movie tickets.", (int)Tickets);
				
			}
			else 
			{
				this.status = String.format("Player2 won the game. Player1 should pay (%d) movie tickets.", (int)Tickets);
			}
			return (int)Tickets;
		}
		
	}
	
}
//package lab5;
//
//public class Game {
//    private final static int NUMOFATTEMPT = 3;
//    private String player1Name;
//    private String player2Name;
//    private boolean[] player1Attempt;
//    private boolean[] player2Attempt;
//    private int numberofTie;
//    private String status;
//
//    public Game() {
//        this.player1Attempt = new boolean[NUMOFATTEMPT];
//        this.player2Attempt = new boolean[NUMOFATTEMPT];
//        this.numberofTie = 0;
//        this.player1Name = "Unknown";
//        this.player2Name = "Unknown";
//        this.status = "The game was initialized with unknown players";
//    }
//
//    public Game(String player1, String player2) {
//        this.player1Name = (player1.equals("")) ? "Unknown" : player1;
//        this.player2Name = (player2.equals("")) ? "Unknown" : player2;
//        this.player1Attempt = new boolean[NUMOFATTEMPT];
//        this.player2Attempt = new boolean[NUMOFATTEMPT];
//        this.numberofTie = 0;
//        this.status = String.format(
//            "The game was initialized with player1(%s) and player2(%s)",
//            this.player1Name,
//            this.player2Name
//        );
//    }
//
//    public String getPlayer1Name() {
//        return this.player1Name;
//    }
//
//    public String getPlayer2Name() {
//        return this.player2Name;
//    }
//
//    public boolean[] getPlayer1Attempt() {
//        return this.player1Attempt;
//    }
//
//    public boolean[] getPlayer2Attempt() {
//        return this.player2Attempt;
//    }
//
//    public String getGameStatus() {
//        int player1Score = getNumberofSucess(0);
//        int player2Score = getNumberofSucess(1);
//
//        if (player1Score == player2Score) {
//            return String.format("The game is tied with no winner. Player1(%d)==Player2(%d). Reset the game.",
//                    player1Score, player2Score);
//        } else if (player1Score > player2Score) {
//            return String.format("Player1 won the game. Player2 should pay (%d) movie tickets.", player1Score - player2Score);
//        } else {
//            return String.format("Player2 won the game. Player1 should pay (%d) movie tickets.", player2Score - player1Score);
//        }
//    }
//
//    public void setPlayer1Name(String player1) {
//        this.status = "Player1 name is set";
//        this.player1Name = player1;
//    }
//
//    public void setPlayer2Name(String player2) {
//        this.status = "Player2 name is set";
//        this.player2Name = player2;
//    }
//
//    public void setPlayer1AttempttoSucess(int attempt) {
//        if (attempt >= 0 && attempt < NUMOFATTEMPT) {
//            this.player1Attempt[attempt] = true;
//            this.status = String.format("Player1 score attempt number (%d)", attempt);
//        }
//    }
//
//    public void setPlayer1AttempttoFail(int attempt) {
//        if (attempt >= 0 && attempt < NUMOFATTEMPT) {
//            this.player1Attempt[attempt] = false;
//            this.status = String.format("Player1 fail to score attempt number (%d)", attempt);
//        }
//    }
//
//    public void setPlayer2AttempttoSucess(int attempt) {
//        if (attempt >= 0 && attempt < NUMOFATTEMPT) {
//            this.player2Attempt[attempt] = true;
//            this.status = String.format("Player2 score attempt number (%d)", attempt);
//        }
//    }
//
//    public void setPlayer2AttempttoFail(int attempt) {
//        if (attempt >= 0 && attempt < NUMOFATTEMPT) {
//            this.player2Attempt[attempt] = false;
//            this.status = String.format("Player2 fail to score attempt number (%d)", attempt);
//        }
//    }
//
//    public int getNoofMovieTicket() {
//        int goalsPlayer1 = 0;
//        int goalsPlayer2 = 0;
//        double Tickets;
//
//        for (int i = 0; i < NUMOFATTEMPT; i++) {
//            if (this.player1Attempt[i]) {
//                goalsPlayer1++;
//            }
//            if (this.player2Attempt[i]) {
//                goalsPlayer2++;
//            }
//        }
//
//        if (goalsPlayer1 == goalsPlayer2) {
//            this.numberofTie++;
//            this.status = String.format(
//                "The game is tied with no winner. Player1(%d)==Player2(%d). Reset the game.",
//                goalsPlayer1,
//                goalsPlayer2
//            );
//            return 0;
//        } else {
//            Tickets = Math.abs(goalsPlayer1 - goalsPlayer2);
//            if (this.numberofTie > 0) {
//                Tickets += this.numberofTie * 0.5;
//            }
//            Tickets = Math.ceil(Tickets);
//
//            if (goalsPlayer1 > goalsPlayer2) {
//                this.status = String.format(
//                    "Player1 won the game. Player2 should pay (%d) movie tickets.",
//                    (int) Tickets
//                );
//            } else {
//                this.status = String.format(
//                    "Player2 won the game. Player1 should pay (%d) movie tickets.",
//                    (int) Tickets
//                );
//            }
//            return (int) Tickets;
//        }
//    }
//}
