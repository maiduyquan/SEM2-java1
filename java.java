public class java {
    public static void main(String[] args) {
            // write your code here
            System.out.println("Hello World");
            System.out.println("");
            System.out.print("Hello again");
            System.out.print("");
            System.out.println("Hello One More Time");
            System.out.println("---------------------");
            System.out.println("* * * * * ");
            System.out.println(" * * * * *");
            System.out.println("* * * * * ");
            System.out.println(" * * * * *");
            System.out.println("* * * * * ");
            System.out.println("----------------------");
            System.out.println("* * * * *");
            System.out.println("*       *");
            System.out.println("*       *");
            System.out.println("*       *");
            System.out.println("* * * * *");
            System.out.println("-------------------------");
            System.out.println("* * * * *");
            System.out.println(" *     *");
            System.out.println("  *   *");
            System.out.println("   * *");
            System.out.println("    *");
            System.out.println("---------------------------");
            System.out.println("    *");
            System.out.println("* *   * *");
            System.out.println("   * *");
            System.out.println("  *   *");
            System.out.println(" *     *");
            System.out.println("-----------------------------");

            System.out.println("          '__'");
            System.out.println("          (oo)");
            System.out.println("  /========//");
            System.out.println(" / || @@ ||");
            System.out.println("*  ||----||");
            System.out.println("   vv    vv");
            System.out.println("   ''    ''");
            System.out.println("==========================");

            int number1 = 11;
            int number2 = 22;
            int number3 = 33;
            int number4 = 44;
            int number5 = 55;
            int sum;
            sum = number1 + number2 + number3 + number4 + number5;
            System.out.print("sum is:");
            System.out.println(sum);
            System.out.println("==============================");
            double radius , area , circumference;
            final double PI=3.14159265;
            radius=1.2;
            area=radius*radius*PI;
            circumference=2.0*radius*PI;
            System.out.print("the radius is ");
            System.out.println(radius);
            System.out.print("the area is ");
            System.out.println(area);
            System.out.print("the circumference is ");
            System.out.println(circumference);

            System.out.println("====================================");
            int num1=98;
            int num2=5;
            int sum1,difference,product,quotient, remainder;

            sum1=num1+num2;
            difference=num1-num2;
            product=num1*num2;
            quotient=num1/num2;
            remainder=num1 % num2;

            System.out.print("the sum,difference,product,quotient, remainder of");
            System.out.print(" num1 ");
            System.out.print(" and ");
            System.out.print(" num2 ");
            System.out.print(" are ");
            System.out.print(sum1);
            System.out.print(", ");
            System.out.print(difference);
            System.out.print(", ");
            System.out.print(product);
            System.out.print(", ");
            System.out.print(quotient);
            System.out.print(", and ");
            System.out.println(remainder);

            ++num1;

            --num2;
            System.out.println("num1 after increment is "+num1);
            System.out.println("num2 after decrement is "+num2);
            quotient=num1/num2;
            System.out.println("new quotient of "+ num1 +" and "+ num2 +" is " +quotient);

            System.out.println("===============================================");

            int lowerbound=1;
            int upperbound=1000;
            int sum2 =0;
            int num=lowerbound;
            while (num<=upperbound){
                    sum2=sum2+num;
                    ++num;
            }
            System.out.println("the sum from " + lowerbound +" to " + upperbound + " is " + sum2);

            System.out.println("==============================================================");


            int lowerbound1=1,upperbound1=1000;
            int sumOdd=0;
            int sumEven=0;
            int number=lowerbound1;
            while (number<=upperbound1){
                    if (number % 2 ==0){
                            sumEven+=number;
                    }else{
                            sumOdd+=number;
                    }
                    ++number;
            }
            System.out.println("the sum of odd number from " + lowerbound1 + " to " + upperbound1 + " is " + sumOdd);
            System.out.println("the sum of even number from " + lowerbound1 + " to " + upperbound1 + " is" + sumEven);
            System.out.println("the difference between the two sums is " +(sumOdd-sumEven));
    }
}
