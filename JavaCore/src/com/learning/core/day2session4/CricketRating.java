package com.learning.core.day2session4;

public class CricketRating {
	
	private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;
    
    
	public CricketRating(String playerName, float critic1, float critic2) {
		super();
		this.playerName = playerName;
		this.critic1 = critic1;
		this.critic2 = critic2;
	}


	public CricketRating(String playerName, float critic1, float critic2, float critic3) {
		super();
		this.playerName = playerName;
		this.critic1 = critic1;
		this.critic2 = critic2;
		this.critic3 = critic3;
	}
	
	public void calculateAverageRating() {
        avgRating = (critic1 + critic2) / 2;
    }

    public void calculateAverageRatingWithThreeCritics() {
        avgRating = (critic1 + critic2 + critic3) / 3;
    }

    public String calculateCoins() throws NotEligibleException {
        if (avgRating >= 7) {
            coins = "Gold Coin";
        } else if (avgRating >= 5) {
            coins = "Silver Coin";
        } else if (avgRating >= 2) {
            coins = "Copper Coin";
        } else {
            throw new NotEligibleException("Not Eligible.");
        }
        return coins;
    }

    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Average Rating: " + avgRating);
        System.out.println("Coins: " + coins);
    }
    
    

}
