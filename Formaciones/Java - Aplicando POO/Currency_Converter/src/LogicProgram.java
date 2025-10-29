import java.util.InputMismatchException;
import java.util.Scanner;

public class LogicProgram {

    void startProgram(){

        String countryCodes = """
                1.ARS - Argentine Peso            11.GTQ -Guatemalan Quetzal            21.USD - United States Dollar
                2.BOB - Bolivian Boliviano        12.HNL - Honduran Lempira             22.UYU - Uruguayan Peso
                3.BRL - Brazilian Real            13.HTG - Haitian Gourde               23.VES - Venezuelan Bolivar Soberano
                4.CAD - Canadian Dollar           14.JMD - Jamaican Dollar
                5.CLP - Chilean Peso              15.JPY - Japanese Yen
                6.COP - Colombian Peso            16.MXN - Mexican Peso
                7.CRC - Costa Rican Colon         17.NIO - Nicaraguan Cordoba
                8.DOP - Dominican Republic        18.PAB - Panamanian Balboa
                9.EGP - Egypt                     19.PEN - Peruvian sol
                10.EUR - Euro                     20.PYG - Paraguayan Guarani
                """;

        String menu = """
                     Welcome to the exchange app!
                     Select one number:
                     1.Watch country codes
                     2.Exchange currencies
                     3.Check the currency history
                     4.Exit
                     """;
        Scanner scanner = new Scanner(System.in);
        int userSelection = 0;
        APIConnection newConnection = new APIConnection();
        ExchangeRecord newRecord = new ExchangeRecord();

        while (userSelection != 4){

            try {
                System.out.println(menu);
                userSelection = scanner.nextInt();
                //Cleaning the buffer
                scanner.nextLine();

                switch (userSelection){
                    case 1:
                        System.out.println(countryCodes);
                        break;
                    case 2:
                        System.out.println("Select the CODE for the currency to exchange");
                        String codeBase = scanner.nextLine();
                        System.out.println("Select the CODE for the currency you want to exchange to");
                        String targetBase = scanner.nextLine();
                        System.out.println("Select the amount to exchange");
                        double amount = scanner.nextFloat();
                        newRecord.addToList(
                                newConnection.requestCurrencyConnection(codeBase.trim(), targetBase.trim(),
                                        amount), amount);

                        break;
                    case 3:
                        newRecord.watchRecordInformation();
                    case 4:
                        System.out.println("Thanks for using our app!");
                        break;
                    default:
                        System.out.println("Please, choose between one of the three options!\n");
                }
            }catch (NumberFormatException | InputMismatchException  e){
                System.out.println("""
                                ===============================
                                Please, insert a correct value
                                ===============================
                                \n
                                """  );
                //Cleaning the buffer
                scanner.nextLine();
            }catch (Exception e){
                System.out.println("Ops!... SOMETHING WENT WRONG " + e.getMessage());
            }
        }
        scanner.close();
    }
}
