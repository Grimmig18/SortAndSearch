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
            //Array aufsplitten in anzahl an Teile wie Threads

            //lThreadarray[i] = new Thread(new LinearSearcher(zSearchArray, pSearchElement, 1,2));
            //lThreadarray[i].start();
        }


        return -1;
    }
}
