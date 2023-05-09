import java.util.Scanner;
import java.util.Random;
public class Deadwood{

  public static class Start{
    private int players;

    Start(int num_players){
      /**
      * This method initializes the start of a new game with
      * the correct amount of players
      *
      **/

      players = num_players;

      String[] locations = {"Main Street", "Saloon", "General Store", "Jail", "Train Station", "Ranch", "Secret Hideout", "Bank", "Church", "Hotel"};
      int[] chips = {3, 2, 2, 1, 3, 2, 3, 1, 2, 3};
      for(int i = 0; i < locations.length; i++ ){
        Location location = new Location(locations[i], chips[i]);
        // System.out.println(location.name + ", " + location.chips);
      }
      System.out.println("All locations created.");


      if(players == 5){
        for (int i = 1; i <= players; i++) {
          Player player = new Player("Player " + i, 0, 0, 2);
          // System.out.println(player.name);
        }
      } else if (players == 6){
        for (int i = 1; i <= players; i++) {
          Player player = new Player("Player " + i, 0, 0, 4);
          // System.out.println(player.name);
        }
      } else if (players == 7 || players == 8){
        for (int i = 1; i <= players; i++) {
          Player player = new Player("Player " + i, 2, 0, 0);
          // System.out.println(player.name);
        }
      } else {
        for (int i = 1; i <= players; i++) {
          Player player = new Player("Player " + i, 0, 0, 0);
          // System.out.println(player.name);
        }
      }
      System.out.println("All players created.");

    }
  }

  public static class Location{
    /**
    * This method initializes each location with
    * the correct amount cards
    *
    **/

    private String location;
    public int chips;
    public String name;

    Location(String name, int chips){
      this.name = name;
      this.chips = chips;
    }
  }

  public class Move{

    public void choose_upgrade(Player player){
      if(player.rank == 2){
        player.update_Money(4);
        player.update_Credit(5);
      } else if (player.rank == 3){
        player.update_Money(10);
        player.update_Credit(10);
      } else if (player.rank == 4){
        player.update_Money(18);
        player.update_Credit(15);
      } else if (player.rank == 5){
        player.update_Money(28);
        player.update_Credit(20);
      } else if (player.rank == 6){
        player.update_Money(40);
        player.update_Credit(25);
      }
    }

    public void move(String location){

    }

  }

  public class Work{

  }


  public class Role extends Work{

    public void choose_work(){

    }

    /**
    * This method initializes each role
    *
    *
    **/

  }


  public class Act extends Role{

    public void succeed(){
    }

    public void fail(){
    }

    public void upgrade(int money, int credit){

    }

  }

  public class Rehearse extends Role{

    public void succeed(){
    }

    public void get_chip(){
    }
  }

  public class Bonus{

    public void update_Money(){

    }
  }

  public static class Player{
    /**
    * This method initializes each player
    * and assigns rank, money, and credit
    *
    * able to assign role and update rank, money, credit
    **/

    String name;
    private int rank;
    private int money;
    private int credit;
    public String role;
    public int score;
    public Location location;

    Player(String name, int rank, int money, int credit){
      this.name = name;
      this.rank = rank;
      this.money = money;
      this.credit = credit;
    }

    public void assign_Role(String role){
      // Role role = new Role();
    }

    public void update_Rank(int rank){
      this.rank = rank;
    }

    public void update_Money(int money){
      this.money = money;
    }

    public void update_Credit(int credit){
      this.credit = credit;
    }

    public int get_Rank(){
      return rank;
    }

    public int get_Money(){
      return money;
    }

    public int get_Credit(){
      return credit;
    }
  }

  public class roll_Dice{
    /**
    * This method roles a dice
    *
    *
    **/
    Random random = new Random();
    public int get_randomNum(){
      return random.nextInt(6) + 1;
    }
  }

  public class FinalDay{

    public void return_players(){

    }

    public void start_newgame(){

    }

  }


  public class EndDay{

    public void count_score(Player player){
      player.score = player.get_Money() + player.get_Credit() + (player.get_Rank() * 5);
    }
  }

  public static void intro(){
    System.out.println("Lights. Camera. Fall off the roof.\n" +
"Welcome to Deadwood Studios, home of the million movie month. Youre a bit actor with a simple dream. The dream of getting paid.\n" + "You and your cohorts will spend the next four days dressing up as cowboys, working on terrible films, and pretending you can act.\n" + "Your goal is to become the best actor in the backlot. Because it’s good to have goals.\n" + "So strap on your chaps and mosey up to the roof. Your line is “Aaaiiigggghh!”");
  System.out.println();
  }




   public static void main(String []args) {
     Scanner scanner = new Scanner(System.in);
     intro();
     System.out.println("How many players?");

     int num_of_players = scanner.nextInt();
     Start begin_new_game = new Start(num_of_players);

   }
}
