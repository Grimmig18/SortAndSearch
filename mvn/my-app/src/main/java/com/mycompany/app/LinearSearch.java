package com.mycompany.app;

public class LinearSearch
{
    private int[] zSearchArray;

    public LinearSearch(int[] pSearchArray)
    {
        zSearchArray = pSearchArray;
    }

    public int search(int pSearchElement)
    {
        for (int i = 0; i < zSearchArray.length; i++)
        {
            if(zSearchArray[i] == pSearchElement)
            {
                return i;
            }
        }

        return -1;
    }
}
