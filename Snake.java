import java.util.Scanner;

public class Snake {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int player1_position=0;
        int player2_position=0;
        int dice_roll_counter=0;
        boolean player_Change_flag=true;
        
        System.out.println("The name of the first player");
        String player_1=scan.next();
        System.out.println("The name of the second player");
        String player_2=scan.next(); 

        while (player1_position!=100 || player2_position!=100)
        {
            if(player_Change_flag==true)
            {
               dice_roll_counter++;
                Game(player2_position, player_Change_flag, player_2);
            }
            else
            {    
                   dice_roll_counter++;
                Game(player1_position, player_Change_flag, player_1);

            }
            if(player1_position ==100)
            {
                System.out.println( player_1+"Winner");
                System.out.println(dice_roll_counter+"times is dice rolled");
            }
            else
            {
                  System.out.println( player_2+"Winner");
                  
                System.out.println(dice_roll_counter+"times is dice rolled");

            }

            
        }



            
        
    }
    

    

    public static void Game(int position,boolean flag,String player_name)
    {
        
        while(position!=100)
        {
           switch(option_check())
           {
           case 1:
              System.out.println("You are in the same position"+" "+position);
             break;
           case 2:  
            //    position+= dice_roll_func()<0 ?dice_roll_func()*-1:dice_roll_func();
               position+=ladder_func(position, dice_roll_func());
               
               System.out.println("You got the ladder"+" "+position);  
              
               
              break;

          case 3:
               
               position-= snakeBite(position, dice_roll_func());
                flag=flag==true?false:true;
               
    
               System.out.println("You got bitten by the snake"+" "+position);
               
               System.out.println("The player changed");
           break;

         default:
          System.out.println("This is not valid!");

           }

        }

    }

    public static int dice_roll_func()
    {
        return (int) Math.floor(Math.random() * 5)+1;
    }



    public static int ladder_func(int position,int dice_value)
    {
        int required=100-position;
        if(dice_value<=required && dice_value>0)
        return dice_value;
        return 0;
    }



    public static int snakeBite(int position, int dice_value)
    {
        int afterBite=position-dice_value;
        if(afterBite >0)
            return dice_value;
        return 0;
    }

    
    public static int option_check()
    {
        return (int) Math.floor(Math.random() * 3)+1;
    }

    
}
