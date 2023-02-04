import java.util.*;

public class BasketClass {
    private int LastIndexPosition = 0;
    public  String[] BasketArray = new String[50];
    public String[] BasketArrayUserIndex = new String[51];
    public MainClass InstanceOfMainClass = new MainClass();
    public String DELETED = "*deleted*";
    public String nullText = "NULL";

    BasketClass()
    {
        for (int index = 0; index < 50; index++)
        {
            BasketArray[index] = DELETED;
        }

        InitializeBasket();
        BasketAlign();

    }

    void InitializeBasket(){

        for (int index = 0; index < BasketArray.length; index++)
        {
            BasketArray[index] = nullText;
        }

        for (int index = 0; index < BasketArrayUserIndex.length; index++)
        {
            BasketArrayUserIndex[index] = nullText;
        }
    }

    void BasketAlign(){

        for (int userIndex = 1; userIndex < 51; userIndex++)
        {
            int BasketArraySystemIndex = 0;
            if (BasketArraySystemIndex < 50)
            {
                BasketArrayUserIndex[userIndex] = BasketArrayUserIndex[userIndex].replace(BasketArrayUserIndex[userIndex],BasketArray[BasketArraySystemIndex]);
                BasketArraySystemIndex++;
            }
        }

        /*for (int systemIndex = 0; systemIndex < 50; systemIndex;)
        {

        }*/

    }

    public void Insert(String item)
    {
        if(LastIndexPosition >= 0) // && LastIndexPosition < 50)
        {

            if (LastIndexPosition > 49){
                System.out.println("List Is Full At The Moment, Please Try To Update An Item.");
            }
            else if(LastIndexPosition >= 0 && LastIndexPosition <= 49){
                BasketArray[LastIndexPosition] = item;
                System.out.println("Item " + BasketArray[LastIndexPosition] + " Inserted Successfully");
                LastIndexPosition++;
            }
        }
        BasketAlign();
    }

    public void Update(int index)
    {
        Scanner in = new Scanner(System.in);
        if (index < 1 || index > 50)
        {
            System.out.println("Error Index Number Not Valid!");
        }
        else {
            index = index - 1;
            System.out.println("Now Please Give Text To Write ");
            String sInput = in.next();
            BasketArray[index] = sInput;
            System.out.println("New Input Is BasketArray[index] = " + BasketArray[index]);
        }


        BasketAlign();
    }

    public void Delete(int ListIndex)
    {
        //Retrieve Information
        if (ListIndex >= 1 && ListIndex <= 50)
        {
            int index = ListIndex;
            int SystemReadableIndex = index - 1;
            BasketArray[SystemReadableIndex] = BasketArray[SystemReadableIndex].replace(BasketArray[SystemReadableIndex],"*deleted*");
            System.out.println("Now Item At Index: " + index + " Has The Following Text " + BasketArray[SystemReadableIndex]);
            System.out.println("Item Deleted At Index: " + index);

        }
        //BasketAlign();
    }

    public void Search(String name)
    {
        int index = 0;
        boolean found = false;
        for (index = 0; index <= 49; index++)
        {
            if (BasketArray[index].equals(name))
            {
                found = true;
                break;
            }
            else
            {
                continue;
            }
        }

        if(found == true) {
            System.out.println("Search Engine Found The Element At Index: " + (index + 1));
        }
        else
        {
            System.out.println("Search Engine Failed To Find The Element");

        }

    }

    public void ShowElements(){
        int index = 1;
        int BasketIndex = 0;
        BasketIndex = index - 1;
        for (; index < 50; index++)
        {
            System.out.println("Item At Index " + index + " Has Value " + BasketArray[BasketIndex]);
            BasketIndex++;
        }
    }

}