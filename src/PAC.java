import java.util.Scanner;
public class PAC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int UserChoice=0;
		RPS RPS1=new RPS();

		System.out.println("Welcome to PAC  (Program and Control) Do not input any letters or numbers that are not shown as choices (Ie 1. 2. 3.) If you do not follow our rules you will lose. ");
		System.out.println("1.Begin\n2.Newspeak Dictionary ");
		UserChoice=in.nextInt();
		in.nextLine();


		if (UserChoice == 1){
			System.out.println("You are working for INGSOC in Oceania, you are meant to weed out traitors to the party, remember");
			System.out.println("WAR IS PEACE");
			System.out.println("FREEDOM IS SLAVERY");
			System.out.println("IGNORANCE IS STRENGTH");
			System.out.println("1.Start");
			System.out.println("2. I refuse to work with big brother and participate in his lies!");

			UserChoice=in.nextInt();
			in.nextLine();			
			if (UserChoice==1) {
				System.out.println("You wake up and get out of your bed");
				System.out.println("1. Write your targets in a journal \n2. Walk to the miniplenty");
				UserChoice=in.nextInt();
				in.nextLine();			
				if (UserChoice==1) {
					System.out.println("You open your journal and read what looks like a new entry, at the top of the page it shows your name and under that it says 'unperson: Doubleplus Ungood.Status: Soon to be vaporized' \nSuddenly you hear loud combat boots and then you realize what you've done");   
					System.out.println("Game Over!");
					System.out.println("Even with nothing written in it, it was a compromising possession.(1984 by George Orwell)");

				}if (UserChoice==2) {
					System.out.println("You walk out of your home towards miniplenty, you see that bb has increased chocolate rations by 50%, although you remember you used to get two full bars and now you only get one. \nYou see one of your co-workers, Leon ");
					System.out.println("1. *walk with Leon* \n2. *walk alone* ");
					UserChoice=in.nextInt();
					in.nextLine();			

					if (UserChoice==1||UserChoice==2) {
						System.out.println("'Hey' Says Leon who you realize walked towards you, 'How's it going Polizia' \n1. Plusgood \n2. Double Plusgood");
						UserChoice=in.nextInt();
						in.nextLine();

						if (UserChoice==1||UserChoice==2) {
							System.out.println("Well that's great, let's get to work. \n1. Head to your desk  ");
							UserChoice=in.nextInt();
							in.nextLine();
						}if (UserChoice==1) {
							System.out.println("Your Job is to 'fix' the numbers so that bb's glorious gains are shown.\n1.Fudge the numbers\n2.Tell the truth");
							UserChoice=in.nextInt();
							in.nextLine();
							if (UserChoice==1) {
								System.out.println("You are lying to the people! In your mind you convince yourself it's okay until you lie again. THE CYCLE ALWAYS CONTINUES.\n1.Stop the cycle.\n2.Continue the cycle");
								UserChoice=in.nextInt();
								in.nextLine();
								if (UserChoice==1) {
									System.out.println("You go to the roof of miniplenty climb the radio tower and jump to your death,\nin your last moments you were an ownlife but at least you stopped the 'cycle'");
								}if (UserChoice==2) {
									System.out.println("You decide to go down and take stock of the rations to clear your mind and suddenly you discover Leon taking rations and putting them into his coat. 'Please don't report me' begs Leon 'I must feed the rebels'\n1. Report Leon\n2. Don't report Leon ");             
									UserChoice=in.nextInt();
									in.nextLine();
									if (UserChoice==1) {
										System.out.println("The thought police walk in and they arrest Leon, you know exactly what will happen to him, the two soldiers come up to you and say 'HEIL INGSOC!'\n1.Heil INGSOC 2.*Spit*");
										UserChoice=in.nextInt();
										in.nextLine();
										if (UserChoice==1) {
											System.out.println("'Come with us' one of the soldiers says 'bb wants to see you.' 'Hello Policia, Kill him' He says as he hands you a gun and points at Leon 'No please!' Screams Leon 'Don't do it!\n1.Kill Leon\n2.Kill bb  ");
											UserChoice=in.nextInt();
											in.nextLine();
											if(UserChoice==1) {
												System.out.println("Your loyalty to the party has been proven which is why I want you to replace me as bb, glory to the party Polizia or should I say bb\nGame Over!");
											}if (UserChoice==2) {
												System.out.println("You shoot bb it's a painless death but still a death nonetheless.\nThe anarchy that follows involves a Eurasia funded rebellion and eventually leads to the complete collapse of Oceania,\nthe resulting confusion allowed Eurasia and Eastasia to quickly split the territories of the empire\nGame Over!");                                                                    
											}if (UserChoice!=1&&UserChoice!=2) {
												System.out.println("We warned you what would happen if you stray from the path \nGame Over!");
											}
										}if (UserChoice==2) {
											System.out.println("'Okay have it your way' Says the guard and then he shoots you.\nGame Over!");
										}
									}if (UserChoice==2) {
										System.out.println("Guards capture you and you are about to be executed\n1.Beg for your life\n2.Accept death");
										UserChoice=in.nextInt();
										in.nextLine();
										if (UserChoice==1) {
											System.out.println("'Die Scum!'\nGame Over!");
										}if (UserChoice==2) {
											System.out.println("You go out honourably\nGame Over!");

											//Game Over due to inputing incorrect input
										}if (UserChoice!=1&&UserChoice!=2) {
											System.out.println("We warned you what would happen if you stray from the path \nGame Over!");
										}
									}if (UserChoice!=1&&UserChoice!=2) {
										System.out.println("We warned you what would happen if you stray from the path \nGame Over!");
									}
								}if (UserChoice!=1&&UserChoice!=2) {
									System.out.println("We warned you what would happen if you stray from the path \nGame Over!");
								}
						
							}if (UserChoice==2) {
								System.out.println("'Hurry' says Leon 'Come with me!\n1.Go with Leon\n2.Don't go with Leon");
								UserChoice=in.nextInt();
								in.nextLine();
								if(UserChoice==1) {
									System.out.println("You run out of Miniplenty and go to the edge of town into a small trinket shop 'Let's play an old game'");
									RPS1.runProgram();
									System.out.println("Just as your game ends the sound of combat boots and gunshots floods the building,\nyou send out a message through a loud speaker before they reach your location,\nsuddenly the door busts open and you are vaporized.\nAfter your death a revoulution began and a democracy began.\nThat democracy stopped the endless wars and got rid of the other authoritarian governments in the east\nGame Over!");                                 
								}if (UserChoice==2) {
									System.out.println("Both you and Leon are vaporized for your crimes\nGame Over!");
									
									//Game Over due to inputing incorrect input
								}if (UserChoice!=1&&UserChoice!=2) {
									System.out.println("We warned you what would happen if you stray from the path \nGame Over!");
									System.exit(0);
								}
							}if (UserChoice!=1&&UserChoice!=2) {
								System.out.println("We warned you what would happen if you stray from the path \nGame Over!");
								System.exit(0);
							}
						}if (UserChoice!=1&&UserChoice!=2) {
							System.out.println("We warned you what would happen if you stray from the path \nGame Over!");
							System.exit(0);
						}
					}if (UserChoice!=1) {
						System.out.println("We warned you what would happen if you stray from the path \nGame Over!");
						System.exit(0);
					}
				}if (UserChoice!=1&&UserChoice!=2) {
					System.out.println("We Warned You what would happen if you stray from the path \nGame Over!");
					System.exit(0);
				}
			
			}if (UserChoice==2) {
				System.out.println("'Very well then, prepare to experience the worst pain ever.'  The party finds everyone you've ever associated with and executes them before you. \nThey force you to watch the life withering from their eyes");
				System.out.println("Game Over!");
				System.exit(0);
			}if(UserChoice!=1&&UserChoice!=2) {
				System.out.println("We warned you what would happen if you stray from the path \nGame Over!");
				System.exit(0);
			}
			System.exit(0);
			//Dictionary of Newspeak
		}if (UserChoice==2) {
			System.out.println("bb - Big Brother - Similar to America's \"Uncle Sam\", except this individual is the leader – possibly a fictional\r\n" + 
					"leader – of the nation. In Oceania, Big Brother is worshiped almost as if he were a god. He represents\r\n" + 
					"the omnipresence of the government. ");
			System.out.println("Doubleplus - A prefix used to create the superlative form of an adjective or adverb. (i.e. - pluscold and\r\n" + 
					"doublepluscold meant, respectively, 'very cold' and 'superlatively cold'.");
			System.out.println("Ingsoc - English Socialism");
			System.out.println("Miniplenty - Ministry of Plenty (rationing). The Ministry of Plenty controlled the entire economy");
			System.out.println("Newspeak - The official language of Oceania. Newspeak is \"politically correct\" speech taken to its\r\n" + 
					"maximum extent. Newspeak is based on standard English, but all words describing \"unorthodox\"\r\n" + 
					"political ideas have been removed. In addition, there was an attempt to remove the overall number of\r\n" + 
					"words in general, to limit the range of ideas that could be expressed.\r\n" + 
					"");
			System.out.println("Oceania - One of the three superstates. (Political System: Ingsoc) Winston Smith's home. Comprised of\r\n" + 
					"North and South America, Britain, Australia, and southern portions of Africa. Newspeak is the official\r\n" + 
					"language of Oceania, but standard English is still spoken by many. ");
			System.out.println("Oldspeak - Standard English. Newspeak is based on Oldspeak, with all words which represent unpopular\r\n" + 
					"(or politically incorrect) ideas removed.");
			System.out.println("Ownlife - Individualism and eccentricity. A desire to do something for your own benefit. (i.e. hobbies,\r\n" + 
					"ownership of property, love, or any other thoughtcrime)\r\n" + 
					"");
			System.out.println("Unperson - Person that has been erased from existence by the government for breaking the law in some\r\n" + 
					"way. A unperson is completely erased from history. All records of their existence is removed from\r\n" + 
					"record, and all party members are expected to removed them from memory. To mention their name is\r\n" + 
					"considered thoughtcrime. This eliminates any possibility of martyrdom");
			System.out.println("Vaporized - The act of being executed by the state, and having all records of your existence erased.\r\n" + 
					"Becoming an unperson.\r\n" + 
					"");
			System.out.println("");
		}else {
			System.out.println("We warned you what would happen if you stray from the path \nGame Over!");
			System.exit(0);
		}
	}
}


