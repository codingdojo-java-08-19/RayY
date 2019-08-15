class Gorilla extends Mammal {

    public void announcePresence() {
      System.out.println("Oog!");
    }
  
    public void throwSomething() {
      energyLevel = energyLevel - 5;
      System.out.println("Ahh! (-5 energy) New Energy: " + energyLevel);
    }
  
    public void eatBananas() {
      energyLevel = energyLevel + 10;
      System.out.println("... (+10 energy) New Energy: " + energyLevel);
    }
  
    public void climb() {
      energyLevel = energyLevel - 10;
      System.out.println("Hmph! (-10 energy) New Energy: " + energyLevel);
    }
  }