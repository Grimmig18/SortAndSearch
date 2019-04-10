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
        LinearSearcher[] lLinearSearcherArray = new LinearSearcher[zThreads];

        boolean lIsReady = false;
        int lScale = (zSearchArray.length / zThreads);
        System.out.println("Scale: "+lScale);

        int lLastI = 0;

        for(int i = 0; i < (zThreads - 1); i++)
        {
            lLinearSearcherArray[i] = new LinearSearcher(zSearchArray, pSearchElement, lLastI, ((lLastI + lScale) - 1));
            lThreadArray[i] = new Thread(lLinearSearcherArray[i]);
            lThreadArray[i].start();

            lLastI += lScale;
        }

        lLinearSearcherArray[zThreads-1] = new LinearSearcher(zSearchArray, pSearchElement, lLastI, zSearchArray.length);

        lThreadArray[zThreads-1] = new Thread(lLinearSearcherArray[zThreads-1]);
        lThreadArray[zThreads-1].start();

        while(!lIsReady)
        {
            if(this.threadsReady(lLinearSearcherArray))
            {
                lIsReady = true;
            }
        }

        return lLinearSearcherArray[zThreads-1].getIndex();
    }

    private boolean threadsReady(LinearSearcher[] pSearcher)
    {
        for(int j = 0; j < pSearcher.length; j++)
        {
            if(!pSearcher[j].isReady())
            {
                return false;
            }
        }

        return true;
    }
}
