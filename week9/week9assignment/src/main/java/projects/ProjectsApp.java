package projects;

import projects.entity.Project;
import projects.exception.DbException;
import projects.service.ProjectService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ProjectsApp {
  private ProjectService projectService = new ProjectService();

  private List<String> operations = List.of(
      "1) Add a project.",
      "2) Edit a project.",
      "3) Delete a project.");
  private Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

   new ProjectsApp().processUserSelections();


  }

  private Object processUserSelections() {
    boolean done = false;
    while(!done){
      try {
        int selection = getUserSelection();
        switch(selection) {
          case -1:
            done = exitMenu();
            break;
          case 1:
            createProject();
            break;
          default:
            System.out.println("\n" + selection + " is not a valid selection. Try again.");
            break;
        }
      } catch(Exception e){
        System.out.println("\nError: " + e + " Try again.");
      }
    }

    return null;
  }

  private boolean exitMenu() {
    System.out.println("\n Thanks - Goodbye!");
    return true;
  }

  private int getUserSelection() {
    printOperations();

    Integer input = getIntInput("Enter a menu Selection");

    return Objects.isNull(input) ? -1 : input;
  }

  private void printOperations() {
    System.out.println("\nThese are the available selections. Press the Enter key to quit:");
    operations.forEach(operation -> System.out.println(" " + operation));
  }

  private Integer getIntInput (String prompt) {
    String input = getStringInput(prompt);

    if (Objects.isNull(input)) {
      return null;
    }

    try {

      return Integer.valueOf(input);
    }
    catch (NumberFormatException e) {
      throw new DbException(input + " is not a valid number.");
    }
  }
  
  public String getStringInput(String prompt) {
    System.out.print(prompt + ": ");
    String input = scanner.nextLine();

    return input.isBlank() ? null : input.trim();
  }

  public BigDecimal getDecimalInput(String prompt) {

    String input = getStringInput(prompt);

    if (Objects.isNull(input)) {
      return null;
    }

    try {

      return new BigDecimal(input).setScale(2);
    }
    catch (NumberFormatException e) {
      throw new DbException(input + " is not a valid number.");
    }
  }

  public void createProject(){
    String projectName = getStringInput("Enter Project Name");
    BigDecimal estimatedHours = getDecimalInput("Enter estimated hours");
    BigDecimal actualHours = getDecimalInput("Enter actual hours");
    Integer difficulty = getIntInput("Enter difficulty rating");
    String notes = getStringInput("Enter Project Notes");

    Project project = new Project();

    project.setProjectName(projectName);
    project.setEstimatedHours(estimatedHours);
    project.setActualHours(actualHours);
    project.setDifficulty(difficulty);
    project.setNotes(notes);

    Project dbProject = projectService.addProject(project);
    System.out.println("You successfully created project: " + dbProject);
  }



}
