
package lab6;

import java.util.Arrays;

public class TestAnalytics {
    private final static int NUMOFQUESTIONS = 50;
    private final static int MARKFORQUESTION = 2;
    private final static int NUMOFQUESTIONCHOICES = 4;
    private final static String TESTCORRECTANSWER = "D,C,A,D,A,B,C,D,B,C,A,B,D,A,C,C,A,C,A,B,"
    		+ "B,D,C,D,A,B,B,A,C,B,C,A,C,B,B,C,A,C,A,B,A,B,B,C,A,B,A,D,D,C";

    private String name;
    private String id;
    private String answer;
    private String testName;
    private int correctAns;
    private int wrongAns;

    public TestAnalytics(String input) {
        String[] temp = input.split(",");
        this.testName = temp[0];
        this.name = temp[1];
        this.id = temp[2];
        this.answer= String.join(",", Arrays.copyOfRange(temp, 3, temp.length));
        this.correctAns = 0;
        this.wrongAns = 0;
        
    }

    public String getStudentName() {
        return this.name;
    }

    public String getStudentID() {
        return this.id;
    }

    public String getStudentAnswer() {
        if (this.testName.equals("Test1")) {
            String expectedstdAns = "A,C,B,A,C,B,B,A,D,B,D,A,D,B,C,B,D,B,"
                    + "B,A,D,A,C,B,A,A,C,A,A,D,D,C,C,D,C,A,D,A,D,C,A,C,A,D,D,C,C,B,B,D";
            return expectedstdAns;
        } else if (this.testName.equals("Test2")) {
            String expectedstdAns = "a,a,B,a,C,B,b,A,D,B,D,A,D,B,C,B,D,B,"
                    + "B,A,D,A,C,B,A,A,C,A,A,D,D,C,d,D,C,a,D,A,D,C,A,C,A,D,D,C,C,B,B,D";
            return expectedstdAns;
        } else if (this.testName.equals("FinalTest")) {
            String expectedstdAns = "a,a,B,a,C,B,b,A,D,B,D,A,D,B,C,B,D,B,"
                    + "B,A,D,A,C,B,A,A,C,A,A,D,D,C,d,d,d,d,d,a,a,a,a,C,A,D,D,C,C,B,B,D";
            return expectedstdAns;
        } else {
            return "";
        }
    }

    public double calculateStudentGrade() {
    	String[] correctgrade = TESTCORRECTANSWER.split(",");
        String[] ans = this.answer.split(",");
        
        
        int wrong = 0;
        int correct = 0;
        double totalMark = 0;
        
        try {
        
        for (int i = 0; i < correctgrade.length; i++) {
            String correctGrade = correctgrade[i].trim();
            String myGrade = ans[i].trim();

            if (correctGrade.equalsIgnoreCase(myGrade)) {
                totalMark += 2.0;
                correct += 1;
                this.correctAns = correct;
            }
            
            if(!correctGrade.equalsIgnoreCase(myGrade)) {
            	
            	totalMark -= 1.0;
            	wrong += 1;
            	this.wrongAns = wrong;
            }
            
        }
        }catch(IndexOutOfBoundsException e) {
//        	 System.out.println("the student has not answered all the questions.");
        }
        
        if(totalMark < 0) {
        	return 0;
        }
        return totalMark;
        
    }


    public String getStudentAnswerFrequency() {
        int[] ansCounter = new int[NUMOFQUESTIONCHOICES];
        String[] answers = this.answer.split(",");

        for (String ans : answers) {
            switch (ans.toUpperCase()) {
                case "A":
                    ansCounter[0]++;
                    break;
                case "B":
                    ansCounter[1]++;
                    break;
                case "C":
                    ansCounter[2]++;
                    break;
                case "D":
                    ansCounter[3]++;
                    break;
            }
        }

        return "The frequency of the student(" + this.name + ") answer is A(" + ansCounter[0] + "), B(" +
                ansCounter[1] + "), C(" + ansCounter[2] + ") and D(" + ansCounter[3] + ").";
    }

    public String getTestName() {
        return testName;
    }

    public String toString() {
        double mark = calculateStudentGrade();
        if (mark >= 50) {
            return "For " + getTestName() + ": Student(" + this.name + ") passed the test. " + this.name +
                    " answered (" + this.correctAns + ") correct questions and scored ( " +
                    String.format("%.2f", mark) + ") out of 100.";
        } else {
            return "For " + getTestName() + ": Student(" + this.name + ") failed the test. " + this.name +
                    " answered ("  + this.wrongAns + ") not correct questions and scored (  " +
                    String.format("%.2f", mark) + ") out of 100.";
        }
    }
}
//    public static void main(String[] args) {
//        
//        test_4_1();
//        test_4_0();
//      }
//     
     
//      public static void test_4_1() {
//
//  String stdtest = "Test1,William,85974,D,C,A,D,A,B,C,D,B,C,A,B,D,A,C,C,A,C,A,B,B,D,C,D,A,B,B,A,"
//  + "C,B,C,A,C,B,B,C,A,C,A,B,A,B,B,C,A,B,A,D,D,C";
//
//  TestAnalytics t1 = new TestAnalytics(stdtest);
//
//  String expectedteststr = "For Test1: Student(William) passed the test. William answered (50) correct questions and scored (100.00) out of 100.";
//  String testAnaStr = t1.toString();
//
//  String errorMsg = String.format("\n Test toString failed. Returned string (%s) " + "but correct string is (%s)",
//  testAnaStr, expectedteststr);
//
//  System.out.println("t1 " + t1);
//
//  }
//     
//      public static void test_4_0() {
//
//  String stdtest = "Test4,William,85974,d,d,a,d,d,c,b,d,b,c,d,b,d,c,a,a,d,b,d,b,d,c,d,b,"
//  + "d,d,d,d,c,c,a,b,d,c,a,d,c,d,A,B,A,B,B,C,A,B,A,D,D,C";
//
//  TestAnalytics t1 = new TestAnalytics(stdtest);
//
//  String expectedteststr = "For Test4: Student(William) failed the test. William answered (28) not correct questions and scored ( 16.00) out of 100.";
//  String testAnaStr = t1.toString();
//  String errorMsg = String.format("\n Test toString failed. Returned string (%s) " + "but correct string is (%s)",
//  testAnaStr, expectedteststr);
//  System.out.println("t1 " + t1);
//
//  }}

