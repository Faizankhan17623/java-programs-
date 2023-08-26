class twoD{
    public static void main(String args[])
    {
        int twoD[][] = new int[4][6];
        int i,j,k=0;
        for (i=0; i<4; i++)
        for (j=0; j<6; j++)
        {
            twoD[i][j] = k;
            k++;
        }
        for (i=0;i<4;i++)
        {
            for(j=0;j<6;j++);
            System.out.println(twoD[i][j]+ " ");
            System.out.println();
        }
    }
}