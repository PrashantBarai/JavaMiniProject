package Controller;

import Model.Model;
import View.View;
import Model.Athlete;
import Model.manageAthlete;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * Identification comments:
 *   Name: Prashant Barai and Ammar Ansari
 *   Experiment No: 10,11,12
 *   Experiment Title: Implementing view class in java using swing and AWT for your chosen case study using MVC Architecture.
 *   Experiment Date: 27/09/2023
 *   @version 1.0
 *
 * Beginning comments:
 *   Filename: Controller.java
 *   Author: @Prashant_Barai and @Ammar_Ansari
 *   Overview: The Controller class acts as the intermediary between the Model and View components in the MVC (Model-View-Controller) architectural pattern.
 *   Its primary role is to manage user interactions, handle input from the View, and update the Model or View accordingly.
 */

public class Controller{
    Model model;
    View view;

    String what_clicked = "";

    public Controller(Model m, View v) {
        model = m;
        view = v;
        //view.centerInitialSetup(model.getManageAthleteData().getLinesBeingDisplayed(), model.getManageAthleteData().getHeaders().size());
        //view.centerUpdate(model.getManageAthleteData().getLines(model.getManageAthleteData().getFirstLineToDisplay(), model.getManageAthleteData().getLastLineToDisplay()), model.getManageAthleteData().getHeaders());
        addScrolling();
        addButtonClick();
    }

