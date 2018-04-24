package jpu2016.dogfight.controller;

public class DogfightController {
private static final int TIME_SLEEP = 30;
	
	private IViewSystem viewSystem;
	private IDogfightModel dogfightModel;
	
	public DogfightController(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}

	@Override
	public void orderPerform(UserOrder userOrder) {
		
	}
	
	public void play() {
		
	}
	
	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}
	
	private void launchMissile(int player) {
		
	}
	
	private void gameLoop() {
		
	}

}
}
