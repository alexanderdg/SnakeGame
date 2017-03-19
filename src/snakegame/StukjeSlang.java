package snakegame;

public class StukjeSlang {
	
	private int xpos;
	private int ypos;
	private StukjeSlang next;
	
	public StukjeSlang(int x, int y) {
		this.xpos = x;
		this.ypos = y;
	}
	
	public int getx(){
		return xpos;
	}
	
	public int gety(){
		return ypos;
	}
	
	public void setNext(StukjeSlang volgendStukje){
		next = volgendStukje;
	}
	
	public StukjeSlang next(){
		return next;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof StukjeSlang){
			StukjeSlang that = (StukjeSlang) obj;
			return (this.xpos == that.xpos && this.ypos == that.ypos && this.next == that.next);
					
		}
		return false;
	}
	

}
