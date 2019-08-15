public class Project {
    private String name;
    private String description;
  
    public Project() {
      this.name = "Chinese Finger Trap";
      this.description = "Much trap. Chinese Finger Trap.";
    }
  
    public String elevatorPitch() {
      return this.name + " : " + this.description;
    }
  
    public Project(String name) {
      this.name = name;
      this.description = "Much trap. Chinese Finger Trap.";
    }
  
    public Project(String name, String description) {
      this.name = name;
      this.description = description;
    }
  
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public String getDescription() {
      return description;
    }
  
    public void setDescription(String description) {
      this.description = description;
    }
  }