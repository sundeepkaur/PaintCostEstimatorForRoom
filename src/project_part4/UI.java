/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_part4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kaurs
 */
public class UI {

    public static double length;
    public static double width;
    public static double height;
    public static double widthOfDoor;
    public static double heightOfDoor;
    public static double widthOfWindow;
    public static double heightOfWindow;
    public static double coverageArea;
    public static double pricePerGallon;
    public static String paintType;
    public static double hourlyRate;
    public static double numberOfHours;
    public static double costToPaintWalls;
    public static double costToPaintCeiing;
    public static double costToPaintDoorWindow;
    public static double totalLaborCost;
    public static double totalEstimate;

    public static void mainGUI() {
        Wall wall1;
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("******************************************************");
            System.out.println("Main Menu - Paint Cost Estimator");
            System.out.println("******************************************************");
            System.out.println("1. Enter Room dimensions");
            System.out.println("2. Enter Door dimensions");
            System.out.println("3. Enter Window dimensions");
            System.out.println("4. Enter Wall paint data");
            System.out.println("5. Enter Ceiling paint data");
            System.out.println("6. Enter Door/Window paint data");
            System.out.println("7. Enter Labor data");
            System.out.println("8. Display cost of paint for wall");
            System.out.println("9. Display cost of paint for ceiling");
            System.out.println("10. Display cost of paint for door and window");
            System.out.println("11. Display total labor cost");
            System.out.println("12. Display total Estimate to paint Room");
            System.out.println("0 To Exit");
            System.out.println("Enter your choice: or 0 to exit:");
            choice = sc.nextInt();
            switch (choice) {

                case 0:
                    System.out.println("Thanks for using the application, See you.\n Bye Bye !");
                    break;

                case 1:
                    System.out.println("Enter Room dimensions:");
                    length = 0;
                    width = 0;
                    height = 0;
                    do {
                        if (length <= 0) {
                            System.out.println("Enter Length of Room :");
                            length = promptToUserForGettingValidValue();
                            if (length > 0) {
                                while (length < 8 || length > 16) {
                                    if (length < 8) {
                                        System.out.println("You entered too small length for Wall, Please enter in Range of 8 to 16");
                                        System.out.println("Enter Length of Wall :");
                                        length = promptToUserForGettingValidValue();
                                    } else if (length > 16) {
                                        System.out.println("You entered too high length for Wall, Please enter in Range of 8 to 16");
                                        System.out.println("Enter Length of Wall :");
                                        length = promptToUserForGettingValidValue();
                                    }
                                }
                            }
                        } else if (width <= 0) {
                            System.out.println("Enter Width of Room :");
                            width = promptToUserForGettingValidValue();
                            if (width > 0) {
                                while (width < 8 || width > 16) {
                                    if (width < 8) {
                                        System.out.println("You entered too small width for Wall, Please enter in Range of 8 to 16");
                                        System.out.println("Enter Width of Wall :");
                                        width = promptToUserForGettingValidValue();
                                    } else if (width > 16) {
                                        System.out.println("You entered too high width for Wall, Please enter in Range of 8 to 16");
                                        System.out.println("Enter Width of Wall :");
                                        width = promptToUserForGettingValidValue();
                                    }
                                }
                            }
                        } else if (height <= 0) {
                            System.out.println("Enter Height of Room :");
                            height = promptToUserForGettingValidValue();
                            if (height > 0) {
                                while (height < 8 || height > 16) {
                                    if (height < 8) {
                                        System.out.println("You entered too small hieght for Wall, Please enter in Range of 8 to 16");
                                        System.out.println("Enter Height of Wall :");
                                        height = promptToUserForGettingValidValue();
                                    } else if (height > 16) {
                                        System.out.println("You entered too high Height for Wall, Please enter in Range of 8 to 16");
                                        System.out.println("Enter Height of Wall :");
                                        height = promptToUserForGettingValidValue();
                                    }
                                }
                            }
                        } else if (height > 0 && width > 0) {
                            break;
                        }
                    } while (true);

                    try {
                        wall1 = new Wall(width, height);
                        Wall wall2 = new Wall(length, width);
                        System.out.println("For Wall 1 :  " + wall1);
                        System.out.println("For Wall 2 :  " + wall2);
                        Room room = new Room();
                        room.addWall(wall1);
                        room.addWall(wall2);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;

                case 2:
                    System.out.println("Enter Door dimensions:");
                    heightOfDoor = 0;
                    widthOfDoor = 0;

                    do {
                        if (widthOfDoor <= 0) {
                            System.out.println("Enter Width of Door :");
                            widthOfDoor = UI.promptToUserForGettingValidValue();
                            if (widthOfDoor > 0) {
                                while (widthOfDoor < 3 || widthOfDoor > 4) {
                                    if (widthOfDoor < 3) {
                                        System.out.println("You entered too small width for Door, Please enter in Range of 3 to 4");
                                        System.out.println("Enter Width of Door :");
                                        widthOfDoor = UI.promptToUserForGettingValidValue();
                                    } else if (widthOfDoor > 4) {
                                        System.out.println("You entered too high width for Door, Please enter in Range of 3 to 4");
                                        System.out.println("Enter Width of Door :");
                                        widthOfDoor = UI.promptToUserForGettingValidValue();
                                    }
                                }
                            }
                        } else if (heightOfDoor <= 0) {
                            System.out.println("Enter Height of Door :");
                            heightOfDoor = UI.promptToUserForGettingValidValue();
                            if (heightOfDoor > 0) {
                                while (heightOfDoor < 7 || heightOfDoor > 8) {
                                    if (heightOfDoor < 7) {
                                        System.out.println("You entered too small height for Door, Please enter in Range of 7 to 8");
                                        System.out.println("Enter Height of Door :");
                                        heightOfDoor = UI.promptToUserForGettingValidValue();
                                    } else if (heightOfDoor > 8) {
                                        System.out.println("You entered too high height for Door, Please enter in Range of 7 to 8");
                                        System.out.println("Enter Height of Door :");
                                        heightOfDoor = UI.promptToUserForGettingValidValue();
                                    }
                                }
                            }
                        } else if (heightOfDoor > 0) {
                            break;
                        }
                    } while (true);
                    try {
                        Door door = new Door(widthOfDoor, heightOfDoor);
                        System.out.println(door);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;

                case 3:
                    System.out.println("Enter Window dimensions:");
                    heightOfWindow = 0;
                    widthOfWindow = 0;
                    do {
                        if (widthOfWindow <= 0) {
                            System.out.println("Enter Width of Window :");
                            widthOfWindow = UI.promptToUserForGettingValidValue();
                            if (widthOfWindow > 0) {
                                while (widthOfWindow < 2 || widthOfWindow > 3) {
                                    if (widthOfWindow < 2) {
                                        System.out.println("You entered too small width for Window, Please enter in Range of 2 to 3");
                                        System.out.println("Enter Width of Door :");
                                        widthOfWindow = UI.promptToUserForGettingValidValue();
                                    } else if (widthOfWindow > 3) {
                                        System.out.println("You entered too high width for Window, Please enter in Range of 2 to 3");
                                        System.out.println("Enter Width of Door :");
                                        widthOfWindow = UI.promptToUserForGettingValidValue();
                                    }
                                }
                            }
                        } else if (heightOfWindow <= 0) {
                            System.out.println("Enter Height of Window :");
                            heightOfWindow = UI.promptToUserForGettingValidValue();
                            if (heightOfWindow > 0) {
                                while (heightOfWindow < 3 || heightOfWindow > 4) {
                                    if (heightOfWindow < 3) {
                                        System.out.println("You entered too small height for Window, Please enter in Range of 3 to 4");
                                        System.out.println("Enter Height of Door :");
                                        heightOfWindow = UI.promptToUserForGettingValidValue();
                                    } else if (heightOfWindow > 4) {
                                        System.out.println("You entered too high height for Window, Please enter in Range of 3 to 4");
                                        System.out.println("Enter Height of Door :");
                                        heightOfWindow = UI.promptToUserForGettingValidValue();
                                    }
                                }
                            }
                        } else if (heightOfWindow > 0) {
                            break;
                        }
                    } while (true);
                    try {
                        Window window = new Window(widthOfWindow, heightOfWindow);
                        System.out.println(window);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;

                case 4:
                    System.out.println("Enter Wall Paint Data   :");
                    coverageArea = 0;
                    pricePerGallon = 0;
                    paintType = "";
                    do {
                        if (paintType == "") {
                            System.out.println("Enter Paint type you want to use for Wall:");
                            paintType = promptToUserForGettingValidPaintType();
                        } else if (coverageArea <= 0) {
                            System.out.println("Enter Paint Coverage Area for Wall :");
                            coverageArea = promptToUserForGettingValidValue();
                        } else if (pricePerGallon <= 0) {
                            System.out.println("Enter Price per Gallon of Paint for Wall :");
                            pricePerGallon = promptToUserForGettingValidValue();
                        } else if (pricePerGallon > 0) {
                            break;
                        }
                    } while (true);
                    try {
                        Paint wallPaint = new Paint(coverageArea, pricePerGallon, paintType);
                        System.out.println("For WallPaint: " + wallPaint);
                        Room room = new Room();
                        room.addPaint(wallPaint);
                        Door door = new Door(widthOfDoor, heightOfDoor);
                        Window window = new Window(widthOfWindow, heightOfWindow);
                        WallWithDoor wallWithDoor = new WallWithDoor(width, height);
                        wallWithDoor.setDoor(door);
                        WallWithWindow wallWithWindow = new WallWithWindow(width, height);
                        wallWithWindow.setWindow(window);
                        room.setWalWithWindow(wallWithWindow);
                        room.setWallWithDoor(wallWithDoor);
                        costToPaintWalls = room.getCostToPaintWalls(wallPaint);

                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;

                case 5:
                    System.out.println("Enter Ceiling Paint Data   :");
                    coverageArea = 0;
                    pricePerGallon = 0;
                    paintType = "";
                    do {
                        if (paintType == "") {
                            System.out.println("Enter Paint type you want to use for Ceiling:");
                            paintType = UI.promptToUserForGettingValidPaintType();
                        } else if (coverageArea <= 0) {
                            System.out.println("Enter Paint Coverage Area for Ceiling :");
                            coverageArea = UI.promptToUserForGettingValidValue();
                        } else if (pricePerGallon <= 0) {
                            System.out.println("Enter Price per Gallon of Paint for Ceiling :");
                            pricePerGallon = UI.promptToUserForGettingValidValue();
                        } else if (pricePerGallon > 0) {
                            break;
                        }
                    } while (true);
                    try {
                        Paint ceilingPaint = new Paint(coverageArea, pricePerGallon, paintType);
                        System.out.println("For CeilingPaint: " + ceilingPaint);
                        Room room = new Room();
                        room.addPaint(ceilingPaint);
                        Ceiling ceiling = new Ceiling(length, width);
                        room.setCeiling(ceiling);
                        costToPaintCeiing = room.getCostToPaintCeiling(ceilingPaint);

                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;

                case 6:
                    System.out.println("Enter Door/Window Paint Data :");
                    coverageArea = 0;
                    pricePerGallon = 0;
                    paintType = "";
                    do {
                        if (paintType == "") {
                            System.out.println("Enter Paint type you want to use for Door/window :");
                            paintType = UI.promptToUserForGettingValidPaintType();
                        } else if (coverageArea <= 0) {
                            System.out.println("Enter Paint Coverage Area for Door/window :");
                            coverageArea = UI.promptToUserForGettingValidValue();
                        } else if (pricePerGallon <= 0) {
                            System.out.println("Enter Price per Gallon of Paint for Door/window :");
                            pricePerGallon = UI.promptToUserForGettingValidValue();
                        } else if (pricePerGallon > 0) {
                            break;
                        }
                    } while (true);
                    try {
                        Paint doorWindowPaint = new Paint(coverageArea, pricePerGallon, paintType);
                        System.out.println("For DoorWindowPaint: " + doorWindowPaint);
                        Room room = new Room();
                        room.addPaint(doorWindowPaint);
                        Door door = new Door(widthOfDoor, heightOfDoor);
                        Window window = new Window(widthOfWindow, heightOfWindow);
                        WallWithDoor wallWithDoor = new WallWithDoor(width, height);
                        wallWithDoor.setDoor(door);
                        WallWithWindow wallWithWindow = new WallWithWindow(width, height);
                        wallWithWindow.setWindow(window);
                        room.setWalWithWindow(wallWithWindow);
                        room.setWallWithDoor(wallWithDoor);
                        costToPaintDoorWindow = room.getCostToPaintDoorWindow(doorWindowPaint);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;

                case 7:
                    System.out.println("Enter Labor data :");
                    hourlyRate = 0;
                    numberOfHours = 0;
                    do {
                        if (hourlyRate <= 0) {
                            System.out.println("Enter Labor hourly Rate :");
                            hourlyRate = UI.promptToUserForGettingValidValue();
                        } else if (numberOfHours <= 0) {
                            System.out.println("Enter Labor number of hours :");
                            numberOfHours = UI.promptToUserForGettingValidValue();
                        } else if (numberOfHours > 0) {
                            break;
                        }
                    } while (true);
                    try {
                        Labor labor = new Labor(hourlyRate, numberOfHours);
                        System.out.println(labor);
                        Room room = new Room();
                        room.setLabor(labor);
                        totalLaborCost = room.getTotalLaborCost();
                        totalEstimate = room.getTotalEstimateToPaintRoom(costToPaintWalls, costToPaintCeiing, costToPaintDoorWindow);
                        //System.out.println(room);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;

                case 8:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Total Cost to Paint Walls: " + costToPaintWalls);
                    System.out.println("--------------------------------------------------------");
                    break;

                case 9:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Total Cost to Paint Ceiling: " + costToPaintCeiing);
                    System.out.println("--------------------------------------------------------");
                    break;

                case 10:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Total Cost to Paint Door and Window : " + costToPaintDoorWindow);
                    System.out.println("--------------------------------------------------------");
                    break;

                case 11:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Total Labor Cost : " + totalLaborCost);
                    System.out.println("--------------------------------------------------------");
                    break;

                case 12:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Total Estimate to Paint Room is $ " + totalEstimate);
                    System.out.println("--------------------------------------------------------");
                    Room room = new Room();
                    break;

                default:
                    System.out.println("Invalid choice\nTry Again !");
            }
        } while (choice != 0);
    }

    public static double promptToUserForGettingValidValue() {
        Scanner sc = new Scanner(System.in);
        double input = 0;
        try {
            input = sc.nextDouble();
            if (input > 0) {
                return input;
            } else {
                System.out.println("Entered input should be positive value");
            }
        } catch (InputMismatchException imme) {
            System.out.println("Entered input is not a numeric data.\tPlease enter the correct input.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

    public static String promptToUserForGettingValidPaintType() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        try {
            if (sc.hasNextLine()) {
                input = sc.nextLine();
            } else {
                System.out.println("You have entered an empty string.\tPlease enter the correct input.");
                sc.nextLine();
            }
        } catch (IllegalStateException ise) {
            System.out.println("You have entered an empty string.\tPlease enter the correct input.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return input;
    }
}
