/*
@MD.Kamrul Jaman
2017000000248
+8801686985152
 */
package assignmentgradingsystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class AssignmentGradingSystem {

    public void readData(String name) {
        //Try/catch 
        try (RandomAccessFile input = new RandomAccessFile(name, "r")) {
            Functions function = new Functions();
            //All-Variable
            String line;
            //For Calculate Attendance
            int[] QuizzesMark1 = new int[5];//abul
            int[] QuizzesMark2 = new int[5];//Babul
            int[] QuizzesMark3 = new int[5];//Ratul
            int[] QuizzesMark4 = new int[5];//Putul
            int[] QuizzesMark5 = new int[5];////Tetul
            //For Calculate Assessment
            double[] assessment = new double[5];
            //For Print All Calculation Constant Thing
            String[] ResultHeadLine = {"Name", "Attend", "Assment", "T-Score", "Graede"};
            String[] abul = new String[5];
            abul[0] = "abul";
            String[] babul = new String[5];
            babul[0] = "babul";
            String[] ratul = new String[5];
            ratul[0] = "ratul";
            String[] putul = new String[5];
            putul[0] = "putul";
            String[] tetul = new String[5];
            tetul[0] = "tetul";
            //Variable for quizze

            // headers/metadata
            line = input.readLine();//Line 0
            System.out.println(line);
            line = input.readLine();//Line 1
            System.out.println(line);

            //Line to tokens initialize
            line = input.readLine();
            System.out.println(line);
            String[] line1 = line.split("\\,");//Line 1
            line = input.readLine();
            System.out.println(line);
            String[] line2 = line.split("\\,");//Line 2
            line = input.readLine();
            System.out.println(line);
            String[] line3 = line.split("\\,");//Line 3
            line = input.readLine();
            System.out.println(line);
            String[] line4 = line.split("\\,");//Line 4
            line = input.readLine();
            System.out.println(line);
            String[] line5 = line.split("\\,");//Line 5 

            //Attendance Calculation And initialize
            double Attendance1 = function.Attendance(Integer.parseInt(line1[2]));
            abul[1] = Double.toString(Attendance1);
            double Attendance2 = function.Attendance(Integer.parseInt(line2[2]));
            babul[1] = Double.toString(Attendance2);
            double Attendance3 = function.Attendance(Integer.parseInt(line3[2]));
            ratul[1] = Double.toString(Attendance3);
            double Attendance4 = function.Attendance(Integer.parseInt(line4[2]));
            putul[1] = Double.toString(Attendance4);
            double Attendance5 = function.Attendance(Integer.parseInt(line5[2]));
            tetul[1] = Double.toString(Attendance5);
            //Initialize QuizzeMark1 Abul
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    try {
                        QuizzesMark1[i] = Integer.parseInt(line1[3]);
                    } catch (Exception e) {
                        QuizzesMark1[i] = 0;
                    }
                }
                if (i == 1) {
                    try {
                        QuizzesMark1[i] = Integer.parseInt(line1[4]);
                    } catch (Exception e) {
                        QuizzesMark1[i] = 0;
                    }
                }
                if (i == 2) {
                    try {
                        QuizzesMark1[i] = Integer.parseInt(line1[5]);
                    } catch (Exception e) {
                        QuizzesMark1[i] = 0;
                    }
                }
                if (i == 3) {
                    try {
                        QuizzesMark1[i] = Integer.parseInt(line1[6]);
                    } catch (Exception e) {
                        QuizzesMark1[i] = 0;
                    }
                }
                if (i == 4) {
                    try {
                        QuizzesMark1[i] = Integer.parseInt(line1[7]);
                    } catch (Exception e) {
                        QuizzesMark1[i] = 0;
                    }
                }
            }
            ////Initialize QuizzeMark1 babul
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    try {
                        QuizzesMark2[i] = Integer.parseInt(line2[3]);
                    } catch (Exception e) {
                        QuizzesMark2[i] = 0;
                    }
                }
                if (i == 1) {
                    try {
                        QuizzesMark2[i] = Integer.parseInt(line2[4]);
                    } catch (Exception e) {
                        QuizzesMark2[i] = 0;
                    }
                }
                if (i == 2) {
                    try {
                        QuizzesMark2[i] = Integer.parseInt(line2[5]);
                    } catch (Exception e) {
                        QuizzesMark2[i] = 0;
                    }
                }
                if (i == 3) {
                    try {
                        QuizzesMark2[i] = Integer.parseInt(line2[6]);
                    } catch (Exception e) {
                        QuizzesMark2[i] = 0;
                    }
                }
                if (i == 4) {
                    try {
                        QuizzesMark2[i] = Integer.parseInt(line2[7]);
                    } catch (Exception e) {
                        QuizzesMark2[i] = 0;
                    }
                }
            }
            //Initialize QuizzeMark1 ratul
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    try {
                        QuizzesMark3[i] = Integer.parseInt(line3[3]);
                    } catch (Exception e) {
                        QuizzesMark3[i] = 0;
                    }
                }
                if (i == 1) {
                    try {
                        QuizzesMark3[i] = Integer.parseInt(line3[4]);
                    } catch (Exception e) {
                        QuizzesMark3[i] = 0;
                    }
                }
                if (i == 2) {
                    try {
                        QuizzesMark3[i] = Integer.parseInt(line3[5]);
                    } catch (Exception e) {
                        QuizzesMark3[i] = 0;
                    }
                }
                if (i == 3) {
                    try {
                        QuizzesMark3[i] = Integer.parseInt(line3[6]);
                    } catch (Exception e) {
                        QuizzesMark3[i] = 0;
                    }
                }
                if (i == 4) {
                    try {
                        QuizzesMark3[i] = Integer.parseInt(line3[7]);
                    } catch (Exception e) {
                        QuizzesMark3[i] = 0;
                    }
                }
            }
            ////Initialize QuizzeMark1 putul
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    try {
                        QuizzesMark4[i] = Integer.parseInt(line4[3]);
                    } catch (Exception e) {
                        QuizzesMark4[i] = 0;
                    }
                }
                if (i == 1) {
                    try {
                        QuizzesMark4[i] = Integer.parseInt(line4[4]);
                    } catch (Exception e) {
                        QuizzesMark4[i] = 0;
                    }
                }
                if (i == 2) {
                    try {
                        QuizzesMark4[i] = Integer.parseInt(line4[5]);
                    } catch (Exception e) {
                        QuizzesMark4[i] = 0;
                    }
                }
                if (i == 3) {
                    try {
                        QuizzesMark4[i] = Integer.parseInt(line4[6]);
                    } catch (Exception e) {
                        QuizzesMark4[i] = 0;
                    }
                }
                if (i == 4) {
                    try {
                        QuizzesMark4[i] = Integer.parseInt(line4[7]);
                    } catch (Exception e) {
                        QuizzesMark4[i] = 0;
                    }
                }
            }
            ////Initialize QuizzeMark1 Tetul
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    try {
                        QuizzesMark5[i] = Integer.parseInt(line5[3]);
                    } catch (Exception e) {
                        QuizzesMark5[i] = 0;
                    }
                }
                if (i == 1) {
                    try {
                        QuizzesMark5[i] = Integer.parseInt(line5[4]);
                    } catch (Exception e) {
                        QuizzesMark5[i] = 0;
                    }
                }
                if (i == 2) {
                    try {
                        QuizzesMark5[i] = Integer.parseInt(line5[5]);
                    } catch (Exception e) {
                        QuizzesMark5[i] = 0;
                    }
                }
                if (i == 3) {
                    try {
                        QuizzesMark5[i] = Integer.parseInt(line5[6]);
                    } catch (Exception e) {
                        QuizzesMark5[i] = 0;
                    }
                }
                if (i == 4) {
                    try {
                        QuizzesMark5[i] = Integer.parseInt(line5[7]);
                    } catch (Exception e) {
                        QuizzesMark5[i] = 0;
                    }
                }
            }
            //Count All 4 quizzes out of 5 (Assessment)
            // Assessment Save on Student name array like,abul[2]// Name index of array all are Assessment mark
            abul[2] = Double.toString(function.Assessment(QuizzesMark1));
            babul[2] = Double.toString(function.Assessment(QuizzesMark2));
            ratul[2] = Double.toString(function.Assessment(QuizzesMark3));
            putul[2] = Double.toString(function.Assessment(QuizzesMark4));
            tetul[2] = Double.toString(function.Assessment(QuizzesMark5));
            //Assesment Variable initialization
            double assessment1 = function.Assessment(QuizzesMark1);
            double assessment2 = function.Assessment(QuizzesMark2);
            double assessment3 = function.Assessment(QuizzesMark3);
            double assessment4 = function.Assessment(QuizzesMark4);
            double assessment5 = function.Assessment(QuizzesMark5);

            //Calculation & initialization Total Score
            //Total Score Save on New name T-Score array like,abul[3]
            //Use initialization midmark and finalmark //double mark line1index[8] final mark line1index [9]
            //midmark
            double midmark1 = Double.parseDouble(line1[8]);
            double midmark2 = Double.parseDouble(line2[8]);
            double midmark3 = Double.parseDouble(line3[8]);
            double midmark4 = Double.parseDouble(line4[8]);
            double midmark5 = Double.parseDouble(line5[8]);

            //finalmark
            double finalmark1 = Double.parseDouble(line1[9]);
            double finalmark2 = Double.parseDouble(line2[9]);
            double finalmark3 = Double.parseDouble(line3[9]);
            double finalmark4 = Double.parseDouble(line4[9]);
            double finalmark5 = Double.parseDouble(line5[9]);

            //initialization Total Score on abul[3] also initialization  totalScore1 variable
            abul[3] = Double.toString(function.Add(midmark1, finalmark1, Attendance1, assessment1));
            double totalScore1 = Double.parseDouble(abul[3]);
            babul[3] = Double.toString(function.Add(midmark2, finalmark2, Attendance2, assessment2));
            double totalScore2 = Double.parseDouble(babul[3]);
            ratul[3] = Double.toString(function.Add(midmark3, finalmark3, Attendance3, assessment3));
            double totalScore3 = Double.parseDouble(ratul[3]);
            putul[3] = Double.toString(function.Add(midmark4, finalmark4, Attendance4, assessment4));
            double totalScore4 = Double.parseDouble(putul[3]);
            tetul[3] = Double.toString(function.Add(midmark5, finalmark5, Attendance5, assessment5));
            double totalScore5 = Double.parseDouble(tetul[3]);

            //Counting and initialization Grade / use totalscore and store on abul[4]
            String grade1, grade2, grade3, grade4, grade5;

            grade1 = function.Grade(totalScore1);
            abul[4] = grade1;
            grade2 = function.Grade(totalScore2);
            babul[4] = grade2;
            grade3 = function.Grade(totalScore3);
            ratul[4] = grade3;
            grade4 = function.Grade(totalScore4);
            putul[4] = grade4;
            grade5 = function.Grade(totalScore5);
            tetul[4] = grade5;

            //Print All Result of Attend/Assessment/Total Score/Grade
            for (String t : ResultHeadLine) {
                System.out.print("\t" + t);
            }
            System.out.print("\n");
            for (String t : abul) {
                System.out.print("\t" + t);
            }
            System.out.print("\n");
            for (String t : babul) {
                System.out.print("\t" + t);
            }
            System.out.print("\n");
            for (String t : ratul) {
                System.out.print("\t" + t);
            }
            System.out.print("\n");
            for (String t : putul) {
                System.out.print("\t" + t);
            }
            System.out.print("\n");
            for (String t : tetul) {
                System.out.print("\t" + t);
            }
            System.out.println("\n");
            //Counting And Quizze Quizze min,maximum,avarage,standard deviation

            int[] quizze1 = new int[5];
            int[] quizze2 = new int[5];
            int[] quizze3 = new int[5];
            int[] quizze4 = new int[5];
            int[] quizze5 = new int[5];

            // Quizze 1 Mark Initial on Quizze1 Array 
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    try {
                        quizze1[i] = Integer.parseInt(line1[3]);
                    } catch (Exception e) {
                        quizze1[i] = 0;
                    }
                }
                if (i == 1) {
                    try {
                        quizze1[i] = Integer.parseInt(line2[3]);
                    } catch (Exception e) {
                        quizze1[i] = 0;
                    }
                }
                if (i == 2) {
                    try {
                        quizze1[i] = Integer.parseInt(line3[3]);
                    } catch (Exception e) {
                        quizze1[i] = 0;
                    }
                }
                if (i == 3) {
                    try {
                        quizze1[i] = Integer.parseInt(line4[3]);
                    } catch (Exception e) {
                        quizze1[i] = 0;
                    }
                }
                if (i == 4) {
                    try {
                        quizze1[i] = Integer.parseInt(line5[3]);
                    } catch (Exception e) {
                        quizze1[i] = 0;
                    }
                }

            }
            // Quizze 2 Mark Initial on Quizze2 Array 
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    try {
                        quizze2[i] = Integer.parseInt(line1[4]);
                    } catch (Exception e) {
                        quizze2[i] = 0;
                    }
                }
                if (i == 1) {
                    try {
                        quizze2[i] = Integer.parseInt(line2[4]);
                    } catch (Exception e) {
                        quizze2[i] = 0;
                    }
                }
                if (i == 2) {
                    try {
                        quizze2[i] = Integer.parseInt(line3[4]);
                    } catch (Exception e) {
                        quizze2[i] = 0;
                    }
                }
                if (i == 3) {
                    try {
                        quizze2[i] = Integer.parseInt(line4[4]);
                    } catch (Exception e) {
                        quizze2[i] = 0;
                    }
                }
                if (i == 4) {
                    try {
                        quizze2[i] = Integer.parseInt(line5[4]);
                    } catch (Exception e) {
                        quizze2[i] = 0;
                    }
                }

            }
            // Quizze 3 Mark Initial on Quizze3 Array 
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    try {
                        quizze3[i] = Integer.parseInt(line1[5]);
                    } catch (Exception e) {
                        quizze3[i] = 0;
                    }
                }
                if (i == 1) {
                    try {
                        quizze3[i] = Integer.parseInt(line2[5]);
                    } catch (Exception e) {
                        quizze3[i] = 0;
                    }
                }
                if (i == 2) {
                    try {
                        quizze3[i] = Integer.parseInt(line3[5]);
                    } catch (Exception e) {
                        quizze3[i] = 0;
                    }
                }
                if (i == 3) {
                    try {
                        quizze3[i] = Integer.parseInt(line4[5]);
                    } catch (Exception e) {
                        quizze3[i] = 0;
                    }
                }
                if (i == 4) {
                    try {
                        quizze3[i] = Integer.parseInt(line5[5]);
                    } catch (Exception e) {
                        quizze3[i] = 0;
                    }
                }

            }
            // Quizze 4 Mark Initial on Quizze4 Array 
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    try {
                        quizze4[i] = Integer.parseInt(line1[6]);
                    } catch (Exception e) {
                        quizze4[i] = 0;
                    }
                }
                if (i == 0) {
                    try {
                        quizze4[i] = Integer.parseInt(line1[6]);
                    } catch (Exception e) {
                        quizze4[i] = 0;
                    }
                }
                if (i == 1) {
                    try {
                        quizze4[i] = Integer.parseInt(line2[6]);
                    } catch (Exception e) {
                        quizze4[i] = 0;
                    }
                }
                if (i == 2) {
                    try {
                        quizze4[i] = Integer.parseInt(line3[6]);
                    } catch (Exception e) {
                        quizze4[i] = 0;
                    }
                }
                if (i == 3) {
                    try {
                        quizze4[i] = Integer.parseInt(line4[6]);
                    } catch (Exception e) {
                        quizze4[i] = 0;
                    }
                }
                if (i == 4) {
                    try {
                        quizze4[i] = Integer.parseInt(line5[6]);
                    } catch (Exception e) {
                        quizze4[i] = 0;
                    }
                }

            }
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    try {
                        quizze5[i] = Integer.parseInt(line1[7]);
                    } catch (Exception e) {
                        quizze5[i] = 0;
                    }
                }
                if (i == 1) {
                    try {
                        quizze5[i] = Integer.parseInt(line2[7]);
                    } catch (Exception e) {
                        quizze5[i] = 0;
                    }
                }
                if (i == 2) {
                    try {
                        quizze5[i] = Integer.parseInt(line3[7]);
                    } catch (Exception e) {
                        quizze5[i] = 0;
                    }
                }
                if (i == 3) {
                    try {
                        quizze5[i] = Integer.parseInt(line4[7]);
                    } catch (Exception e) {
                        quizze5[i] = 0;
                    }
                }
                if (i == 4) {
                    try {
                        quizze5[i] = Integer.parseInt(line5[7]);
                    } catch (Exception e) {
                        quizze5[i] = 0;
                    }
                }

            }
            //Print And counting Min,Max,Avg,Std
            //quizze1-quizze5
            System.out.println("\t\tMin\tMax\tAvg\tStd");//Headline of min,maximum,avarage,standard deviation
            String[] Q1 = new String[5];
            Q1[0] = "Q1";
            String[] Q2 = new String[5];
            Q2[0] = "Q2";
            String[] Q3 = new String[5];
            Q3[0] = "Q3";
            String[] Q4 = new String[5];
            Q4[0] = "Q4";
            String[] Q5 = new String[5];
            Q5[0] = "Q5";
            //counting All minimum index[1] Q
            Q1[1] = Integer.toString(function.Min(quizze1));
            Q2[1] = Integer.toString(function.Min(quizze2));
            Q3[1] = Integer.toString(function.Min(quizze3));
            Q4[1] = Integer.toString(function.Min(quizze4));
            Q5[1] = Integer.toString(function.Min(quizze5));

            //counting All Maximum index[2] Q
            Q1[2] = Integer.toString(function.Max(quizze1));
            Q2[2] = Integer.toString(function.Max(quizze2));
            Q3[2] = Integer.toString(function.Max(quizze3));
            Q4[2] = Integer.toString(function.Max(quizze4));
            Q5[2] = Integer.toString(function.Max(quizze5));

            //counting All Avarage index[3] Q
            Q1[3] = Double.toString(function.Avarage(quizze1));
            Q2[3] = Double.toString(function.Avarage(quizze2));
            Q3[3] = Double.toString(function.Avarage(quizze3));
            Q4[3] = Double.toString(function.Avarage(quizze4));
            Q5[3] = Double.toString(function.Avarage(quizze5));

            //counting Std index[4]
            Q1[4] = Double.toString(function.StD(quizze1));
            Q2[4] = Double.toString(function.StD(quizze2));
            Q3[4] = Double.toString(function.StD(quizze3));
            Q4[4] = Double.toString(function.StD(quizze4));
            Q5[4] = Double.toString(function.StD(quizze5));

            //Print All Quizze Max,Min,Avg,Std
            for (String t : Q1) {
                System.out.print("\t" + t);
            }
            System.out.print("\n");
            for (String t : Q2) {
                System.out.print("\t" + t);
            }
            System.out.print("\n");
            for (String t : Q3) {
                System.out.print("\t" + t);
            }
            System.out.print("\n");
            for (String t : Q4) {
                System.out.print("\t" + t);
            }
            System.out.print("\n");
            for (String t : Q5) {
                System.out.print("\t" + t);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IOException occured");
        }

    }

    //AssignmentGradingSystem Sub Main Method
    public AssignmentGradingSystem() {
        readData("data.csv");

    }

    // Main Method    
    public static void main(String[] args) {
        AssignmentGradingSystem assignmentGradingSystem = new AssignmentGradingSystem();
    }
}
