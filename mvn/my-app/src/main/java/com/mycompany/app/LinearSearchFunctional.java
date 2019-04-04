package com.mycompany.app;

/**
 * SortAndSearch
 * <p>
 * Copyright by @author Marcel Mertens
 * Website: https://mertens-web.ddns.net
 * <p>
 * Date: 04.04.2019
 */
public class LinearSearchFunctional
{

    private int[] zSearchArray;

    public LinearSearchFunctional(int[] pSearchArray)
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

    public int functionalSearch(int pSearchElement)
    {
        return 0;
    }
}
