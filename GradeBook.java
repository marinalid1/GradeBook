import java.util.ArrayList;

public class GradeBook {
    public static void main(String[] args) {
        // gradebook two dimesnional array that contains subjects and grades
        ArrayList<ArrayList<Object>> gradebook = new ArrayList<>();

        // ArrayList Object physicsGrade contains subject and grade and adds to gradebook
        ArrayList<Object> physicsGrade = new ArrayList<>();
        physicsGrade.add("physics");
        physicsGrade.add(98);
        gradebook.add(physicsGrade);

        // ArrayList Object calculusGrade contains subject and grade and adds to gradebook
        ArrayList<Object> calculusGrade = new ArrayList<>();
        calculusGrade.add("calculus");
        calculusGrade.add(97);
        gradebook.add(calculusGrade);

        // ArrayList Object poetryGrade contains subject and grade and adds to gradebook
        ArrayList<Object> poetryGrade = new ArrayList<>();
        poetryGrade.add("poetry");
        poetryGrade.add(85);
        gradebook.add(poetryGrade);

        // ArrayList Object historyGrade contains subject and grade and adds to gradebook
        ArrayList<Object> historyGrade = new ArrayList<>();
        historyGrade.add("history");
        historyGrade.add(98);
        gradebook.add(historyGrade);

        // ArrayList Object computerScienceGrade contains subject and grade and adds to gradebook
        ArrayList<Object> computerScienceGrade = new ArrayList<>();
        computerScienceGrade.add("computer science");
        computerScienceGrade.add(100);
        gradebook.add(computerScienceGrade);

        // ArrayList Object visualArtsGrade contains subject and grade and adds to gradebook
        ArrayList<Object> visualArtsGrade = new ArrayList<>();
        visualArtsGrade.add("visual arts");
        visualArtsGrade.add(93);
        gradebook.add(visualArtsGrade);


        // int to getlastRow of gradebook
        int lastRow = gradebook.size() - 1;
        // lastRowGrades object set to get last Row
        ArrayList<Object> lastRowGrades = gradebook.get(lastRow);
        // lastColumn gets last element of last Row
        int lastColumn = lastRowGrades.size() - 1;
        // lastElement object set to get last Element
        Object lastElement = lastRowGrades.get(lastColumn);

        // Integer newGrade converts lastElement to Integer and adds 5
        Integer newGrade = (Integer) lastElement + 5;
        // set lastRowGrades to lastColumn, newGrade
        lastRowGrades.set(lastColumn, newGrade);

        // set poetryGradeInex to index of poertry
        int poetryGradeIndex = 2;
        // selectedGrade object gets poetry element
        ArrayList<Object> selectedGrade = gradebook.get(poetryGradeIndex);
        // set grade index to second element in poetry array
        int gradeIndex = 1;
        // set selectedGrade to set(gradeIndex,  "pass")
        selectedGrade.set(gradeIndex, "pass");

        // for loop that loops through grade in gradebook
        for (ArrayList<Object> grade : gradebook) {
            // String subject that gets the first index of each grade
            String subject = (String) grade.get(0);
            // Object element score that gets second element in grade
            Object score = grade.get(1);
            // prints out subject and score
            System.out.println("Subject: " + subject + ", Score: " + score);
        }
    }
}      
