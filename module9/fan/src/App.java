public class App {
    static class Fan {
        /*
         * 9.8 (The Fan class) Design a class named Fan to represent a fan. The class
         * contains:
         * 
         * Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
         * denote the fan speed.
         * A private int data field named speed that specifies the speed of the fan (the
         * default is SLOW).
         * A private boolean data field named on that specifies whether the fan is on
         * (the default is false).
         * A private double data field named radius that specifies the radius of the fan
         * (the default is 5).
         * A string data field named color that specifies the color of the fan (the
         * default is blue).
         * The accessor and mutator methods for all four data fields.
         * A no-arg constructor that creates a default fan.
         * A method named toString() that returns a string description for the fan.
         * If the fan is on, the method returns the fan speed, color, and radius in one
         * combined string.
         * If the fan is not on, the method returns the fan color and radius along with
         * the string “fan is off” in one combined string
         * 
         */

        //  provide basic parameters for the fan speeds
        int SLOW = 1;
        int MEDIUM = 2;
        int FAST = 3;
        
        private int speed = SLOW;
        private boolean isOn = false;
        private double radius = 5;
        String color = "blue";
    
        Fan() {
          this.speed = SLOW;
          this.isOn = false;
          this.radius = 5;
          this.color ="blue";
        }
    

        public int getSpeed() {
          return this.speed;
        }
    
        public boolean isOn() {
          return this.isOn;
        }
    
        public double getRadius() {
          return this.radius;
        }
    
        public String getColor() {
          return this.color;
        }
    
        public void setStatus(String status) {
          if (status.toLowerCase() == "off") {
            this.isOn = false;
          } else {
            this.isOn = true;
          }
    
        }
    
        public void setSpeed(int chosenSpeed) {
          this.speed = chosenSpeed;
        }
    
        public void setRadius(int chosenRadius) {
          this.radius = chosenRadius;
        }
    
        public void setColor(String chosenColor) {
          this.color = chosenColor;
        }
    
        public String toString() {
          String message = "";
          if (this.isOn) {
            message = "Fan Speed is "+this.speed+", the color is "+this.getColor()+" and the radius is "+this.getRadius();
          } else {
            message = "Fan is not on, however the color is "+this.getColor()+" and the radius is "+this.getRadius();
    
          }
          return message;
        }
    
        public static void main(String[] args) throws Exception {
          Fan medFan = new Fan();
          medFan.setSpeed(3);
          medFan.setRadius(10);
          medFan.setColor("yellow");
          medFan.setStatus("on");

          Fan minFan = new Fan();
          minFan.setColor("blue");
          minFan.setRadius(5);
          minFan.setStatus("off");

          System.out.println(medFan.toString());
          System.out.println(minFan.toString());

        }
      }
    }