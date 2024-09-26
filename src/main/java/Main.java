import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "task-cli", mixinStandardHelpOptions = true, version = "1.0",
        description = "Task tracker is a project used to track and manage your tasks")
public class Main implements Runnable {

    @Option(names = {"add"}, description = "Used to add tasks")
    private String tasks;

    @Override
    public void run() {
        System.out.printf("Task Added Successfully: "+tasks);
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute("add=buy a pen");
        System.exit(exitCode);
    }
}
