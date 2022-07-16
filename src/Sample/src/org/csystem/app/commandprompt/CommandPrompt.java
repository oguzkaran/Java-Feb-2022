package org.csystem.app.commandprompt;

import org.csystem.util.string.StringUtil;

import java.util.Scanner;

public class CommandPrompt {
    public static String [] commands = {"lower", "upper", "reverse", "length", "chgprompt", "quit"};
    public String prompt;
    public Scanner kb;

    public static int getCommandIndex(String cmd)
    {
        if (cmd.length() < 3)
            return -1;

        for (int i = 0; i < commands.length; ++i)
            if (commands[i].startsWith(cmd))
                return i;

        return -1;
    }

    public static void lowerCallback(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.println("There must be 1 argument for that command");
            return;
        }

        System.out.println(commandInfo[1].toLowerCase());
    }

    public static void upperCallback(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.println("There must be 1 argument for that command");
            return;
        }

        System.out.println(commandInfo[1].toUpperCase());
    }

    public static void reverseCallback(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.println("There must be 1 argument for that command");
            return;
        }

        System.out.println(StringUtil.reverse(commandInfo[1]));
    }

    public static void lengthCallback(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.println("There must be 1 argument for that command");
            return;
        }

        System.out.println(commandInfo[1].length());
    }

    public void changePromptCallback(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.println("There must be 1 argument for that command");
            return;
        }

        prompt = commandInfo[1];
    }

    public static void quitCallback(String [] commandInfo)
    {
        System.out.println("Thanks!...");
        System.out.println("C and System Programmers Association");
        System.exit(0);
    }

    public void doCommand(String [] commandInfo)
    {
        switch (commandInfo[0]) {
            case "lower" -> lowerCallback(commandInfo);
            case "upper" -> upperCallback(commandInfo);
            case "reverse" -> reverseCallback(commandInfo);
            case "length" -> lengthCallback(commandInfo);
            case "chgprompt" -> changePromptCallback(commandInfo);
            default -> quitCallback(commandInfo);
        }
    }

    public void parseCommand(String cmd)
    {
        String [] commandInfo = cmd.split("[ \t]+");
        int idx = getCommandIndex(commandInfo[0]);

        if (idx != -1) {
            commandInfo[0] = commands[idx];
            doCommand(commandInfo);
        }
        else
            System.out.println("Invalid Command");
    }

    public CommandPrompt(String p)
    {
        prompt = p;
        kb = new Scanner(System.in);
    }

    public void run()
    {
        for (;;) {
            System.out.print(prompt + ">");
            parseCommand(kb.nextLine());
        }
    }
}
