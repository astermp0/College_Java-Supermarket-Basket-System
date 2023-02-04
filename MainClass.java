import javax.print.DocFlavor;
import java.util.*;

public class MainClass {
    static BasketClass basket = new BasketClass();

    public static void ShowMenu()
    {
        menu:
            for (;;)
            {
                System.out.println("Max Number Of Products On The List Is 50.");
                System.out.println("Please Be Cautious More Products Wont Be Allowed To Be Entered");
                System.out.println("Add Product On List [1]");
                System.out.println("Delete Product [2]");
                System.out.println("Search For Product [3]");
                System.out.println("Update Product [4]");
                System.out.println("Show Basket Products [5]");

                Scanner in = new Scanner(System.in);
                int int_input = 0;
                try
                {
                    int_input = in.nextInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Wrong Input Try Again");
                    continue;
                }


                if (int_input == 1)
                {
                    System.out.printf("Enter Text To Insert On List: ");
                    String newinput = in.next();
                    System.out.println();
                    basket.Insert(newinput);
                }

                if (int_input == 2)
                {
                    System.out.printf ("Please Give An Index Between 1 - 50 In Order To Delete The Information At: ");
                    int listindex = in.nextInt();
                    basket.Delete(listindex);
                }

                if (int_input == 3)
                {
                    System.out.println("Please Write Text To Search For");
                    String searchFor = in.next();
                    basket.Search(searchFor);
                }

                if (int_input == 4)
                {
                    System.out.println("Please Give Index To Access And Write On");
                    int intInput = in.nextInt();
                    basket.Update(intInput);
                }

                if (int_input == 5)
                {
                    basket.ShowElements();
                }

                if (int_input != 1 && int_input != 2 && int_input != 3 && int_input != 4 && int_input != 5)
                {
                    continue menu;
                }

            }
    }

    public static void main(String[] args)
    {
        ShowMenu();
    }
}