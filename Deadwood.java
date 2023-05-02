public class Deadwood{

  public class Start{
    private int players;

    Start(int num_players){
      players = num_players;
    }

    /**
    * This method initializes the start of a new game with
    * the correct amount of players
    *
    **/

  }

  public class Location{
    private String location;
    public int card;

    Location(String location, int card){
      this.location = location;
      this.card = card;
    }

    /**
    * This method initializes each location with
    * the correct amount cards
    *
    **/

  }

  public class Move{

    public void choose_upgrade(){

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

  public class Player{
    String name;
    private int rank;
    private int money;
    private int credit;
    public String role;

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

    /**
    * This method initializes each player
    * and assigns rank, money, and credit
    *
    * able to assign role and update rank, money, credit
    **/
  }

  public class roll_Dice{
    /**
    * This method roles a dice
    *
    *
    **/
  }

  public class FinalDay{

    public void return_players(){

    }

    public void start_newgame(){

    }

  }

  public class EndDay{

    public void count_money(Player player){

    }

    public void count_credit(Player player){

    }

    public void count_rank(Player player){

    }
  }




   public static void main(String []args) {

   }
}