        private void addButtonClick ()
        {
            view.getMf().getIp().getBp().getBtn_athlete().addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent me) {
                    System.out.println("Athlete Pressed");
                    what_clicked = "Athlete";

                    view.centerInitialSetup(model.getManageAthleteData().getLinesBeingDisplayed(), model.getManageAthleteData().getHeaders().size());
                    view.centerUpdate(model.getManageAthleteData().getLines(model.getManageAthleteData().getFirstLineToDisplay(), model.getManageAthleteData().getLastLineToDisplay()), model.getManageAthleteData().getHeaders());
                }
            });

            view.getMf().getIp().getBp().getBtn_competition().addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent me) {
                        System.out.println("Competition Pressed");
                        what_clicked = "Competition";
                        view.centerInitialSetup(model.getManageCompetitionData().getLinesBeingDisplayed(), model.getManageCompetitionData().getHeaders().size());
                        view.centerUpdate(model.getManageCompetitionData().getLines(model.getManageCompetitionData().getFirstLineToDisplay(), model.getManageCompetitionData().getLastLineToDisplay()), model.getManageCompetitionData().getHeaders());
                    }
            });

            view.getMf().getIp().getBp().getBtn_participation().addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent me) {
                    System.out.println("Participation Pressed");
                    what_clicked = "Participation";
//                    view.centerInitialSetup(model.getManageCompetitionData().getLinesBeingDisplayed(), model.getManageCompetitionData().getHeaders().size());
//                    view.centerUpdate(model.getManageCompetitionData().getLines(model.getManageCompetitionData().getFirstLineToDisplay(), model.getManageCompetitionData().getLastLineToDisplay()), model.getManageCompetitionData().getHeaders());
                }
            });

            view.getMf().getIp().getBp().getUpdateButton().addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent me) {
                    System.out.println("Update Pressed");
                    what_clicked = "Update";
//                    view.centerInitialSetup(model.getManageCompetitionData().getLinesBeingDisplayed(), model.getManageCompetitionData().getHeaders().size());
//                    view.centerUpdate(model.getManageCompetitionData().getLines(model.getManageCompetitionData().getFirstLineToDisplay(), model.getManageCompetitionData().getLastLineToDisplay()), model.getManageCompetitionData().getHeaders());
                }
            });
        }

        private void addScrolling ()
        {
            view.getMf().getIp().getCp().addMouseWheelListener(new MouseWheelListener() {
                @Override
                public void mouseWheelMoved(MouseWheelEvent e) {
                    int units = e.getUnitsToScroll();
                    System.out.println(units);
                    if (what_clicked == "Athlete") {

//                    if (activeTable == ActiveTable.ATHLETE) {
                        // Handle scrolling logic for the athlete table
                        int current_first_line = model.getManageAthleteData().getFirstLineToDisplay();
                        int current_last_line = model.getManageAthleteData().getLastLineToDisplay();
                        int no_of_players = model.getManageAthleteData().getTable().size();
                        int no_of_display_lines = model.getManageAthleteData().getLinesBeingDisplayed();


                        if (units <= 0 && current_first_line == 0) {
                            model.getManageAthleteData().setFirstLineToDisplay(0);
                        } else if (units <= 0 && current_first_line > 0) {
                            int new_first_line = current_first_line + units;
                            if (new_first_line <= 0) {
                                model.getManageAthleteData().setFirstLineToDisplay(0);
                            } else {
                                model.getManageAthleteData().setFirstLineToDisplay(new_first_line);
                            }
                        } else if (units > 0 && current_last_line == no_of_players - 1) {
                            model.getManageAthleteData().setFirstLineToDisplay(current_first_line);
                        } else if (units > 0 && current_last_line < no_of_players - 1) {
                            int new_first_line = current_first_line + units;
                            if (new_first_line > no_of_players - no_of_display_lines) {
                                new_first_line = no_of_players - no_of_display_lines;
                                model.getManageAthleteData().setFirstLineToDisplay(new_first_line);
                            } else {
                                model.getManageAthleteData().setFirstLineToDisplay(new_first_line);
                            }
                        }
                        view.centerUpdate(model.getManageAthleteData().getLines(model.getManageAthleteData().getFirstLineToDisplay(), model.getManageAthleteData().getLastLineToDisplay()), model.getManageAthleteData().getHeaders());

                    }

                 else if(what_clicked == "Competition"){
                      //  if (activeTable == ActiveTable.ATHLETE) {
                            // Handle scrolling logic for the athlete table
                            int current_first_line = model.getManageCompetitionData().getFirstLineToDisplay();
                            int current_last_line = model.getManageCompetitionData().getLastLineToDisplay();
                            int no_of_players = model.getManageCompetitionData().getTable().size();
                            int no_of_display_lines = model.getManageCompetitionData().getLinesBeingDisplayed();


                            if (units <= 0 && current_first_line == 0) {
                                model.getManageCompetitionData().setFirstLineToDisplay(0);
                            } else if (units <= 0 && current_first_line > 0) {
                                int new_first_line = current_first_line + units;
                                if (new_first_line <= 0) {
                                    model.getManageCompetitionData().setFirstLineToDisplay(0);
                                } else {
                                    model.getManageCompetitionData().setFirstLineToDisplay(new_first_line);
                                }
                            } else if (units > 0 && current_last_line == no_of_players - 1) {
                                model.getManageCompetitionData().setFirstLineToDisplay(current_first_line);
                            } else if (units > 0 && current_last_line < no_of_players - 1) {
                                int new_first_line = current_first_line + units;
                                if (new_first_line > no_of_players - no_of_display_lines) {
                                    new_first_line = no_of_players - no_of_display_lines;
                                    model.getManageCompetitionData().setFirstLineToDisplay(new_first_line);
                                } else {
                                    model.getManageCompetitionData().setFirstLineToDisplay(new_first_line);
                                }
                            }
                            view.centerUpdate(model.getManageCompetitionData().getLines(model.getManageCompetitionData().getFirstLineToDisplay(), model.getManageCompetitionData().getLastLineToDisplay()), model.getManageCompetitionData().getHeaders());

                        }
                }
            });}

    public void updateAthlete(int athleteId, String newathlete_name, double newheight, double newweight,String newgender,String newnationality,String newemail,long newmobile_no) {
        // Find the athlete to update by their ID
        for (Athlete athlete : model.getManageAthleteData().getAthletes()) {
            if (athlete.getId() == athleteId) {
                athlete.setAthlete_name(newathlete_name);
                athlete.setHeight(newheight);
                athlete.setWeight(newweight);
                athlete.setGender(newgender);
                athlete.setNationality(newnationality);
                athlete.setEmail(newemail);
                athlete.setMobileNo(newmobile_no);
                break; // Assuming athlete IDs are unique
            }
        }
    }

        }

