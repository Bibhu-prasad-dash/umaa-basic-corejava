package org.object;

public class Scholarship {

        public String name;
        public Integer gradMarksInPercentage;
        public Integer yearOfGraduation;
        public Integer universityRank;

        // no system.out.println statements
        public Integer getScholarshipAmount()
        {
            if(universityRank >=1 && universityRank <= 50)
            {
                return 70;
            }

            if(universityRank >=51 && universityRank <= 150)
            {
                return 50;
            }

            if(universityRank >=151 && universityRank <= 250)
            {
                return 30;
            }

            if(universityRank >=250 )
            {
                return 0;
            }

            return 0;
        }


    }
