package com.bobz.executor;

import java.io.File;

public class LinuxExecutor extends CommandExecutor {

    private static final String TERMINAL_CMD = "/usr/bin/gnome-terminal";

    public LinuxExecutor(String targetPath) {
        super.targetPath = targetPath;
    }

    @Override
    public String getTerminalPath() {
        return TERMINAL_CMD;
    }

    @Override
    public Command buildCommand() {

        String terminalPath = this.getTerminalPath();
        String[] cmdArr = {terminalPath, "/k", "start", "cd", getTargetPath()};

        return new Command(cmdArr, null, new File(getTargetPath()));
    }
}
