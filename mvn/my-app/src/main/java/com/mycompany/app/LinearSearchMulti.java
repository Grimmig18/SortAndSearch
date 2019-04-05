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
        Thread[] lThreadArray = new Thread[zThreads];
        LinearSearcher[] lLinearsearcherArray = new LinearSearcher[zThreads];

        for(int i = 0; i < zThreads; i++)
        {
            //Array aufsplitten in anzahl an Teile wie Threads

            lLinearsearcherArray[i] = new LinearSearcher(zSearchArray, pSearchElement, 1,2);
            lThreadArray[i] = new Thread(lLinearsearcherArray[i]);
            lThreadArray[i].start();
        }


        return lLinearsearcherArray[0].getIndex();
    }
}
