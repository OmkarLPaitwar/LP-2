import java.util.*;

class HospitalExpertSystem {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String symptom;

        System.out.println("=================================");
        System.out.println("   HOSPITAL EXPERT SYSTEM");
        System.out.println("=================================");

        System.out.print("Enter your symptom: ");
        symptom = sc.nextLine().toLowerCase();

        System.out.println("\nExpert System Result:");

        // Rule-Based Decision Making
        if (symptom.contains("fever") ||
                symptom.contains("cold") ||
                symptom.contains("cough")) {

            System.out.println("Possible Disease: Viral Infection");
            System.out.println("Suggested Doctor: General Physician");
        }

        else if (symptom.contains("headache") ||
                symptom.contains("migraine")) {

            System.out.println("Possible Disease: Migraine");
            System.out.println("Suggested Doctor: Neurologist");
        }

        else if (symptom.contains("chest pain")) {

            System.out.println("Possible Disease: Heart Problem");
            System.out.println("Suggested Doctor: Cardiologist");
        }

        else if (symptom.contains("skin") ||
                symptom.contains("rash")) {

            System.out.println("Possible Disease: Skin Allergy");
            System.out.println("Suggested Doctor: Dermatologist");
        }

        else if (symptom.contains("stomach") ||
                symptom.contains("vomiting")) {

            System.out.println("Possible Disease: Gastric Problem");
            System.out.println("Suggested Doctor: Gastroenterologist");
        }

        else {

            System.out.println("Disease not identified.");
            System.out.println("Please consult a General Physician.");
        }

        sc.close();
    }
}