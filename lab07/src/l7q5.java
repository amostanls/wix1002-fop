import java.io.*;

public class l7q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("person.dat"));
            try {
                int total = input.readInt();
                String[] name = new String[total];
                int[] age = new int[total];
                Character[] gender = new Character[total];

                // reading data from `person.dat`
                for (int i = 0; i < total; i++) {
                    name[i] = input.readUTF();
                    age[i] = input.readInt();
                    gender[i] = input.readChar();
                }

                // sort indices, or else need to swap three times
                int[] indices = new int[total];
                for(int i=0; i<total; i++)
                    indices[i] = i;

                // sorting
                boolean sorted = false;
                do {
                    sorted = true;
                    for(int i=0; i+1<total; i++) {
                        int cur = indices[i];
                        int nxt = indices[i+1];
                        if(name[cur].compareTo(name[nxt])>0) {
                            // swap
                            int tmp = indices[i];
                            indices[i] = indices[i+1];
                            indices[i+1] = tmp;
                            sorted = false;
                        }
                    }
                }while(!sorted);

                for(int i=0; i<total; i++) {
                    int cur = indices[i];
                    System.out.printf("%-20s %5d %s\n", name[cur], age[cur], (gender[cur] == 'M') ? "Male" : "Female");
                }
            }catch (EOFException e) {
                // EOF == End of file
                // why do we need to catch this exception
                // normally, we check using while(in.hasNextLine()), but here there is a structure
                // prevent if the file structure does not tally
            }
            input.close();
        }catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }catch (IOException e) {
            System.out.println("Error reading from file");
        }
    }
}
