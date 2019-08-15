class ProjectTest {
    public static void main(String[] args) {
      Project p = new Project();
      System.out.println(p.getName());
      System.out.println(p.elevatorPitch());
      p.setName("Chinese Finger Trap v2");
      System.out.println(p.getName());
      p.setDescription("Such Stuck. Chinese Finger Trap More.");
      System.out.println(p.getDescription());
      System.out.println(p.elevatorPitch());
  
      Project p2 = new Project("Chinese Toe Trap", "Wow. Chinese Toe Trap.");
      System.out.println(p2.getName());
      System.out.println(p2.elevatorPitch());
    }
  }