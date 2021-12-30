import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class l7q6 {
    public static void main(String[] args) {
        String[][] products = new String[7][3];
        // products[i][0] = ProductID for i-th product
        // products[i][1] = ProductName for i-th product
        // products[i][2] = ProductPrice for i-th product

        // read product data from `product.txt`
        try {
            Scanner input = new Scanner(new FileInputStream("product.txt"));
            for(int i=0; i<products.length; i++) {
                String tmp = input.nextLine();
                products[i] = tmp.split(",");
            }
            input.close();
        }catch (FileNotFoundException e) {
            System.out.println("File is no found");
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String[][] orders = new String[5][5];
        // orders[i][0] = ProductID for i-th product
        // orders[i][1] = ProductName for i-th product
        // orders[i][2] = OrderQuantity for i-th product
        // orders[i][3] = ProductPrice for i-th product
        // orders[i][4] = Total price for i-th product

        // read order
        try {
            Scanner input = new Scanner(new FileInputStream("order.txt"));
            for(int i=0; i<orders.length; i++) {
                String tmp = input.nextLine();
                String[] order = tmp.split(",");
                // order[0] = OrderID
                // order[1] = ProductID
                // order[2] = OrderQuantity
                orders[i][0] = order[1];
                orders[i][2] = order[2];
            }
            input.close();
        }catch (FileNotFoundException e) {
            System.out.println("File is no found");
        }

        // Calculate for each order
        for(int i=0; i<orders.length; i++) {
            for(int j=0; j< products.length; j++) {
                // compare ProductID
                if(orders[i][0].equals(products[j][0])) {
                    // ProductName
                    orders[i][1]=products[j][1];
                    // Product Price
                    orders[i][3]=products[j][2];

                    // calculate price
                    Double price = Double.parseDouble(products[j][2]);
                    int quantity = Integer.parseInt(orders[i][2]);
                    Double total = price*quantity;
                    orders[i][4] = String.format("%.2f", total);
                    break;
                }
            }
        }

        // output
        System.out.printf("%-10s %-25s %8s %15s %10s %n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
        for(int i=0; i< orders.length; i++) {
            System.out.printf("%-10s %-25s %8s %15s %10s %n", orders[i][0], orders[i][1], orders[i][2], orders[i][3], orders[i][4]);
        }
    }
}
