package Lab1.programy.r03.r03_02;

public interface Identified
{
    default int getId() 
    {
        return Math.abs(hashCode());
    }
}

