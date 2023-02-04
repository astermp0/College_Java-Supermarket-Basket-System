public class Convert {

    public static int ForUserExperienceIndexAlignment(int SpecifiedIndex)
    {
        if (SpecifiedIndex <= 50 && SpecifiedIndex >= 1)
        {
            return SpecifiedIndex;
        }
        else if (SpecifiedIndex > -1 && SpecifiedIndex < 50){
                return SpecifiedIndex + 1;
        }

        return 0;
    }

    public static int ForSystemUsageIndexAlignment(int CurrentIndex)
    {
        if (CurrentIndex > 0 && CurrentIndex < 51)
        {
            CurrentIndex--;
            return CurrentIndex;
        }
        return 0;
    }

}
