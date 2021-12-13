import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
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
    line(width/2, (float) (height/1.66666667), (float) (width/1.6666667), (float) (height/1.538461));

    stroke(35, 92, 35);
    line((float) (width/2.66666667), (float) (height/1.81818181), width/2, height/2);

    stroke(35, 92, 35);
    fill(60, 179, 45);
    rect((float) (width*.45), height/2, width/10, (float) (height/2.66666667));

    stroke(0, 0, 0);
    fill(255,0,0);
    ellipse(width/2, (float) (height/2.66666667), (float) (width/2.66666667), (float) (height/2.66666667));

    stroke(0, 0, 0);
    fill(0, 0, 0);
    ellipse(width/2, (float) (height/2.66666667), (float) (width/6.15384615), (float) (height/6.15384615));

    stroke(0, 0, 0);
    fill(63, 122, 55);
    rect(width - width, (float) (height/1.14285714), width, height/8);
  }
  
  // define other methods down here.
}