public class Tester {
    public static void main(String[] args) {
//        q1();
//        q2();
//        q3();
        q4();
    }

    public static void q1() {
        PermanentEmployee ali = new PermanentEmployee("Ali", 'A');
        ali.displayInfo();
        PermanentEmployee abu = new PermanentEmployee("Abu", 'B');
        abu.displayInfo();
        PermanentEmployee muthu = new PermanentEmployee("Muthu", 'C');
        muthu.displayInfo();

        ContractStaff siti = new ContractStaff("Siti", 3715);
        siti.displayInfo();
        TemporaryStaff xyz = new TemporaryStaff("XYZ", 12);
        xyz.displayInfo();
    }

    public static void q2() {
//        SubstitutionCipher substitutionCipher = new SubstitutionCipher("input.txt", "output.txt", 3);
//        substitutionCipher.encode();

        SubstitutionCipher substitutionCipher1 = new SubstitutionCipher("output.txt", "input.txt", 3);
        substitutionCipher1.decode();
    }

    public static void q3() {
//        ShuffleCipher shuffleCipher = new ShuffleCipher("input.txt", "output.txt", 2);
//        shuffleCipher.encode();

        ShuffleCipher shuffleCipher1 = new ShuffleCipher("output.txt", "input.txt", 2);
        shuffleCipher1.decode();
    }

    public static void q4() {
//        Appointment appoint1 = new Appointment(2022, 1, 11, 6, 7);
//        appoint1.makeAppointment();
//        Appointment appoint2 = new Appointment(2022, 1, 11, 13, 15);
//        appoint2.makeAppointment();
//        Appointment appoint3 = new Appointment(2022, 1, 11, 16, 19);
//        appoint3.makeAppointment();
//        Appointment appoint4 = new Appointment(2022, 1, 12, 9, 11);
//        appoint4.makeAppointment();
//        Appointment appoint5 = new Appointment(2022, 1, 12, 13, 15);
//        appoint5.makeAppointment();

        //        //clash
        Appointment appoint6 = new Appointment(2022, 1, 11, 12, 14);
        appoint6.makeAppointment();
        Appointment appoint7 = new Appointment(2022, 1, 11, 18, 20);
        appoint7.makeAppointment();
        Appointment appoint8 = new Appointment(2022, 1, 12, 13, 15);
        appoint8.makeAppointment();
        Appointment appoint9 = new Appointment(2022, 1, 12, 12, 16);
        appoint9.makeAppointment();
//        Appointment appoint10 = new Appointment(2022, 1, 11, 17, 18);
//        appoint10.makeAppointment();
    }
}
