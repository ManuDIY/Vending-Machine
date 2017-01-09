import java.util.*;
public class VendingDisplay
{
    public static void main (String[] args)
    {
        VendingMachine vm;
        vm = new VendingMachine();
        vm.showmessoutput();
        vm.setstock(10);
        
     
        while(vm.getInventory() >= 0)
        {
            Scanner scan = new Scanner (System.in);
            System.out.println ("");
            System.out.println ("");
            System.out.println ("Insert Coins, Please:  \t");
            int amount = scan.nextInt();
            vm.insertmoney(amount);
            System.out.println("");
            System.out.println(vm.tocurrency(vm.getcredit()));

            //System.out.println(vm.toCurrency(  (int)  (vm.getsales()* 100  )));

            System.out.println (vm.toString());
            vm.makeselection();
            System.out.println("Would you like another? y/n");
            String yesorno = scan.next();
            if(yesorno.equals("N"))
            {
                break;
            }

            if(yesorno.equals("n"))
            {
                break;
            }

            if(vm.getInventory() == 0)
            {
                System.out.println("How many cans would you like to restock?");
                amount = scan.nextInt();
                vm.restock(amount);
            }

        }
    }
}