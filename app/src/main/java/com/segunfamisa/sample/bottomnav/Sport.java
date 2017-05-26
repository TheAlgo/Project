package com.segunfamisa.sample.bottomnav;

/**
 * Created by DHIRAJ KUMAR JAIN on 28-04-2017.
 */


    class Sport {

        //Member variables representing the title and information about the sport
        private String title;
        private String info;
        private final int imageResource;
        private String details;

        /**
         * Constructor for the Sport data model
         * @param title The name if the sport.
         * @param info Information about the sport.
         */
        Sport(String title, String info, int imageResource) {
            this.title = title;
            this.info = info;
            this.imageResource = imageResource;
            this.details=details;
        }

        /**
         * Gets the title of the sport
         * @return The title of the sport.
         */
        String getTitle() {
            return title;
        }
        /**
         * Gets the info about the sport
         * @return The info about the sport.
         */
        String getInfo() {
            return info;
        }
        public int getImageResource() {
            return imageResource;
        }
}
