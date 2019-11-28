package basicprogrammingmodel;

import java.util.Stack;

/**
 * @author zhoujl
 * Dijkstra的双栈算术表达式求值算法
 */
public class Evaluate {
    public static void main(String[] args)  {

        //存储运算符的栈
        Stack<Character> ops;
        ops = new Stack<>();

        //存储运算数的栈
        Stack<Double> vals = new Stack<>();

        String str = "4*6+8*(6+5)";

        char[] chars = str.toCharArray();

        for (char temp :chars){
            switch (temp){
                case '(':break;
                case '+':
                case '-':
                case '*':
                case '/':ops.push(temp);break;
                case ')':{
                    char op = ops.pop();
                    double v = vals.pop();
                    switch (op){
                        case '+':v = vals.pop()+v;break;
                        case '-':v = vals.pop()-v;break;
                        case '*':v = vals.pop()*v;break;
                        case '/':v = vals.pop()/v;break;
                        default:break;
                    }
                    vals.push(v);
                    break;
                }
                default:vals.push(Double.parseDouble(String.valueOf(temp)));break;
            }
        }
        while (ops.size()>0){
            char op = ops.pop();
            double v = vals.pop();
            switch (op){
                case '+':v = vals.pop()+v;break;
                case '-':v = vals.pop()-v;break;
                case '*':v = vals.pop()*v;break;
                case '/':v = vals.pop()/v;break;
                default:break;
            }
            vals.push(v);
        }

        System.out.println(vals.pop());
    }
}
