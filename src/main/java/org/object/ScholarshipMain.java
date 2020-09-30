package org.object;

public class ScholarshipMain {
    public static void main(String[] args) {

        int x = 10; // x is a vraible of type int

        Scholarship // Type Of Reference Variable To The Object
                admissionFormBibhu // This is reference variable =
                = new // java keyword, to create object
                Scholarship() ; // invoking the constructor to create object of type AdmissionForm ;

        admissionFormBibhu.name = "Bibhu prasad";
        admissionFormBibhu.gradMarksInPercentage = 75;
        admissionFormBibhu.yearOfGraduation = 2019;
        admissionFormBibhu.universityRank = 24; // state

        System.out.println(admissionFormBibhu.getScholarshipAmount()); // behaviour

        //----------------------------------------------------------------------
        Scholarship admissionFormSaroj = new Scholarship();
        admissionFormSaroj.name = "Saroj kumar";
        admissionFormSaroj.gradMarksInPercentage = 85;
        admissionFormSaroj.yearOfGraduation= 2018;
        admissionFormSaroj.universityRank = 9;// state

        System.out.println(admissionFormSaroj.getScholarshipAmount()); // behaviour

        // --------------------------------------------------------------------
        System.out.println(admissionFormBibhu.getClass());


        System.out.println(admissionFormBibhu == admissionFormSaroj); // false
        System.out.println("Bibhu prasad: "+admissionFormBibhu.hashCode());
        System.out.println("Saroj kumar: "+admissionFormSaroj.hashCode());

        Scholarship admissionFormBibhuAnotherVariable = admissionFormBibhu;

        System.out.println(admissionFormBibhuAnotherVariable == admissionFormBibhu); // true

        System.out.println(admissionFormBibhu.hashCode());
        System.out.println(admissionFormBibhuAnotherVariable.hashCode());

    }
}
