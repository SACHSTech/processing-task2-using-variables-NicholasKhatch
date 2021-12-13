import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(204, 255, 249);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    stroke(35, 92, 35);
    line(200,240,240,260);

    stroke(35, 92, 35);
    line(150,220,200,200);

    stroke(35, 92, 35);
    fill(60, 179, 45);
    rect(180, 200, 40, 150);

    stroke(0, 0, 0);
    fill(255,0,0);
    ellipse(200,150,150,150);

    stroke(0, 0, 0);
    fill(0,0,0);
    ellipse(200,150,65,65);

    stroke(0, 0, 0);
    fill(63, 122, 55);
    rect(0,350,400,50);
  }
  
  // define other methods down here.
}