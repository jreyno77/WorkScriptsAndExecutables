package org.jreyno77.wsae;

import java.util.Objects;
// import picocli.CommandLine;

public class Main {

    public static void main(String[] args) {
        int exitCode = run(args);
        System.exit(exitCode);
    }

    public static int run(String[] args) {
        Objects.requireNonNull(args);
        return 0;
        // CommandLine cli = new CommandLine(null);
        // return cli.execute(args);
    }
}