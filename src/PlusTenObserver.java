
public class PlusTenObserver extends Observer {

	public PlusTenObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Plus Ten : "
	+(subject.getState()+10));
	}

}
