import java.util.Random;
import java.util.Scanner;

public class RPS {
	Scanner in=new Scanner(System.in);
	Random rnd=new Random();
	int playerScore=0;
	int compScore=0;
		 public void runProgram() {
			while (playerScore<=9&&compScore<=9) {
				System.out.println("1. Rock");
				System.out.println("2. Paper");
				System.out.println("3. Scissors");
				int name2=in.nextInt();
				in.nextLine();
				int randomNumber2=rnd.nextInt(3)+1;
				//Tie
				if (name2==randomNumber2) {
					System.out.println("Oh it's a tie. Your Score: "+playerScore+" Leon's Score: "+compScore);
					//Rock beats scissors
				}else if(randomNumber2==3&&name2==1){
					compScore=compScore+1;
					System.out.println("I win! Your Score: "+playerScore+" Leon's Score: "+compScore);
				}else if(randomNumber2==1&&name2==3){
					playerScore=playerScore+1;
					System.out.println("Nice! Your Score:  "+playerScore+" Leon's Score: "+compScore);					
					//All other possible outcomes 
				}else if(name2>randomNumber2){
					compScore=compScore+1;
					System.out.println("I win! Your Score:  "+playerScore+" Leon's Score: "+compScore);
				}else {
					playerScore=playerScore+1;
					System.out.println("Nice! Your Score:  "+playerScore+" Leon's Score: "+compScore);
				}

			}
			if (playerScore==10) {
				System.out.println("Nice, you won!");
			}else {
				System.out.println("I win!");
			}
			in.close(); 

		}

	}

