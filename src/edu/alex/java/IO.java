package edu.alex.java;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Alex on 15-Mar-17.
 */
public class IO
{
    static Scanner scan = new Scanner(System.in);

    public static int getInteger(String prompt)
    {
        if (!prompt.endsWith(":") && !prompt.endsWith(": "))
        {
            prompt += ": ";
        }

        while (true)
        {
            try {
                System.out.print(prompt);
                String input = scan.nextLine();
                return Integer.valueOf(input);
            }
            catch (NoSuchElementException e)//from scan.nextLine()
            {
                System.out.println("No input, Please try again. Must be an integer number: ");
            }
            catch (NumberFormatException e)//from Integer.valueOf(input)
            {
                System.out.println("Bad input, Please try again. Must be an integer number: ");
            }
            catch (IllegalArgumentException e)//from scan.nextLine()
            {
                throw new RuntimeException("There is a problem with input device. The program need to exit");
            }

        }
    }

    public static int getInteger(String prompt, int from, int to){
        int result;
        do
        {
            result = getInteger(prompt);
        }
        while (result < from || result > to);

        return result;
    }

    public static int getInt(String prompt, int from)
    {
        return getInteger(prompt, from, Integer.MAX_VALUE);
    }

    public static double getDouble(String prompt)
    {
        if (!prompt.endsWith(":") && !prompt.endsWith(": ")) {
            prompt += ": ";
        }

        while (true) {
            try {
                System.out.print(prompt);
                String input = scan.nextLine();
                return Double.valueOf(input);
            } catch (NoSuchElementException e)//from scan.nextLine()
            {
                System.out.println("No input, Please try again. Must be a double number");
            } catch (NumberFormatException e)//from Double.valueOf(input)
            {
                System.out.println("Bad input, Please try again. Must be a double number");
            } catch (IllegalArgumentException e)//from scan.nextLine()
            {
                throw new RuntimeException("There is a problem with input device. The program need to exit");
            }
        }
    }

    public static double getDouble(String prompt, double from, double to)
    {
        double result;
        do {
            result = getDouble(prompt);
        }while (result < from || result > to);
        return result;
    }

    public static Double getDouble(String prompt, double from)
    {
        return getDouble(prompt, from, Double.MAX_VALUE);
    }

    public static float getFloat(String prompt)
    {
        if (!prompt.endsWith(":") && !prompt.endsWith(": ")) {
            prompt += ": ";
        }

        while (true) {
            try {
                System.out.print(prompt);
                String input = scan.nextLine();
                return Float.valueOf(input);
            } catch (NoSuchElementException e)//from scan.nextLine()
            {
                System.out.println("No input, Please try again. Must be a float number");
            } catch (NumberFormatException e)//from Float.valueOf(input)
            {
                System.out.println("Bad input, Please try again. Must be a float number");
            } catch (IllegalArgumentException e)//from scan.nextLine()
            {
                throw new RuntimeException("There is a problem with input device. The program need to exit");
            }
        }
    }

    public static float getFloat(String prompt, float from, float to){
        float result;
        do {
            result = getFloat(prompt);
        }
        while (result < from || result > to);

        return result;
    }

    public static Float getFloat(String prompt, float from)
    {
        return getFloat(prompt, from, Float.MAX_VALUE);
    }

    public static int getIntegerRecursive(String prompt)
    {
        Scanner scanner = new Scanner(System.in);

        if (!prompt.endsWith(":") && !prompt.endsWith(": "))
        {
            prompt += ": ";
        }

        System.out.println(prompt);
        try {
            int result = scanner.nextInt();
            return result;
        }
        catch (InputMismatchException e){
            System.out.println("Bad input, Please try again. Must be an integer number");
            return getIntegerRecursive(prompt);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("No input, Please try again. Must be an integer number");
            return getIntegerRecursive(prompt);
        }
        catch(IllegalStateException e)
        {
            System.out.println();
            throw new RuntimeException("There is a problem with java enviroment. The program need to exit");
        }
    }

    public static double getDoubleRecursive(String prompt)
    {
        Scanner scanner = new Scanner(System.in);

        if (!prompt.endsWith(":") && !prompt.endsWith(": "))
        {
            prompt += ": ";
        }

        System.out.println(prompt);
        try {
            double result = scanner.nextDouble();
            return result;
        }
        catch (InputMismatchException e){
            System.out.println("Bad input, Please try again. Must be a double number");
            return getDoubleRecursive(prompt);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("No input, Please try again. Must be a double number");
            return getDoubleRecursive(prompt);
        }
        catch(IllegalStateException e)
        {
            System.out.println();
            throw new RuntimeException("There is a problem with java enviroment. The program need to exit");
        }
    }

    public static float getFloatRecursive(String prompt)
    {
        Scanner scanner = new Scanner(System.in);

        if (!prompt.endsWith(":") && !prompt.endsWith(": "))
        {
            prompt += ": ";
        }

        System.out.print(prompt);
        try {
            float result = scanner.nextFloat();
            return result;
        }
        catch (InputMismatchException e){
            System.out.println("Bad input, Please try again. Must be a float number");
            return getFloatRecursive(prompt);
        }
        catch(NoSuchElementException e)
        {
            System.out.println("No input, Please try again. Must be a float number");
            return getFloatRecursive(prompt);
        }
        catch(IllegalStateException e)
        {
            System.out.println();
            throw new RuntimeException("There is a problem with java enviroment. The program need to exit");
        }
    }
//___________________________________________________________________________________________________________________________________________________



}
