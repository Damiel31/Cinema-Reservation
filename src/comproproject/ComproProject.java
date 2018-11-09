package comproproject;

import java.util.Scanner;
import java.util.Arrays;

public class ComproProject {

    public static void main(String[] args) {

        Scanner alf = new Scanner(System.in);
        String ans = null;
        int HolderA = 11;
        int HolderB = 11;
        int HolderC = 11;

        String[] seatsforA = {"A-0", "A-1", "A-2", "A-3", "A-4", "A-5", "A-6", "A-7", "A-8", "A-9", "A-10",};

        String[] seatsforB = {"B-0", "B-1", "B-2", "B-3", "B-4", "B-5", "B-6", "B-7", "B-8", "B-9", "B-10",};

        String[] seatsforC = {"C-0", "C-1", "C-2", "C-3", "C-4", "C-5", "C-6", "C-7", "C-8", "C-9", "C-10",};
        do {
            int Aseats = HolderA;
            int Bseats = HolderB;
            int Cseats = HolderC;

            if (HolderA > 0 && HolderB > 0 && HolderC > 0) {

                System.out.println("**********************");
                System.out.println("*                    *");
                System.out.println("* Welcome to CinemaJ *");
                System.out.println("*    KIMI NO NAWA    *");
                System.out.println("*                    *");
                System.out.println("**********************");

                System.out.println("Pick a schedule");
                System.out.println("A: 11:00am - 12:30pm");
                System.out.println("B: 1:00pm - 2:30pm");
                System.out.println("C: 3:00pm - 4:30pm");

                System.out.print("Choose Schedule: ");
                String sched = alf.next();

                switch (sched) {
                    case "A":

                        do {

                            System.out.println("Available Seats: " + HolderA);
                            System.out.print("How many?: ");
                            int Aseat = alf.nextInt();
                            HolderA = HolderA - Aseat;

                            for (int x = 0; x < seatsforA.length; x++) {
                                System.out.print(" " + seatsforA[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Aseat; z++) {
                                System.out.print("Choose a seat A-: ");
                                int ChAseat = alf.nextInt();
                                seatsforA[ChAseat] = "";

                            }

                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));
                        break;

                    case "B":

                        do {

                            System.out.println("Available Seats: " + HolderB);
                            System.out.print("How many?: ");
                            int Bseat = alf.nextInt();
                            HolderB = HolderB - Bseat;

                            for (int x = 0; x < seatsforB.length; x++) {
                                System.out.print(" " + seatsforB[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Bseat; z++) {
                                System.out.print("Choose a seat B-: ");
                                int ChBseat = alf.nextInt();
                                seatsforB[ChBseat] = "";

                            }

                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));

                        break;

                    case "C":
                        do {

                            System.out.println("Available Seats: " + HolderC);
                            System.out.print("How many?: ");
                            int Cseat = alf.nextInt();
                            HolderC = HolderC - Cseat;

                            for (int x = 0; x < seatsforC.length; x++) {
                                System.out.print(" " + seatsforC[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Cseat; z++) {

                                System.out.print("Choose a seat C-: ");
                                int ChCseat = alf.nextInt();
                                seatsforC[ChCseat] = "";

                            }
                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));
                        break;

                }
            }

            if (HolderA == 0 && HolderB > 0 && HolderC > 0) {

                System.out.println("**********************");
                System.out.println("*                    *");
                System.out.println("* Welcome to CinemaJ *");
                System.out.println("*    KIMI NO NAWA    *");
                System.out.println("*                    *");
                System.out.println("**********************");

                System.out.println("Pick a schedule");
                System.out.println("A: THIS SCHED IS FULL");
                System.out.println("B: 1:00pm - 2:30pm");
                System.out.println("C: 3:00pm - 4:30pm");

                System.out.print("Choose Schedule: ");
                String sched = alf.next();

                switch (sched) {
                    case "B":

                        do {

                            System.out.println("Available Seats: " + HolderB);
                            System.out.print("How many?: ");
                            int Bseat = alf.nextInt();
                            HolderB = HolderB - Bseat;

                            for (int x = 0; x < seatsforB.length; x++) {
                                System.out.print(" " + seatsforB[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Bseat; z++) {
                                System.out.print("Choose a seat B-: ");
                                int ChBseat = alf.nextInt();
                                seatsforB[ChBseat] = "";

                            }

                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));

                        break;

                    case "C":

                        do {

                            System.out.println("Available Seats: " + HolderC);
                            System.out.print("How many?: ");
                            int Cseat = alf.nextInt();
                            HolderC = HolderC - Cseat;

                            for (int x = 0; x < seatsforC.length; x++) {
                                System.out.print(" " + seatsforC[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Cseat; z++) {

                                System.out.print("Choose a seat C-: ");
                                int ChCseat = alf.nextInt();
                                seatsforC[ChCseat] = "";

                            }
                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));
                        break;
                }

            }

            if (HolderB == 0 && HolderC > 0 && HolderA > 0) {

                System.out.println("**********************");
                System.out.println("*                    *");
                System.out.println("* Welcome to CinemaJ *");
                System.out.println("*    KIMI NO NAWA    *");
                System.out.println("*                    *");
                System.out.println("**********************");

                System.out.println("Pick a schedule");
                System.out.println("A: 11:00am - 12:30pm");
                System.out.println("B: THIS SCHED IS FULL");
                System.out.println("C: 3:00pm - 4:30pm");

                System.out.print("Choose Schedule: ");
                String sched = alf.next();

                switch (sched) {
                    case "A":

                        do {

                            System.out.println("Available Seats: " + Aseats);
                            System.out.print("How many?: ");
                            int Aseat = alf.nextInt();
                            HolderA = HolderA - Aseat;

                            for (int x = 0; x < seatsforA.length; x++) {
                                System.out.print(" " + seatsforA[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Aseat; z++) {
                                System.out.print("Choose a seat A-: ");
                                int ChAseat = alf.nextInt();
                                seatsforA[ChAseat] = "";

                            }

                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));
                        break;

                    case "C":

                        do {

                            System.out.println("Available Seats: " + Cseats);
                            System.out.print("How many?: ");
                            int Cseat = alf.nextInt();
                            HolderC = HolderC - Cseat;

                            for (int x = 0; x < seatsforC.length; x++) {
                                System.out.print(" " + seatsforC[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Cseat; z++) {

                                System.out.print("Choose a seat C-: ");
                                int ChCseat = alf.nextInt();
                                seatsforC[ChCseat] = "";

                            }
                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));
                        break;
                }

            }

            if (HolderC == 0 && HolderA > 0 && HolderB > 0) {

                System.out.println("**********************");
                System.out.println("*                    *");
                System.out.println("* Welcome to CinemaJ *");
                System.out.println("*    KIMI NO NAWA    *");
                System.out.println("*                    *");
                System.out.println("**********************");

                System.out.println("Pick a schedule");
                System.out.println("A: 11:00am - 12:30pm");
                System.out.println("B: 1:00pm - 2:30pm");
                System.out.println("C: THIS SCHED IS FULL");

                System.out.print("Choose Schedule: ");
                String sched = alf.next();

                switch (sched) {
                    case "A":

                        do {

                            System.out.println("Available Seats: " + Aseats);
                            System.out.print("How many?: ");
                            int Aseat = alf.nextInt();
                            HolderA = HolderA - Aseat;

                            for (int x = 0; x < seatsforA.length; x++) {
                                System.out.print(" " + seatsforA[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Aseat; z++) {
                                System.out.print("Choose a seat A-: ");
                                int ChAseat = alf.nextInt();
                                seatsforA[ChAseat] = "";

                            }

                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));
                        break;

                    case "B":

                        do {

                            System.out.println("Available Seats: " + HolderB);
                            System.out.print("How many?: ");
                            int Bseat = alf.nextInt();
                            HolderB = HolderB - Bseat;

                            for (int x = 0; x < seatsforB.length; x++) {
                                System.out.print(" " + seatsforB[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Bseat; z++) {
                                System.out.print("Choose a seat B-: ");
                                int ChBseat = alf.nextInt();
                                seatsforB[ChBseat] = "";

                            }

                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));

                        break;
                }

            }

            if (HolderA == 0 && HolderB == 0) {

                System.out.println("**********************");
                System.out.println("*                    *");
                System.out.println("* Welcome to CinemaJ *");
                System.out.println("*    KIMI NO NAWA    *");
                System.out.println("*                    *");
                System.out.println("**********************");

                System.out.println("Pick a schedule");
                System.out.println("A: THIS SCHED IS FULL");
                System.out.println("B: THIS SCHED IS FULL");
                System.out.println("C: 3:00pm - 4:30pm");

                System.out.print("Choose Schedule: ");
                String sched = alf.next();

                switch (sched) {
                    case "C":

                        do {

                            System.out.println("Available Seats: " + Cseats);
                            System.out.print("How many?: ");
                            int Cseat = alf.nextInt();
                            HolderC = HolderC - Cseat;

                            for (int x = 0; x < seatsforC.length; x++) {
                                System.out.print(" " + seatsforC[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Cseat; z++) {

                                System.out.print("Choose a seat C-: ");
                                int ChCseat = alf.nextInt();
                                seatsforC[ChCseat] = "";

                            }
                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));
                        break;
                }

            }

            if (HolderA == 0 && HolderB == 0 && HolderC == 0) {

                System.out.println("**********************");
                System.out.println("*                    *");
                System.out.println("* Welcome to CinemaJ *");
                System.out.println("*    KIMI NO NAWA    *");
                System.out.println("*                    *");
                System.out.println("**********************");

                System.out.println("Pick a schedule");
                System.out.println("A: THIS SCHED IS FULL");
                System.out.println("B: THIS SCHED IS FULL");
                System.out.println("C: THIS SCHED IS FULL");

                System.out.println("ALL SCHED ARE FULL TICKETS ARE SOLD OUT!");
                System.exit(0);
            }

            if (HolderB == 0 && HolderC == 0) {

                System.out.println("**********************");
                System.out.println("*                    *");
                System.out.println("* Welcome to CinemaJ *");
                System.out.println("*    KIMI NO NAWA    *");
                System.out.println("*                    *");
                System.out.println("**********************");

                System.out.println("Pick a schedule");
                System.out.println("A: 11:00am - 12:30pm");
                System.out.println("B: THIS SCHED IS FULL");
                System.out.println("C: THIS SCHED IS FULL");

                System.out.print("Choose Schedule: ");
                String sched = alf.next();

                switch (sched) {
                    case "A":

                        do {

                            System.out.println("Available Seats: " + Aseats);
                            System.out.print("How many?: ");
                            int Aseat = alf.nextInt();
                            HolderA = HolderA - Aseat;

                            for (int x = 0; x < seatsforA.length; x++) {
                                System.out.print(" " + seatsforA[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Aseat; z++) {
                                System.out.print("Choose a seat A-: ");
                                int ChAseat = alf.nextInt();
                                seatsforA[ChAseat] = "";

                            }

                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));
                        break;
                }

            }
            if (HolderA == 0 && HolderC == 0) {

                System.out.println("**********************");
                System.out.println("*                    *");
                System.out.println("* Welcome to CinemaJ *");
                System.out.println("*    KIMI NO NAWA    *");
                System.out.println("*                    *");
                System.out.println("**********************");

                System.out.println("Pick a schedule");
                System.out.println("A: THIS SCHED IS FULL");
                System.out.println("B: 1:00pm - 2:30pm");
                System.out.println("C: THIS SCHED IS FULL");

                System.out.print("Choose Schedule: ");
                String sched = alf.next();

                switch (sched) {
                    case "B":

                        do {

                            System.out.println("Available Seats: " + HolderB);
                            System.out.print("How many?: ");
                            int Bseat = alf.nextInt();
                            HolderB = HolderB - Bseat;

                            for (int x = 0; x < seatsforB.length; x++) {
                                System.out.print(" " + seatsforB[x] + " ");
                            }

                            System.out.println();

                            for (int z = 1; z <= Bseat; z++) {
                                System.out.print("Choose a seat B-: ");
                                int ChBseat = alf.nextInt();
                                seatsforB[ChBseat] = "";

                            }

                            System.out.print("TYPE Yes for complete transaction AND TYPE No for Changes: ");
                            ans = alf.next();

                        } while (ans.equalsIgnoreCase("no"));

                        break;
                }

            }

        } while (ans.equalsIgnoreCase("yes"));

    }
}
