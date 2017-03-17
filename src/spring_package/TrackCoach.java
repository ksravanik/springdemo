package spring_package;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Daily walk for an hour in the morning";
	}

	@Override
	public String getDailyFortune() {
		return "All The Best : " +fortuneService.getFortune();
	}

	// Add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }
    
    // Add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");        
    }
	
}
