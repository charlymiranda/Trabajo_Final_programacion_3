package com.hotelenterprise.utilities;

import java.util.Scanner;

public class Console {
    private static Scanner input = new Scanner(System.in);

    private Console() {
        /// forbid instantiating the class
    }

    /**
     * Print an object to the console and skip a line.
     *
     * @param o The object to be printed.
     */
    public static void writeLine(Object o) {
        System.out.println(o);
    }

    /**
     * Print an object to the console without line skipping.
     *
     * @param o The object to be printed.
     */
    public static void writeWithoutSkippingLine(Object o) {
        System.out.println(o);
    }



    /**
     * Returns a data placed by the user in the console as String.
     *
     * @return The data placed by the user in the console as String.
     * */
    public static String read() {
        return input.nextLine();
    }
    /**
     * It shows the user a message and then returns a data placed
     * by the user in the console as String.
     *
     * @param message The message that the user will see before entering a data.
     * @return The data placed by the user in the console as String.
     * */
    public static String read(String message){
        Console.writeLine(message);
        return input.nextLine();
    }



    /**
     * It shows the user a message and then returns a data placed by the
     * user in the console as an integer
     *
     * @return The data placed by the user in the console as an integer.
     * @throws NumberFormatException if the data entered does not represent an integer.
     * */
    public static int readInteger(){
        return Integer.parseInt(Console.read());
    }
    /**
     * It shows the user a message and then returns a data placed by the
     * user in the console as an integer
     *
     * @param message The message that the user will see before entering a data.
     * @return The data placed by the user in the console as an integer.
     * @throws NumberFormatException if the data entered does not represent an integer.
     * */
    public static int readInteger(String message){
        return Integer.parseInt(Console.read(message));
    }



    /**
     * It shows the user a message and then returns a data placed by the
     * user in the console as an double
     *
     *
     * @return The data placed by the user in the console as an double.
     * @throws NumberFormatException if the data entered does not represent an double.
     * */

    public static double readDouble(){
        return Double.parseDouble(Console.read());
    }
    /**
     * It shows the user a message and then returns a data placed by the
     * user in the console as an double
     *
     * @param message The message that the user will see before entering a data.
     * @return The data placed by the user in the console as an double.
     * @throws NumberFormatException if the data entered does not represent an double.
     * */
    public static double readDouble(String message){
        return Double.parseDouble(Console.read(message));
    }



    /**
     * It shows the user a message and then returns a data placed by the user in the console as a character.
     * If the user enters more than one character, only the first one is returned.
     * EJ: "Hello" -> 'H'
     *
     * @return The data placed by the user in the console as a character.
     * */

    public static char readCharacter(){
        return  Console.read().charAt(0);
    }
    /**
     * It shows the user a message and then returns a data placed by the user in the console as a character.
     * If the user enters more than one character, only the first one is returned.
     * EJ: "Hello" -> 'H'
     *
     * @param message The message that the user will see before entering a data.
     * @return The data placed by the user in the console as a character.
     * */

    public static char readCharacter(String message){
        return Console.read(message).charAt(0);
    }

}
