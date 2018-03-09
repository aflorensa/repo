public class Cercle {
	public static void main(String[] args)throws IOException{
		Cercle c1 = new Cercle();
	}
	
private float x;
private float y;
//canvis
public Cercle(float xx, float yy){
	x=xx;
	y=yy;
}

public Cercle (){
this.x = 0;
this.y = 0;
}
public Cercle (Cercle c) {
	this.x = c.x;
	this.y = c.y;
}

//Setter & Getter
public void setX(float x) {
	this.x = x;
}

public void setY(float y) {
	this.y = y;  
}

public float getX() {
	return this.x;
}

public float getY() {
	return this.y;
}

public String toString() {
	return "x: "+this.getX()+ "\ny: "+this.getY()
}

public Boolean equals(Cercle c) {
	return x ==(c.getX()) && y ==(c.getY())
}
