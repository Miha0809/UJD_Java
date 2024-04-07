package Lab1.programy.r03.r03_02;

public interface Person
{
    String getName();
    default int getId()
    {
        return 0;
    }
}

