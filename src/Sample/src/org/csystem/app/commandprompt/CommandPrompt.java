package org.csystem.app.commandprompt;

import org.csystem.util.string.StringUtil;

import java.util.Scanner;

public class CommandPrompt {
    private static final String [] ms_commands = {"lower", "upper", "reverse", "length", "chgprompt", "quit"};
    private final Scanner m_kb;
    private String m_prompt;

    private static int getCommandIndex(String cmd)
    {
        if (cmd.length() < 3)
            return -1;

        for (int i = 0; i < ms_commands.length; ++i)
            if (ms_commands[i].startsWith(cmd))
                return i;

        return -1;
    }

    private static void lowerCallback(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.println("There must be 1 argument for that command");
            return;
        }

        System.out.println(commandInfo[1].toLowerCase());
    }

    private static void upperCallback(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.println("There must be 1 argument for that command");
            return;
        }

        System.out.println(commandInfo[1].toUpperCase());
    }

    private static void reverseCallback(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.println("There must be 1 argument for that command");
            return;
        }

        System.out.println(StringUtil.reverse(commandInfo[1]));
    }

    private static void lengthCallback(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.println("There must be 1 argument for that command");
            return;
        }

        System.out.println(commandInfo[1].length());
    }

    private void changePromptCallback(String [] commandInfo)
    {
        if (commandInfo.length != 2) {
            System.out.println("There must be 1 argument for that command");
            return;
        }

        m_prompt = commandInfo[1];
    }

    private static void quitCallback(String [] commandInfo)
    {
        System.out.println("Thanks!...");
        System.out.println("C and System Programmers Association");
        System.exit(0);
    }

    private void doCommand(String [] commandInfo)
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

    private void parseCommand(String cmd)
    {
        String [] commandInfo = cmd.split("[ \t]+");
        int idx = getCommandIndex(commandInfo[0]);

        if (idx != -1) {
            commandInfo[0] = ms_commands[idx];
            doCommand(commandInfo);
        }
        else
            System.out.println("Invalid Command");
    }

    public CommandPrompt(String p)
    {
        m_prompt = p;
        m_kb = new Scanner(System.in);
    }

    public void run()
    {
        for (;;) {
            System.out.print(m_prompt + ">");
            parseCommand(m_kb.nextLine());
        }
    }
}
