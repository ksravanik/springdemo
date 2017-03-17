
package spring_package;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Add new fields for emailaddress and team
	public String emailAddress;
	public String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter method = setemailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach :inside setter method = setTeam");
		this.team = team;
	}

	// Create a no - arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach : no - arg Constructor");
	}
	
	// Our Setter Method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach - Inside setter method - setFortuneService ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise bowling and batting for an hour daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
