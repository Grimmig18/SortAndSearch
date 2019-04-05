package com.mycompany.app;

public class LinearSearchMulti
{
    int[] zSearchArray;
    int zThreads = 1;

    public LinearSearchMulti(int[] pSearchArray)
    {
        zSearchArray = pSearchArray;
    }

    public LinearSearchMulti(int[] pSearchArray, int pThreads)
    {
        zSearchArray = pSearchArray;
        zThreads = pThreads;
    }

    public int search(int pSearchElement)
    {
        Thread[] lThreadarray = new Thread[zThreads];

        for(int i = 0; i < zThreads; i++)
        {
            //lThreadarray[i] = new Thread(new LinearSearcher(zSearchArray, pSearchElement, ));
        }


        return -1;
    }
}
