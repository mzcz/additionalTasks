package com.additionaltasks.file_reader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;

public class File_Input {

    public void ReadFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/plik_wejsciowy.txt").getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){

            String inputString = String.valueOf(fileLines.findAny());
            inputString = inputString.substring(inputString.indexOf("[")+1);

            String strFind = ",";
            int count = 0, fromIndex = 0, previousIndex = 0;

            String name = null;
            String lastName = null;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
            LocalDate year = null;
            String phone = null;

            Set<User> usersSet = new HashSet<>();

            while ((fromIndex = inputString.indexOf(strFind, fromIndex)) != -1 ){

                count++;
                fromIndex++;

                if (count % 4 == 0 ) {

                    String text = inputString.substring(previousIndex,fromIndex);

                    int  countInside = 0, previousIndexInside = 0, fromIndexInside = 0;

                    while ((fromIndexInside = text.indexOf(strFind, fromIndexInside)) != -1 ){
                        if (countInside == 0) {
                            name = text.substring(previousIndexInside, fromIndexInside);
                        } else if (countInside == 1){
                            lastName = text.substring(previousIndexInside, fromIndexInside);
                        } else if (countInside == 2){
                            year = LocalDate.parse(text.substring(previousIndexInside, fromIndexInside),formatter);
                        } else if (countInside == 3){
                            phone = text.substring(previousIndexInside, fromIndexInside);
                        }

                        countInside++;
                        fromIndexInside++;

                        previousIndexInside = fromIndexInside;

                    }

                    User user = new User(fromIndex,name,lastName,year,phone);
                    usersSet.add(user);

                    previousIndex = fromIndex;

                }
            }

            printUsers(usersSet);


        } catch (IOException e) {
            throw new FileReaderException();
        }

    }

    private void  printUsers(Set<User> usersSet ){

        LocalDate currentDate = LocalDate.now();
        int allUsersCount = 0;
        LocalDate theOldestDate = LocalDate.now();
        String theOldestUser = "";
        for(User theWorker: usersSet) {

            long daysSinceBirth = currentDate.toEpochDay() - theWorker.getBirthDate().toEpochDay();
            daysSinceBirth = daysSinceBirth / 365;

            if (theOldestDate.isAfter(theWorker.getBirthDate()) && !theWorker.getPhone().isEmpty()) {
                theOldestDate = theWorker.getBirthDate();
                theOldestUser = theWorker.getFirstname() + " " + theWorker.getLastName()
                        + " " + theOldestDate + " " + theWorker.getPhone();
            };

            System.out.println(theWorker.getFirstname() + " " + theWorker.getLastName() + " "
                    + daysSinceBirth + " " + theWorker.getPhone());

            allUsersCount++;
        }
        System.out.println("All users " + allUsersCount + " , the oldest User with phone is " + theOldestUser);

    }
}
