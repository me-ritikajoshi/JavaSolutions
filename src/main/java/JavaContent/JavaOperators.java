package JavaContent;

public class JavaOperators {
    public static void main(String[] args) {
        //Unary Operator takes one operand & binary operator takes two operands & ternary operator takes three operands

        //Unary Arithmetic Operators -> + - ++ --
        int i1 = +1;
        int i2 = -1;
        //operation in prefix denotes that the variable will be incremented or decremented then only be assigned
        int i3 = ++i1;
        int i4 = --i1;
        //operation in postfix denotes that the variable will be assigned the only incremented or decremented
        int i5 = i1++;
        int i6 = i1--;
        System.out.println("i1: " +i1);
        System.out.println("i2: " +i2);
        System.out.println("i3: " +i3);
        System.out.println("i4: " +i4);
        System.out.println("i5: " +i5);
        System.out.println("i6: " +i6);


        //Binary Operator -> + - * / %
        int a = 18;
        int b = 9;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int div = a / b;
        // modulus % fines out the remainder
        int mod = a % 8;

        System.out.println("Sum: " +sum);
        System.out.println("Diff: " +diff);
        System.out.println("Product: " +product);
        System.out.println("Division: " +div);
        System.out.println("Modulus: " +mod);

        //Assignment Operators -> = += -= /= %=
        int c = 10;
        System.out.println(c+=2);
        System.out.println(c-=5);
        System.out.println(c*=10);
        System.out.println(c/=5);
        System.out.println(c%=2);

        //Relational Operators == != < > <= >=
        int x = 5;
        int y =10;
        System.out.println(x == y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x != y);

        //Logical Operators & && | || ! ^





    }
}
