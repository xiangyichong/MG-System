import java.util.Scanner;

public class MG
{
    public static void main (String[] args)
    {

        Scanner enter = new Scanner(System.in);
        byte trigger;
        byte mode;

            do
            {
                //Luncheer
                System.out.println("==============================MG-System==============================");
                System.out.println("1.Start.");
                System.out.println("2.Exit.");
                System.out.print("Please set control:");
                trigger=enter.nextByte();

                if (trigger==1)//Trigger
                {
                    System.out.println("==============================Mode Select==============================");
                    System.out.println("1.Right Triangle");
                    System.out.println("2.Isosceles Triangle");
                    System.out.println("3.Square.");
                    System.out.println("4.Diamond");
                    System.out.println("5.Test-HollowDiamond");
                    System.out.print("Please select your mode:");
                    mode= enter.nextByte();

                    if (mode==1)//Right Triangle
                    {
                        System.out.print("PLease set your row:");//user set spec
                        int RT_in=enter.nextInt();
                        System.out.print("Please set your symbol");//user set graphic
                        char RT_symbol=enter.next().charAt(0);

                        for (int RT_row=1;RT_row<=RT_in;RT_row++)//for Depth
                        {
                            for (int RT_Entity=1;RT_Entity<=2*RT_row-1;RT_Entity++)//for Wide
                            {
                                System.out.print(RT_symbol);
                            }
                            System.out.println();
                        }
                    }

                    if (mode==2)//Isosaele Triangle
                    {
                        System.out.print("Please set your row:");
                        int IT_wish=enter.nextInt();
                        System.out.print("Please set your symbow:");
                        char IT_symbol=enter.next().charAt(0);

                        for (int IT_row=1;IT_row<=IT_wish;IT_row++)
                        {
                            for (int IT_Blank=1;IT_Blank<=IT_wish-IT_row;IT_Blank++)
                            {
                                System.out.print(" ");
                            }
                            for (int IT_Entity=1;IT_Entity<=2*IT_row-1;IT_Entity++)
                            {
                                System.out.print(IT_symbol);
                            }
                            System.out.println();
                        }
                    }

                    if (mode==3)//Square
                    {
                        System.out.print("Please set your wide:");
                        int SQ_wide=enter.nextInt();//定义宽
                        System.out.print("Please set your tall:");
                        int SQ_tall=enter.nextInt();//定义高
                        System.out.print("Please set your symbol:");
                        char SQ_symbol=enter.next().charAt(0);//定义打印符号

                        for (int SQ_i=1;SQ_i<=SQ_tall;SQ_i++)//for高
                        {
                            for(int SQ_j=1;SQ_j<=SQ_wide;SQ_j++)//for宽
                            {
                                System.out.print(SQ_symbol);//打印变量symbol
                            }
                            System.out.println();//换行
                        }
                    }

                    if(mode==4)//Diamond
                    {
                        System.out.print("Please enter your axis:");
                        int di_wish=enter.nextInt();
                        System.out.print("Please enter your symbol:");
                        char di_symbol=enter.next().charAt(0);

                        int di_axis=di_wish/2;

                        for (int di_upRow=1;di_upRow<=di_axis;di_upRow++)//遍历上部行数
                        {
                            for (int di_upBlank=1;di_upBlank<=di_axis-di_upRow;di_upBlank++)//遍历空格
                            {
                                System.out.print(" ");//打印空格
                            }
                            for (int di_upSymbol=1;di_upSymbol<=2*di_upRow-1;di_upSymbol++)//遍历实体
                            {
                                System.out.print(di_symbol);//打印实体
                            }
                            System.out.println();//跳出前两个for，换行从第一个for开始
                        }
                        for (int di_downRow=di_axis;di_downRow>=1;di_downRow--)//遍历下部行数
                        {
                            for (int di_downBlank=1;di_downBlank<=di_axis-di_downRow;di_downBlank++)//遍历空格
                            {
                                System.out.print(" ");//打印空格
                            }
                            for (int di_downSymbol=1;di_downSymbol<=2*di_downRow-1;di_downSymbol++)//遍历实体
                            {
                                System.out.print(di_symbol);//打印实体
                            }
                            System.out.println();//跳出前两个for，换行从第一个for开始
                        }
                    }

                    if(mode==5)//Hollow Diamond
                    {
                        System.out.print("Please enter your Half-axis:");
                        int HDI_halfWish=enter.nextInt();
                        System.out.print("Please enter your symbol:");
                        char HDI_symbol=enter.next().charAt(0);

                        for(int x=-HDI_halfWish;x<=HDI_halfWish;x++)
                        {
                            for(int y=-HDI_halfWish;y<=HDI_halfWish;y++)
                            {
                                if(((x>0?x:-x)+(y>0?y:-y))==HDI_halfWish)
                                {
                                    System.out.print(HDI_symbol);
                                }
                                else
                                {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }

                    }
                }
            }
            while(trigger!=2);
            while(trigger==2)
            {
                System.out.println("Thank you for use!");
                System.out.println("BYE~BYE~");
                break;
            }
    }
}


