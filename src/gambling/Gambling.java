package gambling;

public class Gambling {

	    public static final int INITIAL_BET_STAKE = 100;
	    public static final int BET_AMT = 1;
	    public void gamblingSituationProblemUC2(){
	        double random_num = Math.random();
	        int remg_amt = INITIAL_BET_STAKE;
	        if (random_num>0.5){
	            remg_amt += BET_AMT;
	            System.out.println("The Gambler wins the bet and he has $"
	            +remg_amt+ " with him after one bet.");
	        }else if (random_num<=0.5){
	            remg_amt -= BET_AMT;
	            System.out.println("The Gambler loses the bet and he has $"
	            +remg_amt+ " with him after one bet.");
	        }
	    }
	    public void gamblingSituationProblemUC3(int margin_perct){
	        double uppr_margin = INITIAL_BET_STAKE + margin_perct*INITIAL_BET_STAKE/100;
	        double lowr_margin = INITIAL_BET_STAKE - margin_perct*INITIAL_BET_STAKE/100;
	        double avail_amt = INITIAL_BET_STAKE;
	        while ((avail_amt<uppr_margin) && (avail_amt>lowr_margin)){
	            double random_num = Math.random();
	            if (random_num>0.5){
	                avail_amt += BET_AMT;
	            }else if (random_num<=0.5){
	                avail_amt -= BET_AMT;
	            }
	        }
	        System.out.println("The gambler resigns for the day after he has $"
	        + avail_amt + " with him.");
	    }
	    public void gamblingSituationProblemUC4(){
	        int NO_OF_BETS = 100;
	        double uppr_margin = 0.5*INITIAL_BET_STAKE;
	        double lowr_margin = -0.5*INITIAL_BET_STAKE;
	        double tot_amt_won_lost = 0;
	        for (int i=0;i<20;i++){
	            double daily_amt_won_lost = 0;
	            int bets_played = 0;
	            while ((daily_amt_won_lost<uppr_margin) && (daily_amt_won_lost>lowr_margin)
	                    && (bets_played < NO_OF_BETS)){
	                double random_num = Math.random();
	                bets_played++;
	                if (random_num>0.5){
	                    daily_amt_won_lost += BET_AMT;
	                }else if (random_num<=0.5){
	                    daily_amt_won_lost -= BET_AMT;
	                }
	            }
	            tot_amt_won_lost += daily_amt_won_lost;
	        }
	        if (tot_amt_won_lost>0){
	            System.out.println("The total amount won in 20 days = "+ tot_amt_won_lost);
	        }
	        else if (tot_amt_won_lost==0){
	            System.out.println("There is no net gain in last 20 days");
	        }
	        else if (tot_amt_won_lost<0){
	            System.out.println("The total amount lost in last 20 days = "+ Math.abs(tot_amt_won_lost));
	        }
	    }
	public void gamblingSituationProblemUC5(){
	        int NO_OF_BETS = 100;
	        double uppr_margin = 0.5*INITIAL_BET_STAKE;
	        double lowr_margin = -0.5*INITIAL_BET_STAKE;
	        double tot_amt_won_lost = 0;
	        for (int i=1;i<31;i++){
	            double daily_amt_won_lost = 0;
	            int bets_played = 0;
	                   while ((daily_amt_won_lost<uppr_margin) && (daily_amt_won_lost>lowr_margin)
	                    && (bets_played < NO_OF_BETS)){
	                double random_num = Math.random();
	                bets_played++;
	                if (random_num>0.5){
	                    daily_amt_won_lost += BET_AMT;
	                }else if (random_num<=0.5){
	                    daily_amt_won_lost -= BET_AMT;
	                }
	            }
	            if (daily_amt_won_lost>0){
	                System.out.println("The amount won on day "+ i + " = $"+daily_amt_won_lost);
	            }
	            else if (daily_amt_won_lost==0){
	                System.out.println("There is no net gain or loss on day "+ i);
	            }
	            else if (daily_amt_won_lost<0){
	                System.out.println("The amount lost on day "+ i + " = $" + Math.abs(daily_amt_won_lost));
	            }
	        }
	    }
	public void gamblingSituationProblemUC6(){
	        int NO_OF_BETS = 100;
	        double uppr_margin = 0.5*INITIAL_BET_STAKE;
	        double lowr_margin = -0.5*INITIAL_BET_STAKE;
	        int luck_day = 0;
	        double luck_day_amt = 0;
	        int unluck_day = 0;
	        double unluck_day_amt = 0;
	        for (int i=1;i<31;i++){
	            double daily_amt_won_lost = 0;
	            int bets_played = 0;
	            while ((daily_amt_won_lost<uppr_margin) && (daily_amt_won_lost>lowr_margin)
	                    && (bets_played < NO_OF_BETS)){
	                double random_num = Math.random();
	                bets_played++;
	                if (random_num>0.5){
	                    daily_amt_won_lost += BET_AMT;
	                }else if (random_num<=0.5){
	                    daily_amt_won_lost -= BET_AMT;
	                }
	            }
	            if (luck_day_amt<daily_amt_won_lost){
	                luck_day_amt = daily_amt_won_lost;
	                luck_day = i;
	            }
	            if (unluck_day_amt>daily_amt_won_lost){
	                unluck_day_amt = daily_amt_won_lost;
	                unluck_day = i;
	            }
	      }
	 System.out.println("The luckiest day for gambler is "+ luck_day +
	                    "th day, on which he won $"+luck_day_amt);
	            System.out.println(" And the unluckiest day for gambler is "+ unluck_day +
	                    "th day, on which he lost $"+Math.abs(unluck_day_amt));
	}
	    public void gamblingSituationProblemUC7(){
	        int NO_OF_BETS = 100;
	        double uppr_margin = 0.5*INITIAL_BET_STAKE;
	        double lowr_margin = -0.5*INITIAL_BET_STAKE;
	        double tot_amt_won_lost = 0;
	        for (int i=1;i<31;i++){
	            double daily_amt_won_lost = 0;
	            int bets_played = 0;
	            while ((daily_amt_won_lost<uppr_margin) && (daily_amt_won_lost>lowr_margin)
	                    && (bets_played < NO_OF_BETS)){
	                double random_num = Math.random();
	                bets_played++;
	                if (random_num>0.5){
	                    daily_amt_won_lost += BET_AMT;
	                }else if (random_num<=0.5){
	                    daily_amt_won_lost -= BET_AMT;
	                }
	            }
	            tot_amt_won_lost += daily_amt_won_lost;
	        }
	        if (tot_amt_won_lost>0){
	            double random_num1 = Math.random();
	            if (random_num1>0.5){
	                System.out.println("The gambler has won $"+ tot_amt_won_lost+
	                        " last month and he should play in this month too");
	            }
	            else if (random_num1<=0.5){
	                System.out.println("The gambler has won $"+ tot_amt_won_lost+
	                        " last month and he should stop gambling now.");
	            }
	        }
	        else if (tot_amt_won_lost<=0){
	                System.out.println("The gambler has lost in last month $" + Math.abs(tot_amt_won_lost)+
	                        " and to avoid further losses he should stop playing now.");
	        }
	    }
	    public static void main(String[] args){
	        Gambling gam = new Gambling();
	        gam.gamblingSituationProblemUC7();
	    }
	}

